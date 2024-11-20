package org.jsp.LibraryProject;

public class branchAdminimple implements Admin
{
	private String name;
	private String experience;
	private String qualification;
	private String empid;
	public branchAdminimple() {
	
	}
	public branchAdminimple(String name, String experience, String qualification, String empid) {
		super();
		this.name = name;
		this.experience = experience;
		this.qualification = qualification;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "branchAdminimple [name=" + name + ", experience=" + experience + ", qualification=" + qualification
				+ ", empid=" + empid + "]";
	}
	
	
}
