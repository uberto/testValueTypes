package com.ubertob.ministring;

public class TradeRefEncoded{
    final double amount;
    final long account;
    final long security;

    public TradeRefEncoded(double amount, String account, String security) {
        this.amount = amount;
        this.account = MiniString.encode( account);
        this.security = MiniString.encode(security);
    }

}
