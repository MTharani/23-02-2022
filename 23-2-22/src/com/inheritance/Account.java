package com.inheritance;

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

	}
	static
	{
		bankName="SBI";
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


	public static void main(String[] args) {
		Account acc=new Account();
		acc.Acc_no=78953196;
		acc.name="Devaki";
		acc.amount=10000000;
		acc.email_id="Devaki123@gmail.com";
		acc.Mlb_no= 789563786;
		acc.getAccount();
		System.out.println("*****************");
		Account acc1=new Account();
		acc1.Acc_no=768953196;
		acc1.name="Divi";
		acc1.amount=25000000;
		acc1.email_id="Divi763@gmail.com";
		acc1.Mlb_no= 786820686;
		acc1.getAccount();



	}

}
