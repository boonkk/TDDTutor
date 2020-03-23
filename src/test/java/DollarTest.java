
import org.junit.Assert;
import org.junit.Test;


public class DollarTest {


    @Test
    public void multiplicationTest() {
        Dollar five= new Dollar(5);
        Dollar product= five.times(2);
        Assert.assertEquals(10, product.getAmount());
        product= five.times(3);
        Assert.assertEquals(15, product.getAmount());
    }
    @Test
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
