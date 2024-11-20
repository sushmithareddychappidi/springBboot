package org.jsp.LibraryProject;

public class AcademicTypeImple implements Type
{
	private String subjects;
	private int noOfBooks;
	private String compartments;
	public AcademicTypeImple() {
		
	}
	public AcademicTypeImple(String subjects, int noOfBooks, String compartments) {
		super();
		this.subjects = subjects;
		this.noOfBooks = noOfBooks;
		this.compartments = compartments;
	}
	@Override
	public String toString() {
		return "AcademicTypeImple [subjects=" + subjects + ", noOfBooks=" + noOfBooks + ", compartments=" + compartments
				+ "]";
	}
	
	
	
}
