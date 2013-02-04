package pl.mszulc.dictionary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 04.02.13
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */

@RunWith(Parameterized.class)
public class PonsDictionaryTest {

    private final String given;
    private final String expected;

    public PonsDictionaryTest(String given, String expected) {
        this.given = given;
        this.expected = expected;
    }

    @Test
    public void shouldReturnDomTranslation() throws Exception {
        Dictionary d = new PonsDictionary("depl");
        String result = d.getEntry(given);
        assertEquals(expected, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
            Object[][] data = new Object[][] { { "dom", "Haus nt" }, { "dupa", "Arsch m wulg"} };
            return Arrays.asList(data);
    }
}
