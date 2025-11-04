package BankService;

import java.sql.SQLException;

import BankModel.Account;

interface BankService {
	
	public void accountCreation();
	public void viewAccount();
	public void withdrawMoney();
	public void dipositMoney();
	public void UpdateAccount();

}
