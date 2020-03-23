public class Dollar extends Money {
    public Dollar times(int times){
        return new Dollar(amount*times);
    }

    public Dollar(int amount) {
        this.amount=amount;
    }


}
