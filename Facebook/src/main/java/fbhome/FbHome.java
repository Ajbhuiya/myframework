package fbhome;

import common.CommonAPI;
import org.openqa.selenium.By;

public class FbHome extends CommonAPI {

    public void logIn(String email, String password) {
        this.driver.findElement(By.id("email")).sendKeys(email);
        this.driver.findElement(By.id("pass")).sendKeys(password);
        this.driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }

    public void changeLanguage() {
        this.driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[3]/a")).click();
    }

    public void userCanCreatePage() {
        this.driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
    }

    public void userCanSignUp(String firstname, String lastname, String email, String password
            , String month, String day, String year) {
        this.driver.findElement(By.name("firstname")).sendKeys(firstname);
        this.driver.findElement(By.name("lastname")).sendKeys(lastname);
        this.driver.findElement(By.name("reg_email__")).sendKeys(email);
        this.driver.findElement(By.name("reg_passwd__")).sendKeys(password);
        this.driver.findElement(By.name("birthday_month")).sendKeys(month);
        this.driver.findElement(By.name("birthday_day")).sendKeys(day);
        this.driver.findElement(By.name("birthday_year")).sendKeys(year);
        this.driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
        this.driver.findElement(By.name("websubmit")).click();
        this.driver.findElement(By.name("websubmit")).click();
    }

    public void useCanFindAccount(String email) {
        this.driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
        this.driver.findElement(By.id("identify_email")).sendKeys(email);
    }

    public void userCantloginWithoutPassword(String email) {
        this.driver.findElement(By.id("email")).sendKeys(email);
        this.driver.findElement(By.id("u_0_2")).click();
    }

    public void userCanGoInstagramPage() throws InterruptedException {
        this.driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[14]/a"));
        Thread.sleep(5000);
    }

    public void userCanGoFbMarketplace() {
        this.driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[12]/a"));

    }
}

