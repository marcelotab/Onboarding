package kata.strategy;

import kata.src.Item;

public class Conjured implements Istrategy {

	@Override
	public void updateQuality(Item item) {
		
		final int minimunQuality = 0;
		int quality = item.getQuality();
		if(quality < minimunQuality)
		{
			quality = quality-2;
		}

		item.setQuality(quality);
	}
}
