package com.ubertob.ministring;

import java.util.Objects;

public class TradeRefEncoded{
    final double amount;
    final long account;
    final long security;

    public TradeRefEncoded(double amount, String account, String security) {
        this.amount = amount;
        this.account = MiniString.encode( account);
        this.security = MiniString.encode(security);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeRefEncoded that = (TradeRefEncoded) o;
        return Double.compare(that.amount, amount) == 0 &&
                account == that.account &&
                security == that.security;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, account, security);
    }
}
