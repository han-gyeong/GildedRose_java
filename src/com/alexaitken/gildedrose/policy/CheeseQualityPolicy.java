package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

public class CheeseQualityPolicy extends QualityPolicy {

    @Override
    public boolean support(Item item) {
        if (item.getName().startsWith("Aged Brie")) {
            return true;
        }
        
        return false;
    }

    @Override
    public void calculate(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        item.setQuality(item.getQuality() + 1);
    }
}
