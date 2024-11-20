package org.jsp.LibraryProject;

public class facultyReaderImple implements Reader
{
	private String name;
	private String address;
	private String phno;
	private String branch;
	public facultyReaderImple() {
		
	}
	public facultyReaderImple(String name, String address, String phno, String branch) {
		super();
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "facultyReaderImple [name=" + name + ", address=" + address + ", phno=" + phno + ", branch=" + branch
				+ "]";
	}
	
}
