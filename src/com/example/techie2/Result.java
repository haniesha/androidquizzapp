package com.example.techie2;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Result extends Page7{
	TextView tr1,tr2,tr3,tr4,tr5,tr6,tr7,tright,twrong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		tr1=(TextView)findViewById(R.id.tres1);
		tr2=(TextView)findViewById(R.id.tres2);
		tr3=(TextView)findViewById(R.id.tres3);
		tr4=(TextView)findViewById(R.id.tres4);
		tr5=(TextView)findViewById(R.id.tres5);
		tr6=(TextView)findViewById(R.id.tres6);
		tr7=(TextView)findViewById(R.id.tres7);
		
		tright=(TextView)findViewById(R.id.noright);
		twrong=(TextView)findViewById(R.id.nowrong);
		
		tr1.setText(res1);
		tr2.setText(res2);
		tr3.setText(res3);
		tr4.setText(res4);
		tr5.setText(res5);
		tr6.setText(res6);
		tr7.setText(res7);
		
		tright.setText(String.valueOf(right));
		twrong.setText(String.valueOf(wrong));
	}

	
}
