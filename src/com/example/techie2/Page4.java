package com.example.techie2;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page4 extends Page3 implements OnClickListener {
	RadioButton rb10,rb11,rb12;
	Button b5;
	static String res4="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page4);
		
		rb10=(RadioButton)findViewById(R.id.rdb10);
		rb11=(RadioButton)findViewById(R.id.rdb11);
		rb12=(RadioButton)findViewById(R.id.rdb12);
		
		
		rb10.setOnClickListener(this);
		rb11.setOnClickListener(this);
		rb12.setOnClickListener(this);
		b5=(Button)findViewById(R.id.b5);
		b5.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v3) {
		// TODO Auto-generated method stub
		switch (v3.getId()) {
		case R.id.rdb10:
			res4="Wrong Answer";
			wrong++;
			
			break;
		case R.id.rdb11:
			res4="Wrong Answer";
			wrong++;
			break;
		case R.id.rdb12:
			res4="Right Answer";
			right++;
			break;
		case R.id.b5:
			startActivity(new Intent(Page4.this,Page5.class));
			break;
		default:
			break;
		}
		
	}

	
	

}
