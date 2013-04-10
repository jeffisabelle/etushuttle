package com.example.etushuttle;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class RingNerede extends Activity {
	TextView tv;
	double latitude = 0;
	double longitude = 0;
	boolean centered = false;

	private GoogleMap map;
	LocationManager locationManager;

	private static LatLng postLatLon = null;
	Marker place = null;
	int zoom = 15;
	Double myLat;
	Double myLng;
	LatLng myPos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_google_maps);

		Button button = (Button) this.findViewById(R.id.button1);
		button.getBackground().setAlpha(200);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try {
					map.moveCamera(CameraUpdateFactory.newLatLngZoom(postLatLon, zoom));
				} catch(Exception e) {}
			}

		});


		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();
		map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
//		map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

//		myLat = getIntent().getDoubleExtra("latitude", 39.978172);
//		myLng = getIntent().getDoubleExtra("longtitude", 32.712994);
//
//		myPos = new LatLng(myLat, myLng);


		new RequestTask()
				.execute("http://yourserver.com/server.php");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ring_nerede, menu);
		return true;
	}

	class RequestTask extends AsyncTask<String, String, String> {

		@Override
		protected String doInBackground(String... uri) {
			HttpClient httpclient = new DefaultHttpClient();
			HttpResponse response;
			String responseString = null;

			try {
				response = httpclient.execute(new HttpGet(uri[0]));
				StatusLine statusLine = response.getStatusLine();
				if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					response.getEntity().writeTo(out);
					out.close();
					responseString = out.toString();
				} else {
					// Closes the connection.
					response.getEntity().getContent().close();
					throw new IOException(statusLine.getReasonPhrase());
				}
			} catch (ClientProtocolException e) {
				// TODO Handle problems..
			} catch (IOException e) {
				// TODO Handle problems..
			}
			return responseString;
		}

		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			// Do anything with response..

			latitude = Double.parseDouble(result.split("#")[0]);
			longitude = Double.parseDouble(result.split("#")[1]);
			LatLng a = new LatLng(latitude, longitude);
			showCurrentPosition(map, a);


		}
	}



	private LatLng showCurrentPosition(final GoogleMap map, final LatLng biryer) {

		if (place != null)
			place.remove();

		// postLatLon = positions.get(index);
		postLatLon = biryer;

//		place = map.addMarker(new MarkerOptions().position(postLatLon));
		// getCurrentPosition();
		place = map.addMarker(new MarkerOptions()
				.position(postLatLon)
				.title("Servis")
				.snippet("Su an servis burada")
				.icon(BitmapDescriptorFactory
						.fromResource(R.drawable.school_bus_icon)));

		if(!centered) {
			map.moveCamera(CameraUpdateFactory.newLatLngZoom(postLatLon, zoom));

			map.setOnCameraChangeListener(new OnCameraChangeListener() {

				@Override
				public void onCameraChange(CameraPosition pos) {
					// TODO Auto-generated method stub
					if (pos.zoom != zoom) {
						zoom = (int) pos.zoom;
					}

					map.moveCamera(CameraUpdateFactory.newCameraPosition(pos));
				}
			});
		}
		centered = true;

		new RequestTask()
				.execute("http://yourserver.com/server.php");

		return postLatLon;
	}

//	private LatLng getCurrentPosition() {
//		// location details
//		locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
//		Criteria criteria = new Criteria();
//		String bestProvider = locationManager.getBestProvider(criteria, false);
//
//		Location location = locationManager.getLastKnownLocation(bestProvider);
//		LatLng myLocation = new LatLng(location.getLatitude(),
//				location.getLongitude());
//
//		return myLocation;
//	}
}
