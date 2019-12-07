package com.ubertob.examples;

import com.ubertob.ministring.*;

import java.util.function.Supplier;

public class MiniStringTrades {

    public static void generatingTradesAndBrowing() {

        var tr = new TradeRepository();

        tr.preparingData();

        var searcherRef = new TradeRefBrowser(tr.tradeRefs);
        var searcherInline = new InlineTradeBrowser(tr.tradesInline);
        var searcherRefEncoded = new TradeRefEncodedBrowser(tr.tradesRefEncoded);
        var searcherMiniString = new MiniStringTradeBrowser(tr.tradesMiniString);

        var account = tr.tradeRefs[1000].getAccount();

        while (true) {
            cronoSum(() -> searcherRef.sumByAccountStream(account), "Ref with stream");
            cronoSum(() -> searcherRef.sumByAccountFor(account), "Ref with for");

            cronoSum(() -> searcherRefEncoded.sumByAccountFor(account), "RefEncoded with for");
            cronoSum(() -> searcherRefEncoded.sumByAccountStream(account), "RefEncoded with stream");

            cronoSum(() -> searcherInline.sumByAccountFor(account), "Inline with for");
//            cronoSum(() -> searcherInline.sumByAccountStream(account), "Inline with stream");

            cronoSum(() -> searcherMiniString.sumByAccountFor(account), "MiniString with for");
//            cronoSum(() -> searcherMiniString.sumByAccountStream(account), "MiniString with stream");

        }

    }

    private static void cronoSum(Supplier<Double> searcher, String desc) {
        var start = System.currentTimeMillis();
        var tot = searcher.get();
        var elapsed = System.currentTimeMillis() - start;
        System.out.println(elapsed + " sum by " + desc + " is " + tot);
    }


}

/*
250 sum by Ref with stream is 4.71527595E8
262 sum by Ref with for is 4.71527595E8
154 sum by RefEncoded with for is 4.71527595E8
149 sum by RefEncoded with stream is 4.71527595E8
44 sum by Inline with for is 4.71527595E8
7 sum by MiniString with for is 4.71527595E8

 */
