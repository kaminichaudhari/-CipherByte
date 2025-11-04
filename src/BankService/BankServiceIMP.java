package BankService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



import BankModel.Account;

public class BankServiceIMP implements BankService {
	 
	  
	  Account account=new Account();
	  Scanner sc=new Scanner(System.in);
	 
	
	  public void accountCreation() {
	
		System.out.println("Enter Account Number:");
		int accNo=sc.nextInt();
		account.setAccountNo(accNo);
		
		System.out.println("Enter Account Holder Name:");
		String name=sc.next();
		account.setUserName(name);
		
		System.out.println("Enter Pan Card Number:");
		String panNo=sc.next();
		account.setPanNo(panNo);
		
		System.out.println("Enter Balance:");
		Double bal=sc.nextDouble();
		account.setBal(bal);
		System.out.println("Account Creation Successfully....");
		
	
	}

	@Override
	public void viewAccount() {
		
		System.out.println("Account number:"+account.getAccountNo());
		System.out.println("Account Holder Name :"+account.getUserName());
		System.out.println("Pan card Number :"+account.getPanNo());
		System.out.println("Account Balance:"+account.getBal());
	     
		
	}

	@Override
	public void withdrawMoney() {
		
		
	}

	@Override
	public void dipositMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateAccount() {
		// TODO Auto-generated method stub
		
	}


	

}
