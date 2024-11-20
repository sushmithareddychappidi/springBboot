package org.jsp.Autowiring;

public class currentAccount implements Account
{
	private long accno;
	private String ahn;
	private String mail;
	private String mobileno;
	private String username;
	private String password;
	public currentAccount() {
		System.out.println("No Argument Constructor of Current Account");
	
	}
	public currentAccount(long accno, String ahn, String mail, String mobileno, String username, String password) {
		System.out.println("Argument Constructor of Current Account");
		this.accno = accno;
		this.ahn = ahn;
		this.mail = mail;
		this.mobileno = mobileno;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "currentAccount [accno=" + accno + ", ahn=" + ahn + ", mail=" + mail + ", mobileno=" + mobileno
				+ ", username=" + username + ", password=" + password + "]";
	}
}
