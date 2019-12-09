package com.ubertob.ministring;

public class TradeRef {
    public final double amount;
    public final String account;
    public final String security;

    public TradeRef(double amount, String account, String security) {
        this.amount = amount;
        this.account = account;
        this.security = security;
    }
}
