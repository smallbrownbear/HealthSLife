package com.healthlife.activity;

import com.healthlife.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectSportsActivity extends Activity implements OnClickListener {
	
	private Button btnJog;
	private Button btnPushUp;
	private Button btnSitUp;
	private Button btnWalk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_sports);
		
		btnJog=(Button)findViewById(R.id.button_select_jog);
		btnPushUp=(Button)findViewById(R.id.button_select_pushup);
		btnSitUp=(Button)findViewById(R.id.button_select_situp);
		btnWalk=(Button)findViewById(R.id.button_select_walk);
		
		btnWalk.setOnClickListener(this);
		btnPushUp.setOnClickListener(this);
		btnSitUp.setOnClickListener(this);
		btnJog.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_sports, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()){
		
		case R.id.button_select_jog:;
		//intent =new Intent(this,JogActivity.class);
		//startActivity(intent);
		break;
		
		case R.id.button_select_pushup:;
		Intent startPushUp =new Intent(this,com.healthlife.activity.PushUpActivity.class);
		startActivity(startPushUp);
		break;
		
		case R.id.button_select_situp:;
		Intent startSitUp =new Intent(this,com.healthlife.activity.SitUpActivity.class);
		startActivity(startSitUp);
		break;
		
		case R.id.button_select_walk:;
		// startWalk =new Intent(this,com.healthlife.activity.WalkActivity.class);
		//startActivity(startWalk);
		break;
		}
	}
}
