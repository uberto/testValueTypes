package com.ubertob.ministring;

inline public class TradeMiniString{
    final double amount;
    final MiniString account;
    final MiniString security;

    public TradeMiniString(double amount, String account, String security) {
        this.amount = amount;
        this.account = new MiniString(account);
        this.security = new MiniString(security);
    }
}
