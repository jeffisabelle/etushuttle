package com.example.etushuttle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	LocationManager locationManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		Button ring_saatleri = (Button) this.findViewById(R.id.ring_saatler);
		Button semt_saatleri = (Button) this.findViewById(R.id.semt_saatler);
		Button ring_nerede = (Button) this.findViewById(R.id.ring_nerede);

		final Intent intent = new Intent(MainActivity.this, RingSaatleri.class);
		ring_saatleri.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(intent);
			}
		});

		final Intent intent2 = new Intent(MainActivity.this, SemtSaatleri.class);
		semt_saatleri.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(intent2);
			}
		});

		final Intent intent3 = new Intent(MainActivity.this, RingNerede.class);
		ring_nerede.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				if (isNetworkAvailable()) {

					
//					LatLng pos = getCurrentPosition();
//					final Double lat = pos.latitude;
//					final Double lng = pos.longitude;

//					intent3.putExtra("latitude", lat);
//					intent3.putExtra("longtitude", lng);

					startActivity(intent3);

				} else {

					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
					alertDialogBuilder.setTitle("Üzgünüz..");
					alertDialogBuilder
							.setMessage(
									"Uygulamayý kullanabilmek için internet baðlantýnýzýn aktif olmasý gerekmektedir")
							.setCancelable(false)
							.setPositiveButton("Tamam",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											dialog.cancel();
										}
									});

					AlertDialog alertDialog = alertDialogBuilder.create();
					alertDialog.show();
				}

			}
		});

	}

	private boolean isNetworkAvailable() {
	    ConnectivityManager connectivityManager 
	         = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    return activeNetworkInfo != null;
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
//		// map.addMarker(new MarkerOptions()
//		// .position(myLocation)
//		// .title("Yeriniz")
//		// .snippet("Þu an buradasýnýz."));
//
//		return myLocation;
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
