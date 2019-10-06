package kata;

import kata.src.GilderRose;
import kata.src.Item;

public class Main {

	public static void main(String[] args) {
	
		
		Item item1 = new Item("sulfuras",10,30);
		Item item2 = new Item("backstage passes",10,31);
		Item item3 = new Item("aged brie",12,32);
		Item item4 = new Item("item4",13,33);
		Item item5 = new Item("item5",14,34);
		
		Item[] items ;
		items = new Item[] {item1,item2,item3,item4,item5};
		GilderRose gilder = new GilderRose(items);
		gilder.updateQuality();
		
		for(Item item :items){
			System.out.println(item.getQuality());
		}


	}
}
