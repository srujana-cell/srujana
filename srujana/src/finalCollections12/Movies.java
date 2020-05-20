package finalCollections12;

public class Movies implements Comparable<Movies>
{
	private String mname;
	private String actor;
	private int price;
	
	public Movies(String mname,String actor,int price)
	{
		this.mname = mname;
		this.actor = actor;
		this.price = price;
	}
	public String getMname()
	{
		return mname;
	}
	public void setMname(String mname)
	{
		this.mname = mname;
	}
	public String getActor()
	{
		return actor;
	}
	public void setActor(String actor)
	{
		this.actor = actor;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return this.mname+"\t\t"+this.actor+"\t\t"+this.price;
	}
	
	@Override
	public int compareTo(Movies m)
	{
		String n1 = this.mname;
		String n2 = m.mname;
		return n1.compareTo(n2);	
	}
}