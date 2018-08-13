package com.example.zforw.intent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intent2 extends Activity implements View.OnClickListener {

	private Button btn2;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);
		btn2 = (Button)findViewById(R.id.button2);
		btn2.setOnClickListener(this);
	}
	@Override
	public void onClick(View v){
		finish();
	}
}
