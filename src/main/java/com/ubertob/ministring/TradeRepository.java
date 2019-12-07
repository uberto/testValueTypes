package com.ubertob.ministring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TradeRepository {
    int arraySize = 1_000_000;

    public TradeRef[] tradeRefs = new TradeRef[arraySize];
    public TradeRefEncoded[] tradesRefEncoded = new TradeRefEncoded[arraySize];
    public TradeInline[] tradesInline = new TradeInline[arraySize];
    public TradeMiniString[] tradesMiniString = new TradeMiniString[arraySize];

    Random random = new Random();

    public void preparingData(){

        for (int i = 0; i < arraySize; i++) {

            var t = randomTrade();
            tradeRefs[i] = new TradeRef(t.getAmount(), t.getAccount(), t.getSecurity());
            tradesRefEncoded[i] = new TradeRefEncoded(t.getAmount(), t.getAccount(), t.getSecurity());
            tradesInline[i]= new TradeInline(t.getAmount(), t.getAccount(), t.getSecurity());
            tradesMiniString[i]= new TradeMiniString(t.getAmount(), t.getAccount(), t.getSecurity());
        }

        shuffleArray(tradeRefs);
        shuffleArray(tradesRefEncoded);
        shuffleArray(tradesInline);
        shuffleArray(tradesMiniString);

    }

    private <T> void  shuffleArray(T[] array) {
        List<T> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }

    private Trade randomTrade() {
        int r = random.nextInt(100_000);

        return new TradeMiniString(100_000_000 / (r + 1), "ACC"+r, "SEC"+r);
    }


}
