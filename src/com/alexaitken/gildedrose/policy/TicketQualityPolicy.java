package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

public class TicketQualityPolicy extends QualityPolicy {

    /*
    티켓의 경우
     */

    @Override
    public boolean support(Item item) {
        if (item.getName().startsWith("Backstage")) {
            return true;
        }
        
        return false;
    }

    @Override
    public void calculate(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        
        if (item.getSellIn() <= 0) {
            item.setQuality(0);
        } else if (item.getSellIn() < 5) {
            item.setQuality(item.getQuality() + 3);
        } else if (item.getSellIn() < 10) {
            item.setQuality(item.getQuality() + 2);
        } else {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
