package com.ubertob.ministring;

import java.util.Objects;

public class TradeRef {
    public final double amount;
    public final String account;
    public final String security;

    public TradeRef(double amount, String account, String security) {
        this.amount = amount;
        this.account = account;
        this.security = security;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeRef tradeRef = (TradeRef) o;
        return Double.compare(tradeRef.amount, amount) == 0 &&
                Objects.equals(account, tradeRef.account) &&
                Objects.equals(security, tradeRef.security);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, account, security);
    }
}
