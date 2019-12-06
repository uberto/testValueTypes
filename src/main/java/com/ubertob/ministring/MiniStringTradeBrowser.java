package com.ubertob.ministring;

import java.util.Arrays;

public class MiniStringTradeBrowser {
    final TradeMiniString[] repo;

    public MiniStringTradeBrowser(TradeMiniString[] repo) {
        this.repo = repo;
    }


    //Exception in thread "main" java.lang.ClassFormatError: Illegal class name "Qcom/ubertob/ministring/TradeMiniString;" in class file <Unknown>
    public double sumByAccountStream(String account){
        var acc = new MiniString(account);

        return Arrays.stream(repo)
                .filter( trade -> trade.account == acc)
                .map(trade -> trade.amount)
                .reduce(0.0, (a, b) -> a+b);
    }

    public double sumByAccountFor(String account){
        long raw = new MiniString(account).raw;
        double res = 0;
        for (int i = 0; i < repo.length; i++) {
            TradeMiniString trade = repo[i];
            if (trade.account.raw == raw)
                res = res + trade.amount;
        }
        return res;
    }

}
