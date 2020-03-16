package Old.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {


    @Test
    void test1() {
        String s1 = "hello", s2 = "hello";

        Assert.assertEquals(s1, s2);

    }


}
