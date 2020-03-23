public class Dollar {
    private int amount;

    public void add(int amount) {
        this.amount +=amount;
    }
    Dollar times(int times){
        return new Dollar(amount*times);
    }
    public Dollar(int amount) {
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
