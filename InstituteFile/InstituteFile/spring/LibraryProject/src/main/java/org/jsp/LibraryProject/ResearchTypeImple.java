package org.jsp.LibraryProject;

public class ResearchTypeImple implements Type
{
	private String subjects;
	private int noOfBooks;
	private String compartments;
	public ResearchTypeImple() {
		
	}
	public ResearchTypeImple(String subjects, int noOfBooks, String compartments) {
		super();
		this.subjects = subjects;
		this.noOfBooks = noOfBooks;
		this.compartments = compartments;
	}
	@Override
	public String toString() {
		return "ResearchTypeImple [subjects=" + subjects + ", noOfBooks=" + noOfBooks + ", compartments=" + compartments
				+ "]";
	}
	
	
	
}
