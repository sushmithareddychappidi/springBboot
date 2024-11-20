package org.jsp.car;

public class carbeanclass 
{
	private String cname;
	private String color;
	private double prize;
	private String milaze;
	private Engine e;
	public carbeanclass() 
	{
		System.out.println("No-argument Constructor");
	}
	public carbeanclass(String cname, String color, double prize, String milaze, Engine e) {
		super();
		this.cname = cname;
		this.color = color;
		this.prize = prize;
		this.milaze = milaze;
		this.e = e;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public String getMilaze() {
		return milaze;
	}
	public void setMilaze(String milaze) {
		this.milaze = milaze;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "carbeanclass [cname=" + cname + ", color=" + color + ", prize=" + prize + ", milaze=" + milaze + ", e="
				+ e + "]";
	}
	
	

	
	
}
