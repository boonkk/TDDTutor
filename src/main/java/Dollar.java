public class Dollar {
    private int amount;

    public Dollar times(int times){
        return new Dollar(amount*times);
    }

    public Dollar(int amount) {
        this.amount=amount;
    }
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
