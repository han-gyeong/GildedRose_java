package com.alexaitken.gildedrose.policy;

import com.alexaitken.gildedrose.Item;

import java.util.ArrayList;
import java.util.List;

public class QualityPolicyContainer {
    
    private List<QualityPolicy> policies = new ArrayList<>();
    
    public QualityPolicyContainer() {
        policies.add(new CheeseQualityPolicy());
        policies.add(new ConjuredQualityPolicy());
        policies.add(new PreservedQualityPolicy());
        policies.add(new TicketQualityPolicy());
        
        // 기본 전략은 맨 뒤에 위치해야 한다.
        policies.add(new CommonQualityPolicy());
    }
    
    public QualityPolicy getPolicy(Item item) {
        for (QualityPolicy policy : policies) {
            if (policy.support(item)) {
                return policy;
            }
        }
        
        return new CommonQualityPolicy();
    }
    
}
