package com.company.zero;

public class BondTrade extends Trade {

    private double dividend;
    private double price = 34.5;

    public BondTrade(double dividend) {
        this.dividend = dividend;
    }

    @Override
    public void calcDividend() {
        System.out.println(this.price / this.dividend);
    }
}
