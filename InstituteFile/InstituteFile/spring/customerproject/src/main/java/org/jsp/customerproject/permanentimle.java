package org.jsp.customerproject;

public class permanentimle implements Addressinterface
{
	private String doorno;
	private String streetno;
	private String area;
	private String landmark;
	private String city;
	private String state;
	private String nation;
	

	public permanentimle() 
	{
		System.out.println("No argument constructor of permanent address");		
	}

	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		System.out.println("setter of doorno");
		this.doorno = doorno;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		System.out.println("setter of streetno");
		this.streetno = streetno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		System.out.println("setter of area");
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		System.out.println("setter of landmark");
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setter of city");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("setter of state");
		this.state = state;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		System.out.println("setter of nation");
		this.nation = nation;
	}
	
	@Override
	public String toString() {
		return "permanentimple [doorno=" + doorno + ", streetno=" + streetno + ", area=" + area + ", landmark="
				+ landmark + ", city=" + city + ", state=" + state + ", nation=" + nation + "]";
	}

	@Override
	public void getInfo() 
	{		
		System.out.println(toString());
	}

}
