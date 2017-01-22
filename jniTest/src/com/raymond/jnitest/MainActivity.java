package com.raymond.jnitest;

import com.raymond.jniexample.Testjni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	static {
		System.loadLibrary("jniTest");
	}
	private TextView tvx,tvy,tvs;
	private Button bt_add;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tvx=(TextView) findViewById(R.id.tvx);
		tvy=(TextView) findViewById(R.id.tvy);
		tvs=(TextView) findViewById(R.id.tvs);
		
		bt_add=(Button) findViewById(R.id.btn_add);
		
		bt_add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			int x=Integer.valueOf(tvx.getText().toString());	
			int y=Integer.valueOf(tvy.getText().toString());	
			int sum=0;
			
			Testjni jni=new Testjni();
			
			boolean flag=jni.init();
			if(flag){
				sum=jni.add(x, y);
			}
			bt_add.setText(String.valueOf(sum));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}
