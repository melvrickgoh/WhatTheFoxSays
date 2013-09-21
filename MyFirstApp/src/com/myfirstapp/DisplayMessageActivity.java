package com.myfirstapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	
	@SuppressLint("NewApi")
	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Get message from intent
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		//Create the text view
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		
		//Set the text view as the activity layout
		setContentView(textView);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
			
			switch(item.getItemId()) {
				case R.id.action_search:
					//openSearch();
					return true;
				case R.id.action_settings:
					//openSettings();
					return true;
				default:
					return super.onOptionsItemSelected(item);
		}
		//return super.onOptionsItemSelected(item);
	}

}
