package com.ubertob.ministring;

import java.util.Arrays;

public class InlineTradeBrowser {
    final TradeInline[] repo;

    public InlineTradeBrowser(TradeInline[] repo) {
        this.repo = repo;
    }

    public double sumByAccountStream(String account){
        return Arrays.stream(repo)
                .filter( trade -> trade.account.equals(account))
                .map(trade -> trade.amount)
                .reduce(0.0, (a, b) -> a+b);
    }

    public double sumByAccountFor(String account){
        double res = 0;
        for (int i = 0; i < repo.length; i++) {
            if (repo[i].account.equals(account))
                res = res + repo[i].amount;
        }
        return res;
    }

}
