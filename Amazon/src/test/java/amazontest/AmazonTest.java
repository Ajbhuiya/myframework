package amazontest;

import common.CommonAPI;
import org.testng.annotations.Test;

public class AmazonTest extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://amazon.com");
        AmazonTest am = new AmazonTest();
        am.testUserCanLogInSuccessfully();
    }
}