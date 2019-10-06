package kata.strategy;

import kata.src.Item;

public class AgedBrie implements Istrategy {

	@Override
	public void updateQuality(Item item) {
		
		int quality = item.getQuality();
		final int maximunQuality = 50;

		if(quality< maximunQuality)
		{
			quality++;
		}

		item.setQuality(quality);
	}

}
