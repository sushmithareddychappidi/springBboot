package org.jsp.Autowiring;

public class SavingsAccount implements Account
{
	private long accno;
	private String ahn;
	private String mail;
	private String mobileno;
	private String username;
	private String password;
	public SavingsAccount() {
		System.out.println("No Argument Constructor of Savings Account");
	
	}
	public SavingsAccount(long accno, String ahn, String mail, String mobileno, String username, String password) {
		System.out.println("Argument Constructor of Savings Account");
		this.accno = accno;
		this.ahn = ahn;
		this.mail = mail;
		this.mobileno = mobileno;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accno=" + accno + ", ahn=" + ahn + ", mail=" + mail + ", mobileno=" + mobileno
				+ ", username=" + username + ", password=" + password + "]";
	}
}
