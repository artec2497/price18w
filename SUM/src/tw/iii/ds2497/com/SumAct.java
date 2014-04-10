package tw.iii.ds2497.com;


import tw.iii.ds2497.com.R;
import tw.iii.ds2497.com.R.id;
import tw.iii.ds2497.com.R.layout;
import tw.iii.ds2497.com.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SumAct extends Activity
{

	public CCustomer cust = new CCustomer();
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sum);
		InitialComponent();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sum, menu);
		return true;
	}

	
	
	
	
	OnClickListener btntest_click = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			showmeinfo.setText(cust.Name[0]);
		}
	};
	
	OnClickListener btn01_click = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Intent intent = new Intent();
			intent.setClass(SumAct.this, TaskNew.class);
			startActivity(intent);
		}
	};

	OnClickListener btn02_click = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Intent intent = new Intent();
			intent.setClass(SumAct.this, CustList.class);
			startActivity(intent);
		}
	};
	
	OnClickListener btn03_click = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Intent intent = new Intent();
			intent.setClass(SumAct.this, CustNew.class);
			startActivity(intent);
		}
	};
	
	
	
	private void InitialComponent()
	{
		btntest = (Button) findViewById(R.id.btntest);
		btntest.setOnClickListener(btntest_click);
		btn01 = (Button) findViewById(R.id.btn01);
		btn01.setOnClickListener(btn01_click);
		btn02 = (Button) findViewById(R.id.btn02);
		btn02.setOnClickListener(btn02_click);
		btn03 = (Button) findViewById(R.id.btn03);
		btn03.setOnClickListener(btn03_click);
		showmeinfo = (TextView)findViewById(R.id.showmeinfo);
		
	}

	Button btntest = null;
	Button btn01 = null;
	Button btn02 = null;
	Button btn03 = null;
	TextView showmeinfo = null;

}
