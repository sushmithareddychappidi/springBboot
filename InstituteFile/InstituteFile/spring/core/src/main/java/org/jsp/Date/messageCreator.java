package org.jsp.Date;

import java.util.Date;

public class messageCreator 
{
	private Date date;

	public messageCreator() {
	}

	public messageCreator(Date date) {
		
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "messageCreator [date=" + date + "]";
	}
	public  void create(String name)
	{
		int hour=date.getHours();
		System.out.println(hour);
		System.out.println(date+"/n");
		if(hour>4 && hour<12)
		{
			System.out.println(name+"Good Morning");
		}
		else if(hour<16)
		{
			System.out.println(name+"Good Afternoon");
		}
		else if(hour<20)
		{
			System.out.println(name+" Good Evening");
		}
		else
		{
			System.out.println(name+"Good Night");
		}
		
	}
	
	
}
