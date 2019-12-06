package com.ubertob.ministring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TradeRepository {
    int arraySize = 10_000_000;

    public TradeRef[] tradesWithRef = new TradeRef[arraySize];
    public TradeInline[] tradesInline = new TradeInline[arraySize];
    public TradeMiniString[] tradesMiniString = new TradeMiniString[arraySize];

    Random random = new Random();

    public void preparingData(){

        for (int i = 0; i < arraySize; i++) {

            var t = randomTrade();
            tradesWithRef[i] = new TradeRef(t.getAmount(), t.getAccount(), t.getSecurity());
            tradesInline[i]= new TradeInline(t.getAmount(), t.getAccount(), t.getSecurity());
            tradesMiniString[i]= new TradeMiniString(t.getAmount(), t.getAccount(), t.getSecurity());
        }

        shuffleArray(tradesWithRef);
        shuffleArray(tradesInline);
        shuffleArray(tradesMiniString);

    }

    private void shuffleArray(Trade[] array) {
        List<Trade> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }

    private Trade randomTrade() {
        int r = random.nextInt(100_000);

        return new TradeMiniString(100_000_000 / (r + 1), "ACC"+r, "SEC"+r);
    }


}
