public class Franc {
    private int amount;

    public Franc times(int times){
        return new Franc(amount*times);
    }

    public Franc(int amount) {
        this.amount=amount;
    }
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

}