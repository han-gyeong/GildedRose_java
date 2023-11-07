package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

public class CommonQualityPolicy extends QualityPolicy {

    @Override
    public boolean support(Item item) {
        return true;
    }

    @Override
    public void calculate(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        
        if (item.getSellIn() <= 0) {
            item.setQuality(item.getQuality() - 2);
        } else {
            item.setQuality(item.getQuality() - 1);
        }
        
    }
    
}
