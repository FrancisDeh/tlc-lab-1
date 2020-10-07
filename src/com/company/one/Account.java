package com.company.one;

import java.util.ArrayList;
import java.util.List;

public class Account {
    
    private List<Trade> trades = new ArrayList<>();

    public Account() {
    }

    public double getTotal() {
        double total = 0.0;
        for (Trade trade : trades) {
            total += trade.getPrice() * trade.getQuantity();
        }

        return total;
    }

    public void setTrade(Trade trade) {
        trades.add(trade);
    }
}
