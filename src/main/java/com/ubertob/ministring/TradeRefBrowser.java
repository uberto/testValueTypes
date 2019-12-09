package com.ubertob.ministring;

import java.util.Arrays;

public class TradeRefBrowser {
    final TradeRef[] repo;

    public TradeRefBrowser(TradeRef[] repo) {
        this.repo = repo;
    }

    public double sumByAccountStream(String account){
        return Arrays.stream(repo)
                .filter( trade -> trade.getAccount().equals(account))
                .map(trade -> trade.getAmount())
                .reduce(0.0, (a, b) -> a+b);
    }

    public double sumByAccountFor(String account){
        double res = 0;
        for (int i = 0; i < repo.length; i++) {
            TradeRef tradeRef = repo[i];
            if (tradeRef.account.equals(account))
                res = res + tradeRef.amount;
        }
        return res;
    }

}
