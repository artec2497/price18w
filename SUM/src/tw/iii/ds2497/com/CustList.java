package tw.iii.ds2497.com;

import android.app.Activity;
import android.app.LauncherActivity.ListItem;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CustList extends Activity
{

	CCustomer Cust = new CCustomer();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custlist);
		InitialComponent();
	}
	
	private void InitialComponent()
	{
		listCust = (ListView)findViewById(R.id.listCust);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(CustList.this, android.R.layout.simple_list_item_activated_1
				,Cust.Name);
		adapter.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
		listCust.setAdapter(adapter);
		
	}
	ListView listCust = null;
}
