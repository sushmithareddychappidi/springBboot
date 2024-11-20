package org.jsp.contructorinitialization;

public class constructorInjection 
{
	private int sid;
	private String sname;
	private String stream;
	private double per;
	private String mail;
	public constructorInjection() 
	{
		System.out.println("No argument Constructor");
	}
	
	public constructorInjection(int sid, String sname, String stream, double per, String mail) {
		
		this.sid = sid;
		this.sname = sname;
		this.stream = stream;
		this.per = per;
		this.mail = mail;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "constructorInjection [sid=" + sid + ", sname=" + sname + ", stream=" + stream + ", per=" + per
				+ ", mail=" + mail + "]";
	}
	
	

}
