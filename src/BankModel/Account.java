package BankModel;

public class Account {
	
	private int AccountNo;
	private String userName;
	private String panNo;
	private double bal;
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [AccountNo=" + AccountNo + ", userName=" + userName + ", panNo=" + panNo + ", bal=" + bal + "]";
	}
	
	
	
	

}
