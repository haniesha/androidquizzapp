package com.example.techie2;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Page6 extends Page5 implements OnClickListener {
	RadioButton rb16,rb17,rb18;
	Button b7;
	static String res6="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page6);
		rb16=(RadioButton)findViewById(R.id.rdb16);
		rb17=(RadioButton)findViewById(R.id.rdb17);
		rb18=(RadioButton)findViewById(R.id.rdb18);
		
		
		rb16.setOnClickListener(this);
		rb17.setOnClickListener(this);
		rb18.setOnClickListener(this);
		b7=(Button)findViewById(R.id.b7);
		b7.setOnClickListener(this);
	}

	@Override
	public void onClick(View v5) {
		// TODO Auto-generated method stub
		switch (v5.getId()) {
		case R.id.rdb16:
			res6="Right Answer";
			right++;
			
			break;
		case R.id.rdb17:
			res6="Wrong Answer";
			wrong++;
			break;
		case R.id.rdb18:
			res6="Wrong Answer";
			wrong++;
			break;
		case R.id.b7:
			startActivity(new Intent(Page6.this,Page7.class));
			break;
		default:
			break;
		}
		
		
	}

	

}
