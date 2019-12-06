package com.ubertob.ministring;

import java.util.Random;

public class TradeRepository {
    int arraySize = 10_000_000;

    Trade[] tradesWithRef = new TradeRef[arraySize];
    Trade[] tradesInline = new TradeInline[arraySize];
    Trade[] tradesMiniString = new TradeMiniString[arraySize];

    Random random = new Random();

    public void preparingData(){

        for (int i = 0; i < arraySize; i++) {

            var t = randomTrade();
            tradesWithRef[i] = t;
            tradesInline[i]= new TradeInline(t.amount, t.account, t.security);
            tradesMiniString[i]= new TradeMiniString(t.amount, t.account, t.security);
        }

//        on eachone
//        sum all trades for an account
//        sum all trades for a security

    }

    private TradeRef randomTrade() {
        int r = random.nextInt(100_000);

        return new TradeRef(100_000_000 / (r + 1), "ACC"+r, "SEC"+r);
    }


}
