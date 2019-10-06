package kata.src;

public class Item {
	
	private String name;
	private int sellIn;
	private int quality;
	
	public Item(String name,int sellIn,int quality)
	{
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}

	public void setSellIn(int sellIn)
	{
		this.sellIn = sellIn;
	}

	public int getSellIn()
	{

		return this.sellIn;
	}

	public void setQuality(int quality)
	{
		this.quality = quality;
	}

	public int getQuality(){

		return this.quality;
	}
}
