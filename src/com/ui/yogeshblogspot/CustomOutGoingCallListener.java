package com.ui.yogeshblogspot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomOutGoingCallListener extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		String number=intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER).toString();//Getting the Contact no in which call is initiated
		
		
			setResultData(null);//Canceling call operation 
			Toast.makeText(context, "This call is not Allowed", Toast.LENGTH_LONG).show();
		
	}

}