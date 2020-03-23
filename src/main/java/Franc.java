public class Franc extends Money {
    public Franc times(int times){
        return new Franc(amount*times);
    }

    public Franc(int amount) {
        this.amount=amount;
    }

}