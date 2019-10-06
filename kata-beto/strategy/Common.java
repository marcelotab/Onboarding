package kata.strategy;

import kata.src.Item;

public class Common implements Istrategy {

	@Override
	public void updateQuality(Item item) {
	
		final int minimunQuality = 0;
		int quality = item.getQuality();
		int sellIn = item.getSellIn();
		
		if(quality > minimunQuality)
		{
			if(sellIn >=0)
			{
				quality--;	
			}
			else
			{
				quality = quality -2;
			}
		}

		item.setQuality(quality);
	}
}
