package com.abstraction;

public class Account
{
	int Acc_no;
	String name;
	double amount;
	String email_id;
	long Mlb_no;
  
	static String bankName;
	public Account() 
	{
		Acc_no=78953196;
		name="Devaki";
		amount=10000000;
		email_id="Devaki123@gmail.com";
		Mlb_no= 789563786;
	}
	static
	{
		bankName="SBI";
	}
	public void getAccout()
	{
		System.out.println("ACCOUNT DETAILS");
		System.out.println("ACCOUNT NUMBER:"+Acc_no);
		System.out.println("NAME:"+name);
		System.out.println("AMOUNT:"+amount);
		System.out.println("EMAIL_ID:"+email_id);
		System.out.println("MOBILE NUMBER:"+Mlb_no);
		System.out.println("BRANCH NAME:"+bankName);
	}
	

	public static void main(String[] args) 
	{
		  Account account=new Account();
		  account.getAccout();
		  

	}

}
