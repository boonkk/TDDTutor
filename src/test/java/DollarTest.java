
import org.junit.Assert;
import org.junit.Test;


public class DollarTest {


    @Test
    public void multiplicationTest() {
        Money five = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        Assert.assertEquals(Money.franc(10), five.times(2));
        Assert.assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testFrancEquality() {
        Assert.assertTrue(Money.franc(10).equals(Money.franc(10)));
        Assert.assertFalse(Money.franc(10).equals(Money.franc(11)));
    }

    @Test
    public void testFrancDollar() {
        Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
}
