package org.jsp.Autowiring;

public class permanentimplementation implements Address
{
	private String doorno;
	private String streetno;
	private String area;
	private String city;
	private String state;
	private String nation;
	public permanentimplementation() {
		
	}
	public permanentimplementation(String doorno, String streetno, String area, String city, String state,
			String nation) {
		System.out.println("Argument Constructor of permanent class");
		this.doorno = doorno;
		this.streetno = streetno;
		this.area = area;
		this.city = city;
		this.state = state;
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "permanentimplementation [doorno=" + doorno + ", streetno=" + streetno + ", area=" + area + ", city="
				+ city + ", state=" + state + ", nation=" + nation + "]";
	}
	
	
	

}
