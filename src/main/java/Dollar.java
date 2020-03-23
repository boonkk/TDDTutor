public class Dollar {
    private int amount;

    public void add(int amount) {
        this.amount +=amount;
    }
    void times(int times){
        amount *= times;
    }
    public Dollar(int amount) {
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }


}
