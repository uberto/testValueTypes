package com.ubertob.ministring;

inline public class TradeMiniString implements Trade {
    final double amount;
    final MiniString account;
    final MiniString security;

    public TradeMiniString(double amount, String account, String security) {
        this.amount = amount;
        this.account = new MiniString(account);
        this.security = new MiniString(security);
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getAccount() {
        return account.get();
    }

    @Override
    public String getSecurity() {
        return security.get();
    }
}
