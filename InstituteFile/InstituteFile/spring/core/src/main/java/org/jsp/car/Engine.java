package org.jsp.car;

public class Engine 
{
	private String type;
	private String php;
	private String cc;
	//No-argument Constructor
	public Engine() 
	{
		System.out.println("No-argument constructor");
	}
	public Engine(String type, String php, String cc) 
	{
		this.type = type;
		this.php = php;
		this.cc = cc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhp() {
		return php;
	}
	public void setPhp(String php) {
		this.php = php;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", php=" + php + ", cc=" + cc + "]";
	}
	
	

}
