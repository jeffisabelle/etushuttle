package com.example.etushuttle;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class SemtSaatleri extends ListActivity {

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
	
	private void populateList(ArrayList<HashMap<String, String>> list) {		
		HashMap<String, String> temp0= new HashMap<String, String>();
		temp0.put("guzergah","Oran/Yıldız/Cankaya > TOBB ETÜ");
		temp0.put("saat", "Hareket Saati: 07:30");
		list.add(temp0);
		
		HashMap<String, String> temp1= new HashMap<String, String>();
		temp1.put("guzergah","İlker/Oran Şehri > TOBB ETÜ");
		temp1.put("saat", "Hareket Saati: 07:30");
		list.add(temp1);
		
		HashMap<String, String> temp2= new HashMap<String, String>();
		temp2.put("guzergah","Birlik > TOBB ETÜ");
		temp2.put("saat", "Hareket Saati: 07:30");
		list.add(temp2);
		
		HashMap<String, String> temp3= new HashMap<String, String>();
		temp3.put("guzergah","K.Konaklar > TOBB ETÜ");
		temp3.put("saat", "Hareket Saati: 07:30");
		list.add(temp3);
		
		HashMap<String, String> temp4= new HashMap<String, String>();
		temp4.put("guzergah","A.Paşa > TOBB ETÜ");
		temp4.put("saat", "Hareket Saati: 07:30");
		list.add(temp4);
		
		HashMap<String, String> temp5= new HashMap<String, String>();
		temp5.put("guzergah","Konutkent > TOBB ETÜ");
		temp5.put("saat", "Hareket Saati: 07:30");
		list.add(temp5);
		
		HashMap<String, String> temp6= new HashMap<String, String>();
		temp6.put("guzergah","Ümitköy/Çay Yolu > TOBB ETÜ");
		temp6.put("saat", "Hareket Saati: 07:30");
		list.add(temp6);
		
		HashMap<String, String> temp7= new HashMap<String, String>();
		temp7.put("guzergah","Yaşamkent > TOBB ETÜ");
		temp7.put("saat", "Hareket Saati: 07:30");
		list.add(temp7);
		
		HashMap<String, String> temp8= new HashMap<String, String>();
		temp8.put("guzergah","Ümitköy 2 > TOBB ETÜ");
		temp8.put("saat", "Hareket Saati: 07:30");
		list.add(temp8);
		
		HashMap<String, String> temp9= new HashMap<String, String>();
		temp9.put("guzergah","Tunalı > TOBB ETÜ");
		temp9.put("saat", "Hareket Saati: 07:30");
		list.add(temp9);
		
		HashMap<String, String> temp10= new HashMap<String, String>();
		temp10.put("guzergah","K.Esat/Seyran > TOBB ETÜ");
		temp10.put("saat", "Hareket Saati: 07:30");
		list.add(temp10);
		
		HashMap<String, String> temp11= new HashMap<String, String>();
		temp11.put("guzergah","Hoşdere 2 > TOBB ETÜ");
		temp11.put("saat", "Hareket Saati: 07:30");
		list.add(temp11);
		
		HashMap<String, String> temp12= new HashMap<String, String>();
		temp12.put("guzergah","Hoşdere > TOBB ETÜ");
		temp12.put("saat", "Hareket Saati: 07:30");
		list.add(temp12);
		
		HashMap<String, String> temp13= new HashMap<String, String>();
		temp13.put("guzergah","Sokullu > TOBB ETÜ");
		temp13.put("saat", "Hareket Saati: 07:30");
		list.add(temp13);
		
		HashMap<String, String> temp14= new HashMap<String, String>();
		temp14.put("guzergah","Gölbaşı/İncek > TOBB ETÜ");
		temp14.put("saat", "Hareket Saati: 07:30");
		list.add(temp14);
		
		HashMap<String, String> temp15= new HashMap<String, String>();
		temp15.put("guzergah","Dikmen Sinan Caddesi > TOBB ETÜ");
		temp15.put("saat", "Hareket Saati: 07:30");
		list.add(temp15);
		
		HashMap<String, String> temp16= new HashMap<String, String>();
		temp16.put("guzergah","Dikmen > TOBB ETÜ");
		temp16.put("saat", "Hareket Saati: 07:30");
		list.add(temp16);
		
		HashMap<String, String> temp17= new HashMap<String, String>();
		temp17.put("guzergah","Aydınlıkevler > TOBB ETÜ");
		temp17.put("saat", "Hareket Saati: 07:30");
		list.add(temp17);
		
		HashMap<String, String> temp18= new HashMap<String, String>();
		temp18.put("guzergah","İncirli/B.evler/K.ören > TOBB ETÜ");
		temp18.put("saat", "Hareket Saati: 07:30");
		list.add(temp18);
		
		HashMap<String, String> temp19= new HashMap<String, String>();
		temp19.put("guzergah","K.ören/Subayevleri > TOBB ETÜ");
		temp19.put("saat", "Hareket Saati: 07:30");
		list.add(temp19);
		
		HashMap<String, String> temp20= new HashMap<String, String>();
		temp20.put("guzergah","İncirli/Sanatoryum > TOBB ETÜ");
		temp20.put("saat", "Hareket Saati: 07:30");
		list.add(temp20);
		
		HashMap<String, String> temp21= new HashMap<String, String>();
		temp21.put("guzergah","Eryaman 1-2 > TOBB ETÜ");
		temp21.put("saat", "Hareket Saati: 07:30");
		list.add(temp21);
		
		HashMap<String, String> temp22= new HashMap<String, String>();
		temp22.put("guzergah","Eryaman 3-4-5 > TOBB ETÜ");
		temp22.put("saat", "Hareket Saati: 07:30");
		list.add(temp22);
		
		HashMap<String, String> temp23= new HashMap<String, String>();
		temp23.put("guzergah","Mamak/Kayaş/Akköprü > TOBB ETÜ");
		temp23.put("saat", "Hareket Saati: 07:30");
		list.add(temp23);
		
		HashMap<String, String> temp24= new HashMap<String, String>();
		temp24.put("guzergah","Elvankent/Etimesgut > TOBB ETÜ");
		temp24.put("saat", "Hareket Saati: 07:30");
		list.add(temp24);
		
		HashMap<String, String> temp25= new HashMap<String, String>();
		temp25.put("guzergah","Sincan/Fatih > TOBB ETÜ");
		temp25.put("saat", "Hareket Saati: 07:30");
		list.add(temp25);
		
		HashMap<String, String> temp26= new HashMap<String, String>();
		temp26.put("guzergah","Çiğdem Mah. > TOBB ETÜ");
		temp26.put("saat", "Hareket Saati: 07:40");
		list.add(temp26);
		
		HashMap<String, String> temp27= new HashMap<String, String>();
		temp27.put("guzergah","Yüzüncüyıl > TOBB ETÜ");
		temp27.put("saat", "Hareket Saati: 07:40");
		list.add(temp27);
		
		HashMap<String, String> temp28= new HashMap<String, String>();
		temp28.put("guzergah","Demetevler > TOBB ETÜ");
		temp28.put("saat", "Hareket Saati: 07:40");
		list.add(temp28);
		
		HashMap<String, String> temp29= new HashMap<String, String>();
		temp29.put("guzergah","Y.mahalle > TOBB ETÜ");
		temp29.put("saat", "Hareket Saati: 07:40");
		list.add(temp29);
		
		HashMap<String, String> temp30= new HashMap<String, String>();
		temp30.put("guzergah","Etlik > TOBB ETÜ");
		temp30.put("saat", "Hareket Saati: 07:40");
		list.add(temp30);
		
		HashMap<String, String> temp31= new HashMap<String, String>();
		temp31.put("guzergah","Cevizlidere > TOBB ETÜ");
		temp31.put("saat", "Hareket Saati: 07:40");
		list.add(temp31);
		
		HashMap<String, String> temp32= new HashMap<String, String>();
		temp32.put("guzergah","Balgat/Öveçler > TOBB ETÜ");
		temp32.put("saat", "Hareket Saati: 07:45");
		list.add(temp32);
		
		HashMap<String, String> temp33= new HashMap<String, String>();
		temp33.put("guzergah","Mesa yolu > TOBB ETÜ");
		temp33.put("saat", "Hareket Saati: 07:45");
		list.add(temp33);
		
		HashMap<String, String> temp34= new HashMap<String, String>();
		temp34.put("guzergah","Batıkent > TOBB ETÜ");
		temp34.put("saat", "Hareket Saati: 07:45");
		list.add(temp34);
		
		HashMap<String, String> temp35= new HashMap<String, String>();
		temp35.put("guzergah","Batıkent-2 > TOBB ETÜ");
		temp35.put("saat", "Hareket Saati: 07:45");
		list.add(temp35);
		
		HashMap<String, String> temp36= new HashMap<String, String>();
		temp36.put("guzergah","Batıkent/İlk Yerleşim > TOBB ETÜ");
		temp36.put("saat", "Hareket Saati: 07:45");
		list.add(temp36);
		
		HashMap<String, String> temp37= new HashMap<String, String>();
		temp37.put("guzergah","Bilkent/M.Kemal Mahallesi > TOBB ETÜ");
		temp37.put("saat", "Hareket Saati: 08:10");
		list.add(temp37);
		
		HashMap<String, String> temp38= new HashMap<String, String>();
		temp38.put("guzergah","Dikimevi/Sıhhıye > TOBB ETÜ");
		temp38.put("saat", "Hareket Saati: 08:05");
		list.add(temp38);
		
		HashMap<String, String> temp39= new HashMap<String, String>();
		temp39.put("guzergah","Tunus/Milli Kütüphane > TOBB ETÜ");
		temp39.put("saat", "Hareket Saati: 08:05");
		list.add(temp39);
		
		HashMap<String, String> temp40= new HashMap<String, String>();
		temp40.put("guzergah","Balgat Yurtlar > TOBB ETÜ");
		temp40.put("saat", "Hareket Saati: 08:10");
		list.add(temp40);
		
		HashMap<String, String> temp41= new HashMap<String, String>();
		temp41.put("guzergah","Milli Kütüp/Armada > TOBB ETÜ");
		temp41.put("saat", "Hareket Saati: 08:10");
		list.add(temp41);
		
		HashMap<String, String> temp42= new HashMap<String, String>();
		temp42.put("guzergah","Dikimevi/Sıhhıye > TOBB ETÜ");
		temp42.put("saat", "Hareket Saati: 08:00");
		list.add(temp42);		
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.semt_saatleri, menu);
//		return true;
//	}

}
