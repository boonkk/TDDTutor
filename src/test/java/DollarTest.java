
import org.junit.Assert;
import org.junit.Test;


public class DollarTest {

    @Test
    public void addingTest(){
        Dollar money = new Dollar(2);
        money.times(3);
        Assert.assertEquals(6,money.getAmount());
        money.add(5);
        Assert.assertEquals(11, money.getAmount());
    }
}
