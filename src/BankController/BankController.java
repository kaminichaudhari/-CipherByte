package BankController;

import java.util.Scanner;

import BankModel.Account;
import BankService.BankServiceIMP;

public class BankController   {
	
	public static void main(String[] args) {
		BankServiceIMP b=new BankServiceIMP();
		System.out.println("===============Bank System============");
		System.out.println("Press 1 for Account creation ");
		System.out.println("Press 2 for Account view");
		System.out.println("Press 3 for withdraw money ");
		System.out.println("Press 4 for Deposit money");
		System.out.println("Press 5 for Update accout");
		System.out.println("Press 6 for exit");
		System.out.println("================================================");
		boolean flage;
		while(flage=true){
		Scanner sc=new Scanner(System.in);
		int option =sc.nextInt();
		
		
		switch(option)
		{
		case 1: System.out.println("Lets go for create account:");
		        b.accountCreation();
		      
		break;
		
		case 2: System.out.println("view Account:");
		       b.viewAccount();
		        
		break;
		
		case 3: System.out.println("Lets go for withdraw Money:");
		
		break;
		
		case 4: System.out.println("Lets go for diposite money:");
		
		break;
		
		case 5: System.out.println("Lets go for Update account:");
		
		break;
		
		case 6:System.out.println("Exit");
		flage=false;
		break;
		
		
		default:
			System.out.println("enter 1-6  only ");
		}
	}
	}
}
