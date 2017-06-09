package com.example.techie2;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page1 extends Activity implements OnClickListener {
	RadioButton rb1,rb2,rb3;
	Button b2;
	static String res1="";
	static int right=0;
	static int wrong=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page1);
		
		rb1=(RadioButton)findViewById(R.id.rdb1);
		rb2=(RadioButton)findViewById(R.id.rdb2);
		rb3=(RadioButton)findViewById(R.id.rdb3);
		
		
		rb1.setOnClickListener(this);
		rb2.setOnClickListener(this);
		rb3.setOnClickListener(this);
		
		
		b2=(Button)findViewById(R.id.b2);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.rdb1:
			res1="Wrong Answer";
			wrong++;
			
			break;
		case R.id.rdb2:
			res1="Wrong Answer";
			wrong++;
			break;
		case R.id.rdb3:
			res1="Right Answer";
			right++;
			break;
		case R.id.b2:
			startActivity(new Intent(Page1.this,Page2.class));
			break;
		default:
			break;
		}
		
		
	}

	
}
