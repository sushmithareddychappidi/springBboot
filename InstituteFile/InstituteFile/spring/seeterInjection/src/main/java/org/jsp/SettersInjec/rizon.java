package org.jsp.SettersInjec;

public class rizon implements processor
{
	private String mfd;
	private int storage;
	

	public rizon() {
	   System.out.println("No argument Constructor of rizon");
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
		return "rizon [mfd=" + mfd + ", storage=" + storage + "]";
	}



	@Override
	public void getDetails() {
		System.out.println(toString());
		
	}

}
