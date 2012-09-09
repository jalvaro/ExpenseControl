package com.jalvaro.expensecontrol.view;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jalvaro.expensecontrol.R;
import com.jalvaro.expensecontrol.controller.ViewController;

public class NewExpenseActivity extends Activity{
	private ListView lv;
	private ArrayAdapter<String> aa;
	
	private static final String TAG = NewExpenseActivity.class.getName();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_expense);
		
		lv = ((ListView) findViewById(R.id.aNewExpense__listView));
		aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>() );
		aa.setNotifyOnChange(true);
		lv.setAdapter(aa);
		(findViewById(R.id.aNewExpense__addImage)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ViewController.startNewParticipantActivityForResult(NewExpenseActivity.this);
			}
		});
		
		(findViewById(R.id.lConfirmation__acceptButton)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		Log.d(TAG, "RequestCode: " + requestCode + ", ResultCode: " + resultCode);
		if (requestCode == ViewController.NEW_PARTICIPANT_REQUEST_CODE) {
			if (resultCode == RESULT_OK) {
				Log.d(TAG, "Add new participant");
				aa.add("Participant " + aa.getCount());
			}
		}
	}
}
