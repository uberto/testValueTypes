package com.ubertob.ministring;

import java.util.Arrays;

public class TradeRefBrowser {
    final Trade[] repo;

    public TradeRefBrowser(Trade[] repo) {
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
            if (repo[i].getAccount().equals(account))
                res = res + repo[i].getAmount();
        }
        return res;
    }

}
