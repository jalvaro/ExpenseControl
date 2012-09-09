package com.jalvaro.expensecontrol.view;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.jalvaro.expensecontrol.R;

public class NewParticipantActivity extends Activity{

	private static final String TAG = NewExpenseActivity.class.getName();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_participant);
		
		(findViewById(R.id.lConfirmation__acceptButton)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "returning RESULT_OK: " + RESULT_OK);
				setResult(RESULT_OK);
				finish();
			}
		});
		
		(findViewById(R.id.lConfirmation__cancelButton)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
