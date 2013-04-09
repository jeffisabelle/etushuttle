package com.example.etushuttle;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class RingSaatleri extends ListActivity {	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		final ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		populateList(list);

		SimpleAdapter adapter = new SimpleAdapter(this, list,
				R.layout.custom_row_view, 
				new String[] { "guzergah", "saat" },
				new int[] { R.id.text1, R.id.text2 });

		setListAdapter(adapter);
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
				
		Intent anIntent = new Intent(RingSaatleri.this, HaritadaGoster.class);
		anIntent.putExtra("id", id);		
		startActivity(anIntent);
	}
	
	private void populateList(ArrayList<HashMap<String, String>> list) {

		HashMap<String, String> temp = new HashMap<String, String>();
		temp.put("guzergah", "Bahceli > TOBB ETU");
		temp.put("saat", "Hareket Saati: 08:10");
		list.add(temp);
		
		HashMap<String, String> temp1 = new HashMap<String, String>();
		temp1.put("guzergah", "Bahceli > TOBB ETU");
		temp1.put("saat", "Hareket Saati: 08:15");
		list.add(temp1);		
		
		HashMap<String, String> temp2 = new HashMap<String, String>();
		temp2.put("guzergah", "Bahceli > TOBB ETU");
		temp2.put("saat", "Hareket Saati: 08:30");
		list.add(temp2);
		
		HashMap<String, String> temp3 = new HashMap<String, String>();
		temp3.put("guzergah", "Bahceli > TOBB ETU");
		temp3.put("saat", "Hareket Saati: 09:05");
		list.add(temp3);
		
		HashMap<String, String> temp4 = new HashMap<String, String>();
		temp4.put("guzergah", "TOBB ETU > Bahceli");
		temp4.put("saat", "Hareket Saati: 10:30");
		list.add(temp4);
		
		HashMap<String, String> temp5 = new HashMap<String, String>();
		temp5.put("guzergah", "Bahceli > TOBB ETU");
		temp5.put("saat", "Hareket Saati: 10:45");
		list.add(temp5);
		
		HashMap<String, String> temp6 = new HashMap<String, String>();
		temp6.put("guzergah", "TOBB ETU > Bahceli");
		temp6.put("saat", "Hareket Saati: 12:05");
		list.add(temp6);
		
		HashMap<String, String> temp7 = new HashMap<String, String>();
		temp7.put("guzergah", "Bahceli > TOBB ETU");
		temp7.put("saat", "Hareket Saati: 12:15");
		list.add(temp7);
				
		HashMap<String, String> temp8 = new HashMap<String, String>();
		temp8.put("guzergah", "TOBB ETU > Bahceli/Kutuphane/Kizilay");
		temp8.put("saat", "Hareket Saati: 12:35");
		list.add(temp8);
		
		HashMap<String, String> temp9 = new HashMap<String, String>();
		temp9.put("guzergah", "Kizilay/Kutuphane/Bahceli > TOBB ETU");
		temp9.put("saat", "Hareket Saati: 12:50");
		list.add(temp9);
		
		HashMap<String, String> temp10 = new HashMap<String, String>();
		temp10.put("guzergah", "TOBB ETU > Bahceli/Kutuphane/Kizilay");
		temp10.put("saat", "Hareket Saati: 13:00");
		list.add(temp10);
		
		HashMap<String, String> temp11 = new HashMap<String, String>();
		temp11.put("guzergah", "Kizilay/Kutuphane/Bahceli > TOBB ETU");
		temp11.put("saat", "Hareket Saati: 13:20");
		list.add(temp11);
		
		HashMap<String, String> temp12 = new HashMap<String, String>();
		temp12.put("guzergah", "TOBB ETU > Bahceli");
		temp12.put("saat", "Hareket Saati: 14:05");
		list.add(temp12);
		
		HashMap<String, String> temp13 = new HashMap<String, String>();
		temp13.put("guzergah", "Bahceli > TOBB ETU");
		temp13.put("saat", "Hareket Saati: 14:15");
		list.add(temp13);
		
		HashMap<String, String> temp14 = new HashMap<String, String>();
		temp14.put("guzergah", "TOBB ETU > Sihhiye");
		temp14.put("saat", "Hareket Saati: 14:45");
		list.add(temp14);
		
		HashMap<String, String> temp15 = new HashMap<String, String>();
		temp15.put("guzergah", "TOBB ETU > Bahceli");
		temp15.put("saat", "Hareket Saati: 14:45");
		list.add(temp15);
		
		HashMap<String, String> temp16 = new HashMap<String, String>();
		temp16.put("guzergah", "TOBB ETU > Kizilay");
		temp16.put("saat", "Hareket Saati: 14:45");
		list.add(temp16);
		
		HashMap<String, String> temp17 = new HashMap<String, String>();
		temp17.put("guzergah", "Bahceli > TOBB ETU");
		temp17.put("saat", "Hareket Saati: 14:50");
		list.add(temp17);
		
		HashMap<String, String> temp18 = new HashMap<String, String>();
		temp18.put("guzergah", "TOBB ETU > Sihhiye");
		temp18.put("saat", "Hareket Saati: 15:45");
		list.add(temp18);
		
		HashMap<String, String> temp19 = new HashMap<String, String>();
		temp19.put("guzergah", "TOBB ETU > Kizilay");
		temp19.put("saat", "Hareket Saati: 15:45");
		list.add(temp19);
		
		HashMap<String, String> temp20 = new HashMap<String, String>();
		temp20.put("guzergah", "TOBB ETU > Bahceli");
		temp20.put("saat", "Hareket Saati: 15:45");
		list.add(temp20);
		
		HashMap<String, String> temp21 = new HashMap<String, String>();
		temp21.put("guzergah", "TOBB ETU > Bahceli");
		temp21.put("saat", "Hareket Saati: 16:20");
		list.add(temp21);
		
		HashMap<String, String> temp22 = new HashMap<String, String>();
		temp22.put("guzergah", "Bahceli > TOBB ETU");
		temp22.put("saat", "Hareket Saati: 16:30");
		list.add(temp22);
		
		HashMap<String, String> temp23 = new HashMap<String, String>();
		temp23.put("guzergah", "TOBB ETU > Bahceli");
		temp23.put("saat", "Hareket Saati: 17:00");
		list.add(temp23);
		
		HashMap<String, String> temp24 = new HashMap<String, String>();
		temp24.put("guzergah", "TOBB ETU > Bahceli");
		temp24.put("saat", "Hareket Saati: 17:30");
		list.add(temp24);
		
		HashMap<String, String> temp25 = new HashMap<String, String>();
		temp25.put("guzergah", "TOBB ETU > Bahceli");
		temp25.put("saat", "Hareket Saati: 18:00");
		list.add(temp25);		
	}


//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.ring_saatleri, menu);
//		return true;
//	}

}
