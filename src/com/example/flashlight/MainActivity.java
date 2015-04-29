package com.example.flashlight;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener{

	ToggleButton tb;
	RelativeLayout rl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rl = (RelativeLayout) findViewById(R.id.rl);
		tb = (ToggleButton) findViewById(R.id.tb);
		tb.setOnCheckedChangeListener(this);
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		//ToggleButton ttb = (ToggleButton)buttonView;
		if(isChecked){
			rl.setBackgroundColor(Color.WHITE);
		}else{
			rl.setBackgroundColor(Color.BLACK);
		}
	}
}
