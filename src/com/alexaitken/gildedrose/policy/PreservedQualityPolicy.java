package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

public class PreservedQualityPolicy extends QualityPolicy {

    @Override
    public boolean support(Item item) {
        if (item.getName().startsWith("Sulfuras")) {
            return true;
        }
        
        return false;
    }

    @Override
    public void calculate(Item item) {
        
        // 아무것도 하지 않는다.
        
    }
    
}
