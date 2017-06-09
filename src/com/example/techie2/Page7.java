package com.example.techie2;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page7 extends Page6 implements OnClickListener {
	RadioButton rb19,rb20,rb21;
	Button b8;
	static String res7="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page7);
		rb19=(RadioButton)findViewById(R.id.rdb19);
		rb20=(RadioButton)findViewById(R.id.rdb20);
		rb21=(RadioButton)findViewById(R.id.rdb21);
		
		
		rb19.setOnClickListener(this);
		rb20.setOnClickListener(this);
		rb21.setOnClickListener(this);
		b8=(Button)findViewById(R.id.b8);
		b8.setOnClickListener(this);
	}

	@Override
	public void onClick(View v6) {
		// TODO Auto-generated method stub
		switch (v6.getId()) {
		case R.id.rdb19:
			res7="Wrong Answer";
			wrong++;
			
			break;
		case R.id.rdb20:
			res7="Wrong Answer";
			wrong++;
			break;
		case R.id.rdb21:
			res7="Right Answer";
			right++;
			break;
		case R.id.b8:
			startActivity(new Intent(Page7.this,Result.class));
			break;
		default:
			break;
		}
		
	}

	

}
