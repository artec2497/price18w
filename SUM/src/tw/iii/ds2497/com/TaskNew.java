package tw.iii.ds2497.com;

import java.util.Calendar;

import tw.iii.ds2497.com.R;
import tw.iii.ds2497.com.R.id;
import tw.iii.ds2497.com.R.layout;



import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class TaskNew extends Activity
{

	private String[] CustCategoryArray = {"客戶拜訪","送禮","重點訪問","收款"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newtask);
		InitialComponent();
		
		
		
	}
	
	OnClickListener btn01_click = new OnClickListener()
	{
		
		@Override
		public void onClick(View v)
		{
			// TODO Auto-generated method stub
			
		}
	};

	OnItemSelectedListener category_change = new OnItemSelectedListener()
	{

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int index,
				long arg3)
		{
			// TODO Auto-generated method stub
			tvTitle.setText(CustCategoryArray[index]);
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0)
		{
			// TODO Auto-generated method stub
			tvTitle.setText("This is triggered. but there is nothing selected.");
		}

	};

	OnClickListener btnDate_click = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Calendar calToday=Calendar.getInstance();
			
			Dialog dialog=new DatePickerDialog(
					TaskNew.this,	
					DatePick,
					calToday.get(Calendar.YEAR),
					calToday.get(Calendar.MONTH),
					calToday.get(Calendar.DATE));
			
			dialog.show();
			
		}
	};
	
	OnDateSetListener DatePick = new OnDateSetListener()
	{
		@Override
		public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3)
		{
			String strDate=String.valueOf(arg1)+"/"+
					String.valueOf(arg2+1)+"/"+
					String.valueOf(arg3);
			tvTitle.setText(strDate);
		}
	};
	
	protected void InitialComponent()
	{
		CustCateSpinner = (Spinner)findViewById(R.id.spClass);
		CustCateSpinner.setOnItemSelectedListener(category_change);
		tvTitle = (TextView)findViewById(R.id.tvTitle);
		btnDate = (Button)findViewById(R.id.btnDate);
		btnDate.setOnClickListener(btnDate_click);
		
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(TaskNew.this, android.R.layout.simple_spinner_item,CustCategoryArray);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
		CustCateSpinner.setAdapter(adapter);
		
	}
	
	Spinner CustCateSpinner = null;
	TextView tvTitle = null;
	Button btnDate = null;
}
