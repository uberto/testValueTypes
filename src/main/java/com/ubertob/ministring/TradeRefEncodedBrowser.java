package com.ubertob.ministring;

import java.util.Arrays;

public class TradeRefEncodedBrowser {
    final TradeRefEncoded[] repo;

    public TradeRefEncodedBrowser(TradeRefEncoded[] repo) {
        this.repo = repo;
    }

    public double sumByAccountStream(String account){
        long encodedAccount = MiniString.encode(account);
        return Arrays.stream(repo)
                .filter( trade -> trade.account == encodedAccount)
                .map(trade -> trade.amount)
                .reduce(0.0, (a, b) -> a+b);
    }

    public double sumByAccountFor(String account){
        long encodedAccount = MiniString.encode(account);
        double res = 0;
        for (int i = 0; i < repo.length; i++) {
            if (repo[i].account == encodedAccount)
                res = res + repo[i].amount;
        }
        return res;
    }

}
