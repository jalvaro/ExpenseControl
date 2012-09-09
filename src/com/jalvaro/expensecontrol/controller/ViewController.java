package com.jalvaro.expensecontrol.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.jalvaro.expensecontrol.view.NewExpenseActivity;
import com.jalvaro.expensecontrol.view.NewParticipantActivity;

public class ViewController {
	public static final int NEW_PARTICIPANT_REQUEST_CODE = 100;
	
	public static final void startNewExpenseActivity(Context context) {
		Intent i = new Intent(context, NewExpenseActivity.class);
		context.startActivity(i);
	}
	
	public static final void startNewParticipantActivityForResult(Context context) {
		Intent i = new Intent(context, NewParticipantActivity.class);
		
		((Activity) context).startActivityForResult(i, NEW_PARTICIPANT_REQUEST_CODE);
	}
}
