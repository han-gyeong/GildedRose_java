package com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.policy.*;

public class Inventory {

	private Item[] items;
	
	private QualityPolicyContainer qualityPolicyContainer = new QualityPolicyContainer();

	public Inventory(Item[] items) {
		super();
		this.items = items;
	}

	public Inventory() {
		super();
		items = new Item[] {
					new Item("+5 Dexterity Vest", 10, 20), 
					new Item("Aged Brie", 2, 0),
					new Item("Elixir of the Mongoose", 5, 7),
					new Item("Sulfuras, Hand of Ragnaros", 0, 80),
					new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
					new Item("Conjured Mana Cake", 3, 6) 
				};

	}

	public void updateQuality() {
		for (Item item : items) {
			QualityPolicy qualityPolicy = qualityPolicyContainer.getPolicy(item);
			qualityPolicy.calculateQuality(item);
		}
	}
}
