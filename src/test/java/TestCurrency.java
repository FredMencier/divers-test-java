import org.junit.Assert;
import org.junit.Test;

public class TestCurrency {

    @Test
    public void shouldNotBeEquals() {
        Currency ccy1 = new Currency();
        ccy1.setCode("CHF");

        Currency ccy2 = new Currency();
        ccy2.setCode("CHF");

        Assert.assertFalse(ccy1 == ccy2);
    }

    @Test
    public void shouldBeEquals() {
        Currency ccy1 = new Currency();
        ccy1.setCode("EUR");

        Currency ccy2 = new Currency();
        ccy2.setCode("EUR");

        Assert.assertTrue(ccy1.equals(ccy2));
    }
}
