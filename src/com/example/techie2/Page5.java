package com.example.techie2;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page5 extends Page4 implements OnClickListener {
	RadioButton rb13,rb14,rb15;
	Button b6;
	static String res5="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page5);
		rb13=(RadioButton)findViewById(R.id.rdb13);
		rb14=(RadioButton)findViewById(R.id.rdb14);
		rb15=(RadioButton)findViewById(R.id.rdb15);
		
		
		rb13.setOnClickListener(this);
		rb14.setOnClickListener(this);
		rb15.setOnClickListener(this);
		b6=(Button)findViewById(R.id.b6);
		b6.setOnClickListener(this);
	}

	@Override
	public void onClick(View v4) {
		// TODO Auto-generated method stub
		switch (v4.getId()) {
		case R.id.rdb13:
			res5="Wrong Answer";
			wrong++;
			
			break;
		case R.id.rdb14:
			res5="Right Answer";
			right++;
			break;
		case R.id.rdb15:
			res5="Wrong Answer";
			wrong++;
			break;
		case R.id.b6:
			startActivity(new Intent(Page5.this,Page6.class));
			break;
		default:
			break;
		}
		
		
	}


}
