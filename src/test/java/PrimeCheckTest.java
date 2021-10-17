import com.packagename.myapp.PrimeFinderService;
import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertEquals;

public class PrimeCheckTest {
    PrimeFinderService primeFinderService;
    @Before
    public void setup() {
        primeFinderService = new PrimeFinderService();

    }

    @Test
    public void testEnter2AsANumber() {
        String actual = primeFinderService.inputPrimeNum("2");
        String expected = "Your Primes are: 2,";
        Assert.assertThat(actual, containsString(expected));
    }

    @Test
    public void testEnter3AsANumber() {
        String actual = primeFinderService.inputPrimeNum("3");
        String expected = "Your Primes are: 2, 3,";
        Assert.assertThat(actual, containsString(expected));
    }

    @Test
    public void testEnter11AsANumber() {
        String actual = primeFinderService.inputPrimeNum("11");
        String expected = "Your Primes are: 2, 3, 5, 7, 11,";
        Assert.assertThat(actual, containsString(expected));
    }

    @Test
    public void testEnter6AsANumber() {
        String actual = primeFinderService.inputPrimeNum("6");
        String expected = "Your Primes are: 2, 3, 5,";
        Assert.assertThat(actual, containsString(expected));
    }

}