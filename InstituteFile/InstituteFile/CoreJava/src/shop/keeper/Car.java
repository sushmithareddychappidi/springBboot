package shop.keeper;
import user.CarInfoMissMatchException;

public class Car 
{
	private static String brandName="audi";
	private String seriesName;
	private int speed;
	private int time;
	public void Car()
	{
		
	}
	public static String getBrandName() {
		return brandName;
	}
	public static void setBrandName(String brandName) {
		Car.brandName = brandName;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Car(String seriesName,int speed,int time)
	{
		int result1=validateSeriesName(seriesName);
		boolean result2=verifySpeed(speed);
		String result3=checkTime(time);
		if((result1==1) && (result2)  && (result3.equals("valid")))
		{
			this.seriesName=seriesName;
			this.speed=speed;
			this.time=time;
		}
		else
		{
			throw new CarInfoMissMatchException();
			//System.out.println("inavalid series name/speed/ time");
		}
	}
	private int validateSeriesName(String seriesName)
	{
		int countDigit=0;
		int countAlpha=0;
		for(int i=0;i<=seriesName.length()-1;i++)
		{
			char ch=seriesName.charAt(i);
			if(Character.isAlphabetic(ch) || Character.isDigit(ch))
			{
				countAlpha++;
			}
			if(Character.isDigit(ch))
			{
				countDigit++;
			}
			
		}
		if(countAlpha== seriesName.length() && countDigit!=seriesName.length() )
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
    private boolean  verifySpeed(int speed)
	{
		if(speed>=40 && speed<=120)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private String checkTime(int time)
	{
		if(time>=3 && time<=9)
		{
			return "valid";
		}
		else
		{
			return "invalid";
		}
	}
	private void distance()
	{
		int distan=speed*time;
		System.out.println("Distance travelled by the car: "+distan);
	}
	public void carInfo()
	{
		System.out.println("car "+brandName+" " +seriesName);
		System.out.println("speed of the car : "+speed);
		System.out.println("Time taken by the car : "+time);
		distance();
		System.out.println("****************");
	}

}
