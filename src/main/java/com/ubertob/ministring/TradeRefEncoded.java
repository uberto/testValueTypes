package com.ubertob.ministring;

public class TradeRefEncoded implements Trade {
    final double amount;
    final long account;
    final long security;

    public TradeRefEncoded(double amount, String account, String security) {
        this.amount = amount;
        this.account = MiniString.encode( account);
        this.security = MiniString.encode(security);
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getAccount() {
        return MiniString.decode(account);
    }

    @Override
    public String getSecurity() {
        return MiniString.decode(security);
    }
}
