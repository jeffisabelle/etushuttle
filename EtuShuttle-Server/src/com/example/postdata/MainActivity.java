package com.example.postdata;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	public LocationManager lm;
	public String prov;
	public double longitude = 0;
	public double latitude = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		new DoPostRequest().execute();
		lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		Criteria criteria = new Criteria();
		prov = lm.getBestProvider(criteria, false);	
		lm.requestLocationUpdates(prov, 3000, 10, new MyLocationListener());
		
		new DoPostRequest().execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class DoPostRequest extends AsyncTask<String, Integer, String> {

		
		@Override
		protected String doInBackground(String... arg0) {
			// TODO Auto-generated method stub

			try {

				Location location = lm.getLastKnownLocation(prov);				
				
				if(location != null) {
					longitude = location.getLongitude();
					latitude = location.getLatitude();	
				} else {
					Log.d("postdata", "couldn't get provider");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				Log.d("postdata", "lm error");
			}

			// Create a new HttpClient and Post Header
			HttpClient httpclient = new DefaultHttpClient();

			HttpPost httppost = new HttpPost("http://youserver.com/server.php");

			try {				
				if(longitude > 1 || latitude > 1) {
					String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());		
					
					// Add your data								
					List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(
							2);
					nameValuePairs.add(new BasicNameValuePair("longitude",
							longitude + ""));
					nameValuePairs.add(new BasicNameValuePair("latitude", latitude
							+ ""));
					nameValuePairs.add(new BasicNameValuePair("dateTime", timeStamp));
					httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

					// Execute HTTP Post Request
					HttpResponse response = httpclient.execute(httppost);
				}

			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				Log.d("postdata", "first");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Log.d("postdata", "second");
			}

			return null;
		}

		

	}
	
	private class MyLocationListener implements LocationListener {

		@Override
		public void onLocationChanged(Location location) {
			// TODO Auto-generated method stub
//			longitude = location.getLongitude();
//			latitude = location.getLatitude();
//			this.execute();
			
			new DoPostRequest().execute();
			
		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}

    }

}
