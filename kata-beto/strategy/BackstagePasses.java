package kata.strategy;

import kata.src.Item;

public class BackstagePasses implements Istrategy {

	@Override
	public void updateQuality(Item item) {
		
		//final int minimunQuality = 0;
		final int maximunQuality = 50;

		int quality = item.getQuality();
		int sellIn = item.getSellIn();

		if(quality<maximunQuality)
		{
			if(sellIn >5 && sellIn<=10)
			{
				quality = quality +2;
			}

			if(sellIn>0 && sellIn <=5)
			{
				quality = quality +3;
			}
			if(sellIn <0)
			{
				quality = 0;
			}
			if(sellIn > 10) {
				quality++;
			}
		}

		item.setQuality(quality);
	}

}
