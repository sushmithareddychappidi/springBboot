package Exceptions;


public class Student 
{
    String name;
	int rollNo;
    int marks;
    public void Student()
    {
    	
    }
	public Student(String name,int rollNo,int marks)
	{
		if(name.equalsIgnoreCase("scott") ||name.equalsIgnoreCase("tiger"))
		{
			this.name=name;
		}
		else
		{
			NameMisMatchException n=new NameMisMatchException();
			throw n;
		}
		if(rollNo>7 && rollNo<=11)
		{
			this.rollNo=rollNo;
		}
		else
		{
			RollNoOutOfBoundsException r=new RollNoOutOfBoundsException();
			throw r;
		}
		if(marks>=35 && marks<=99)
		{
			this.marks=marks;
		}
		else
		{
			InvalidMarksException m=new InvalidMarksException();
			throw m;		
		}		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public  void display()
	{
		System.out.println("Name of the Student: "+name);
		System.out.println("Roll no of the Student: "+rollNo);
		System.out.println("Marks of the Student: "+marks);
	}

}
