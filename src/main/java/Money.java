public class Money implements Expression {
    protected int amount;
    protected String currency;
    public Money(int amount, String currency) {
        this.currency = currency;
        this.amount=amount;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency.equals(money.currency);
    }

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount,"USD");
    }

    static Money franc(int amount) {
        return new Money(amount,"CHF");
    }

    public Money times(int times){
        return new Money(amount*times, currency);
    }

    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public Money reduce(String to) {
        return this;
    }

}
