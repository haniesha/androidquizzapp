package com.example.techie2;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page2 extends Page1 implements OnClickListener {
	RadioButton rb4,rb5,rb6;
	Button b3;
	
	
	static String res2="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page2);
		
		rb4=(RadioButton)findViewById(R.id.rdb4);
		rb5=(RadioButton)findViewById(R.id.rdb5);
		rb6=(RadioButton)findViewById(R.id.rdb6);
		
		
		rb4.setOnClickListener(this);
		rb5.setOnClickListener(this);
		rb6.setOnClickListener(this);
		
		
		b3=(Button)findViewById(R.id.b3);
		b3.setOnClickListener(this);
	}

	

	@Override
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		switch (v1.getId()) {
		case R.id.rdb4:
			res2="Right Answer";
			right++;
			
			break;
		case R.id.rdb5:
			res2="Wrong Answer";
			wrong++;
			break;
		case R.id.rdb6:
			res2="Wrong Answer";
			wrong++;
			break;
		case R.id.b3:
			startActivity(new Intent(Page2.this,Page3.class));
			break;
		default:
			break;
		}
		
	}

}
