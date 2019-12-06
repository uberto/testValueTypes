package com.ubertob.examples;

import com.ubertob.ministring.InlineTradeBrowser;
import com.ubertob.ministring.MiniStringTradeBrowser;
import com.ubertob.ministring.TradeBrowserRef;
import com.ubertob.ministring.TradeRepository;

import java.util.function.Supplier;

public class MiniStringTrades {

    public static void generatingTradesAndBrowing() {

        var tr = new TradeRepository();

        tr.preparingData();

        var searcherRef = new TradeBrowserRef(tr.tradesWithRef);
        var searcherInline = new InlineTradeBrowser(tr.tradesInline);
        var searcherMiniString = new MiniStringTradeBrowser(tr.tradesMiniString);

        var account = tr.tradesWithRef[1000].getAccount();

        while (true) {
            cronoSum(() -> searcherRef.sumByAccountFor(account), "Ref with for");
            cronoSum(() -> searcherRef.sumByAccountStream(account), "Ref with stream");

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
Ref
885 sum by ACC88342 is 99528.0 stream
1229 sum by ACC88342 is 99528.0 for

Inline
2482 sum by ACC88342 is 99528.0
2414 sum by ACC88342 is 99528.0

Mini
1022 sum by ACC88342 is 99528.0
1485 sum by ACC88342 is 99528.0
 */
