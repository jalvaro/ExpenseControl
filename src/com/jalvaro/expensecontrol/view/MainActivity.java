package com.jalvaro.expensecontrol.view;

import com.jalvaro.expensecontrol.controller.ViewController;
import com.jalvaro.expensecontrol.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		((Button) findViewById(R.id.aMain__new_payment)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ViewController.startNewExpenseActivity(MainActivity.this);
			}
		});
	}
}
