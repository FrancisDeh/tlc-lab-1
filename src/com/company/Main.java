package com.company;

import com.company.collections.Card;
import com.company.collections.SuitOrder;
import com.company.collections.ValueOrder;
import com.company.exceptions.TradePriceException;
import com.company.one.Trader;
import com.company.zero.BondTrade;
import com.company.zero.FundTrade;
import com.company.one.Trade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws TradePriceException {
        Trade trade = new Trade("T1", "APPL", 100, 15.25);
        Trade trade2 = new Trade("T2", "MML", 10, 10.25);
        Trade trade3 = new Trade("T3", "HHL", 5);
        System.out.println(trade.toString());
        trade.setId("rt5");
        System.out.println(trade.toString());
        System.out.println(trade.getId());

        System.out.println(trade.toString());
        System.out.println(trade.getPrice() * trade.getQuantity());
        
        System.out.println(trade3.toString());
        System.out.println(trade3.getPrice() * trade3.getQuantity());

        Trader trader = new Trader("Juliet");
        trader.addTrade(trade);
        trader.addTrade(trade2);
        trader.addTrade(trade3);
        System.out.println(trader.getTradeTotal());
        trader.getTradeTotal();

        // Trade trade = new BondTrade(45);
        // trade.calcDividend();
        //
        // Trade trade1 = new FundTrade(30);
        // trade1.calcDividend();

        // generateRandomNumbers();

        // List<Card> cards = new ArrayList<>();
        // cards.add(new Card('S', '2'));
        // cards.add(new Card('D', '7'));
        // cards.add(new Card('H', 'A'));

        // Collections.sort(cards, new SuitOrder());
        // for (Card card : cards) {
        //     System.out.println(card.toString());
        // }

        // Collections.sort(cards, new ValueOrder());

        // for (Card card : cards) {
        //     System.out.println(card.toString());
        // }



    }

    public static void generateRandomNumbers() {
        List<Integer> randomLists = new ArrayList<>();

        while (randomLists.size() < 6) {
            Random random = new Random();
            // generate a random number from 1 to 49
            Integer randomNumber = random.nextInt(49);
            System.out.println(randomNumber);
            if (!randomLists.contains(randomNumber)) {
                randomLists.add(randomNumber);
            }
        }

        Collections.sort(randomLists);

        for (Integer number : randomLists) {
            System.out.println(number);
        }
    }
}
