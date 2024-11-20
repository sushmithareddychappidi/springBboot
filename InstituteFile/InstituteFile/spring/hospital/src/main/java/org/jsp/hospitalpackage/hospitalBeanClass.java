package org.jsp.hospitalpackage;

public class hospitalBeanClass 
{
	private String hospitalname;
	private String address;
	private int noOfPatients;
	private int noOfBeds;
	private Doctor doctor;
	private int noOfIcus;
	private int noOfambulane;
	private int noOfLabs;
	private Patient patient;
	
	

}
/*wap to perform dependency injection for hospital class
it has properties like hospital name,address,no of patientss,noofbeds,doctors,nooficus,noofambulance,nooflabs,patient
in the  above class address,doctor,ambulance,patient are the interfaces
create minimum three implementation classes for all the interfaces with different data and perform dependency injection*/