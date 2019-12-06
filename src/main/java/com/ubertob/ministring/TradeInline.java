package com.ubertob.ministring;

inline public class TradeInline implements Trade {
    final double amount;
    final String account;
    final String security;

    public TradeInline(double amount, String account, String security) {
        this.amount = amount;
        this.account = account;
        this.security = security;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getAccount() {
        return account;
    }

    @Override
    public String getSecurity() {
        return security;
    }
}
