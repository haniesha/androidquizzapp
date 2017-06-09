package com.example.techie2;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page3 extends Page2 implements OnClickListener {
	RadioButton rb7,rb8,rb9;
	Button b4;
	static String res3="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page3);
		rb7=(RadioButton)findViewById(R.id.rdb7);
		rb8=(RadioButton)findViewById(R.id.rdb8);
		rb9=(RadioButton)findViewById(R.id.rdb9);
		
		
		rb7.setOnClickListener(this);
		rb8.setOnClickListener(this);
		rb9.setOnClickListener(this);
		
		b4=(Button)findViewById(R.id.b4);
		b4.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v2) {
		// TODO Auto-generated method stub
		switch (v2.getId()) {
		case R.id.rdb7:
			res3="Wrong Answer";
             wrong++;
			
			break;
		case R.id.rdb8:
			res3="Right Answer";
			right++;
			break;
		case R.id.rdb9:
			res3="Wrong Answer";
			wrong++;
			break;
		case R.id.b4:
			startActivity(new Intent(Page3.this,Page4.class));
			break;
		default:
			break;
		}
		
		
	}

	

}
