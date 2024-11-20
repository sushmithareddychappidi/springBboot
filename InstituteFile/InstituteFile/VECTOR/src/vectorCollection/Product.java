package vectorCollection;

public class Product 
{
	private int pId;
	private String pName;
	private int cost;
	private String mDate;
	private String edate;
	private String category;
	public Product()
	{
		
	}
	public Product(int pId, String pName, int cost, String mDate, String edate, String category)
	{
		this.pId = pId;
		this.pName = pName;
		this.cost = cost;
		this.mDate = mDate;
		this.edate = edate;
		this.category = category;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void display()
	{
		System.out.println("Product Id: "+getpId());
		System.out.println("Product Id: "+getpName());
		System.out.println("Product Id: "+getCost());
		System.out.println("Product Id: "+getmDate());
		System.out.println("Product Id: "+getEdate());
		System.out.println("Product Id: "+getCategory());		
	}
	

}
