package kata.strategy;

import kata.src.Item;

public class Context {

	private Istrategy strategy;

	public Context(Istrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void setStrategy(Istrategy strategy)
	{
		this.strategy = strategy;
	}

	public void executeStrategy(Item item)
	{
		this.strategy.updateQuality(item);
	}
}
