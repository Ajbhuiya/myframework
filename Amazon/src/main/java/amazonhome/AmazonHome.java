package amazonhome;

import common.CommonAPI;
import org.openqa.selenium.By;

public class AmazonHome extends CommonAPI {


    public void search() {
        this.driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
    }

}
