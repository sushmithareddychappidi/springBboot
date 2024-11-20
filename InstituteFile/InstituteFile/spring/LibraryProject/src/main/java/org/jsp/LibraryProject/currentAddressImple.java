package org.jsp.LibraryProject;

public class currentAddressImple implements Address
{
	private String doorno;
	private String streetno;
	private String area;
	private String city;
	private String state;
	private String nation;
	public currentAddressImple() {
		
	}
	public currentAddressImple(String doorno, String streetno, String area, String city, String state,
			String nation) {
		
		this.doorno = doorno;
		this.streetno = streetno;
		this.area = area;
		this.city = city;
		this.state = state;
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "currenttAddressImple [doorno=" + doorno + ", streetno=" + streetno + ", area=" + area + ", city="
				+ city + ", state=" + state + ", nation=" + nation + "]";
	}
	

}
