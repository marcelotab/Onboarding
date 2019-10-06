package kata.src;

import kata.handler.StrategyHandler;
import kata.strategy.Context;
import kata.strategy.Istrategy;

public class GilderRose {
	
		private Item items[];
	 	private Istrategy strategy;
	 	private StrategyHandler strategyHandler= new StrategyHandler();
	    Context context = new Context(strategy);

	    public GilderRose(Item items[]) 
	    {
	        this.items = items;
	    }

	    public void updateQuality()
	    {
	        
	        for(Item item :items)
	        {
	        	strategy = strategyHandler.strategyFind(item);
	        	context.setStrategy(strategy);
	            context.executeStrategy(item);
	          
	            if(!item.getName().equals("sulfuras")) {
	            	int sellIn = item.getSellIn()- 1;
	                item.setSellIn(sellIn);
	            }
	        }
	    }
}
