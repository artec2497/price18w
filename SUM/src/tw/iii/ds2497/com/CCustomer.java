package tw.iii.ds2497.com;

public class CCustomer
{

	String[] Name = {"Carol","Ysolda","Markal","Lydia"};
	String[] Address = {"TW somewhere","California","Sanfrancisco","WhiteRun"};
	String[] LINE = {"account01","account02","account03","account04"};
	
	public String[] getAddress()
	{
		return Address;
	}

	public void setAddress(String[] address)
	{
		Address = address;
	}

	public String[] getLINE()
	{
		return LINE;
	}

	public void setLINE(String[] lINE)
	{
		LINE = lINE;
	}

	public String[] getName()
	{
		return Name;
	}

	public void setName(String[] name)
	{
		Name = name;
	}
	
}
