package kata.handler;

import kata.src.Item;
import kata.strategy.AgedBrie;
import kata.strategy.BackstagePasses;
import kata.strategy.Common;
import kata.strategy.Conjured;
import kata.strategy.Istrategy;
import kata.strategy.Sulfuras;

public class StrategyHandler {
	
	private Istrategy strategy;
	public Istrategy strategyFind(Item item) {
		
		if(item.getName().equals("sulfuras"))
        {
			strategy = new Sulfuras();
        }else if(item.getName().equals("aged brie"))
        {
            strategy = new AgedBrie();
            
        }else if(item.getName().equals("backstage passes"))
        {
        	 strategy = new BackstagePasses();
            
        }else if(item.getName().equals("Conjured"))
        {
        	 strategy = new Conjured();
            
        }else
        {
        	 strategy = new Common();
            
        }
		
		return strategy;
	}
}
