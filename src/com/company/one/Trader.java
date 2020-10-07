package com.company.one;

public class Trader {
    private String name;
    private Account  account;

    public Trader(String name) {
        this.name = name;
        this.account = new Account();
    }

    public void addTrade(Trade trade) {
        this.account.setTrade(trade);
    }

    public double getTradeTotal() {
        return this.account.getTotal();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
