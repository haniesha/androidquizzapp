package com.example.techie2;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b = (Button)findViewById(R.id.b1);
		b.setOnClickListener(this);
		
	}

	

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent jan=new Intent(MainActivity.this,Page1.class);
		startActivity(jan);
		
	}

}
