package com.ubertob.ministring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TradeRepository {
    static final int ACCOUNTS_SIZE = 100;
    static final int arraySize = 5_000_000;

    public TradeRef[] tradeRefs = new TradeRef[arraySize];
    public TradeRefEncoded[] tradesRefEncoded = new TradeRefEncoded[arraySize];
    public TradeInline[] tradesInline = new TradeInline[arraySize];
    public TradeMiniString[] tradesMiniString = new TradeMiniString[arraySize];

    private String[] accounts = new String[ACCOUNTS_SIZE];

    Random random = new Random();

    public void fillWithRandomData(){

        for (int i = 0; i < ACCOUNTS_SIZE; i++) {
            accounts[i] = "ACCOUNT_" + i;
        }

        for (int i = 0; i < arraySize; i++) {

            var t = randomTrade();
            tradeRefs[i] = new TradeRef(t.amount, t.account, t.security);
            tradesRefEncoded[i] = new TradeRefEncoded(t.amount, t.account, t.security);
            tradesInline[i]= new TradeInline(t.amount, t.account, t.security);
            tradesMiniString[i]= new TradeMiniString(t.amount, t.account, t.security);
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

    private TradeRef randomTrade() {
        int r = random.nextInt(100_000);

        return new TradeRef(100_000_000 / (r + 1), accounts[r % ACCOUNTS_SIZE], "SEC_"+r);
    }


}
