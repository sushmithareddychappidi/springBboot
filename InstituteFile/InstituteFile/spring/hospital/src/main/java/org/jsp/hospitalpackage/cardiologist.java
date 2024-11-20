package org.jsp.hospitalpackage;

public class cardiologist implements Doctor
{
	private String name;
	private String Qualification;
	private String experience;
	private int noOfOperationsDone;
	
	public cardiologist() {
	System.out.println("No argument Constructor of Cardiologist");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getNoOfOperationsDone() {
		return noOfOperationsDone;
	}
	public void setNoOfOperationsDone(int noOfOperationsDone) {
		this.noOfOperationsDone = noOfOperationsDone;
	}
	
	@Override
	public String toString() {
		return "cardiologist [name=" + name + ", Qualification=" + Qualification + ", experience=" + experience
				+ ", noOfOperationsDone=" + noOfOperationsDone + "]";
	}

	@Override
	public void getInfo() {
		System.out.println(toString());
		
	}


	

}
