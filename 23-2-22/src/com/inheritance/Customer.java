package com.inheritance;

public class Customer extends Account 
{  
	
	String address;
	static  String bankName;
	public Customer() 
	{
	   address="siva kovil street";	
	}
	static
	{
	    bankName="SBI";
	}
	public void getCustomber()
	{
		System.out.println(address);
		System.out.println(bankName);
	}
	public void getAccount()
	{
		System.out.println("ACCOUNT DETAILS");
		System.out.println("----------------");
		System.out.println("ACCOUNT NUMBER:"+Acc_no);
		System.out.println("NAME:"+name);
		System.out.println("AMOUNT:"+amount);
		System.out.println("EMAIL_ID:"+email_id);
		System.out.println("MOBILE NUMBER:"+Mlb_no);
		System.out.println("BRANCH NAME:"+bankName);
	}


	public static void main(String[] args)
	{
		Customer customer=new Customer();
		customer.Acc_no=59326389;
		customer.name="thara";
		customer.getCustomber();
		System.out.println("***********");
		customer.getAccount();
		

	}

}
