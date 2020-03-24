public class Franc extends Money {
    public Money times(int times){
        return new Franc(amount*times);
    }

    public Franc(int amount) {
        this.amount=amount;
    }

}