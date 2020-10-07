package com.company.one;

import com.company.exceptions.TradePriceException;

public class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price = 1.0;

    public Trade(String id, String symbol, int quantity, double price) throws TradePriceException {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        if (price >= 0) {
            this.price = price;
        } else throw new TradePriceException("Price cannot be negative");
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws TradePriceException {
        if (price >= 0) {
            this.price = price;
        } else throw new TradePriceException("Price cannot be negative");
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
