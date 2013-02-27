package com.example.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

public class CalculateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent= getIntent();
		String string= intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//		String outMessage = string;
		String outMessage=""+calculate(string);
		TextView tV=new TextView(this);
		tV.setTextSize(50);
		tV.setText(outMessage);
		System.out.println(outMessage + "  <-outmessage");
		setContentView(tV);
		
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	public int calculate(String msg){
		msg.trim();
		System.out.println(msg);
		StringBuilder sb=new StringBuilder();
		int number=1;
		for(int i=0;i<msg.length();i++){
			if(msg.charAt(i)==','){
				number*=Integer.parseInt(sb.toString().trim());
				sb=new StringBuilder();
			}else{
				sb.append(msg.charAt(i));
			}
		}
		number*=Integer.parseInt(sb.toString().trim());
		return number;
	}

}
