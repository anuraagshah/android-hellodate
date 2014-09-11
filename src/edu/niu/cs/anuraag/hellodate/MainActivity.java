package edu.niu.cs.anuraag.hellodate;

import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener
{

	Button dateBtn;
	TextView dispDate;
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dateBtn = (Button)findViewById(R.id.showDate);
		dispDate = (TextView)findViewById(R.id.date);
		dateBtn.setOnClickListener(this);
		
	}

	
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void onClick(View arg0) 
	{
		//dateBtn.setText(new Date().toString());
		// TODO Auto-generated method stub
		dispDate.setText(new Date().toString());
		
	}

}
