package com.company.zero;

public class FundTrade extends Trade {

    private double price = 45.0;
    private double percentage;

    public FundTrade(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void calcDividend() {
        System.out.println(this.price / this.percentage);
    }
}
