package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

public abstract class QualityPolicy {
    
    /*
    Item의 sellIn 은 매일 1씩 감소해야 하고, 그에 따라 Quality 의 계산이 달라져야 한다.
    */
    
    public final void calculateQuality(Item item) {
        calculate(item);
        
        // 모든 아이템의 퀄리티는 음수가 될 수 없다.
        if (item.getQuality() < 0) {
            item.setQuality(0);
        }

        if (item.getQuality() >= 50) {
            item.setQuality(50);
        }
    }
    
    public abstract boolean support(Item item);
    
    public abstract void calculate(Item item);
    
    
    
}
