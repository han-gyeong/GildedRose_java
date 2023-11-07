package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

public class ConjuredQualityPolicy extends QualityPolicy {

    @Override
    public boolean support(Item item) {
        if (item.getName().startsWith("Conjured")) {
            return true;
        }
        
        return false;
    }

    @Override
    public void calculate(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        
        // 일반 아이템의 2배 감소는.. -2 씩 인가?
        item.setQuality(item.getQuality() - 2);
    }
}
