package com.encapsulationdemo;

public class Banking {

	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		//ad.amount=2000;
		
		ad.setAmount(2400); 
		ad.setInterest(7);
		System.out.println(ad.getAmount());
		System.out.println(ad.getInterest());

	}

}
