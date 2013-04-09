package com.example.etushuttle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class HaritadaGoster extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.image_and_direction);
		
		int id = (int) getIntent().getLongExtra("id", 266);
		
		ImageView vi = (ImageView) findViewById(R.id.imageView1);
		TextView tv = (TextView) findViewById(R.id.textView1);
		
		if (id < 4 || id == 5 || id == 7 || id == 13 || id == 17 || id == 22) {
			vi.setImageResource(R.drawable.bahceli_to_tobb);
			tv.setText("Bahcelievler -> Emek Ankaray Duragi -> Armada -> TOBB ETU");
		}
		else if (id == 4 || id == 6 || id == 12 || id == 15 || id == 20 || id == 21 || 22 < id) {
			vi.setImageResource(R.drawable.tobb_to_bahceli);
			tv.setText("TOBB ETU -> Congresium -> Bahcelievler");
		}
		else if (id == 8 || id == 10) {
			vi.setImageResource(R.drawable.bahceli_ring);
			tv.setText("TOBB ETU -> Bahcelievler -> Emek Ankaray Duragi -> Milli Kutuphane -> Kizilay/Tunus");
		}
		else if (id == 9 || id == 11) {
			vi.setImageResource(R.drawable.bahceli_ring);
			tv.setText("Bu guzergahi bilmiyorum");
		}
		else if (id == 14 || id == 18) {
			vi.setImageResource(R.drawable.bahceli_ring);
			tv.setText("Bu guzergahi bilmiyorum");
		}
		else {
			vi.setImageResource(R.drawable.bahceli_ring);
		}
		
		
		
	}


}
