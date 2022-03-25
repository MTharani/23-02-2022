package com.abstraction;

public class Customer extends Account 
{  
   private int Acc_no;
	String name;
	static  String bankName;
	public Customer() 
	{
		
	}
	static
	{
	    bankName="SBI";
	}
	public void getCustomber()
	{
		System.out.println(Acc_no);
		System.out.println(name);
		System.out.println(bankName);
	}

	public static void main(String[] args)
	{
		Customer customer=new Customer();
		customer.Acc_no=59326389;
		customer.name="thara";
		customer.getCustomber();
		System.out.println("***********");
		customer.getAccout();
		

	}

}
