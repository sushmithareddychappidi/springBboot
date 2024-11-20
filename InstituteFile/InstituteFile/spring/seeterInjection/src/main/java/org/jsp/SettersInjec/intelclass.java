package org.jsp.SettersInjec;

public class intelclass implements processor
{
	private String mfd;
	private int storage;
	

	public intelclass() {
	   System.out.println("No argument Constructor of intel");
	}
	


	public String getMfd() {
		return mfd;
	}



	public void setMfd(String mfd) {
		System.out.println("Seeter menthod of manufacture date");
		this.mfd = mfd;
	}



	public int getStorage() {
		return storage;
	}



	public void setStorage(int storage) {
		System.out.println("Seeter menthod of storage");
		this.storage = storage;
	}
	



	@Override
	public String toString() {
		return "intelclass [mfd=" + mfd + ", storage=" + storage + "]";
	}



	@Override
	public void getDetails() {
		System.out.println(toString());
		
	}

}
