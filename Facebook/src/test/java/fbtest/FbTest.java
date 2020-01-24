package fbtest;

import common.CommonAPI;
import fbhome.FbHome;
import org.testng.annotations.Test;

public class FbTest extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.logIn("testemail", "testpass");
    }

    @Test
    public void userCanChangeLanguage() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.changeLanguage();
    }

    @Test
    public void userCanCreateAPage() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.userCanCreatePage();
    }

    @Test
    public void userCanSignUp() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.userCanSignUp("aj", "bhuiya", "realbhuiya1@gmail.com", "abc123", "jan", "22", "1990");
    }

    @Test
    public void findAccount() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.useCanFindAccount("realbhuiya1@gmail.com");

    }

    @Test
    public void cantLoginWithoutPass() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.userCantloginWithoutPassword("firoz11218@gmail.com");
    }

    @Test
    public void goToInstagramPage() throws InterruptedException {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.userCanGoInstagramPage();
    }

    @Test
    public void goToFbMarketplace() {
        driver.get("https://facebook.com");
        FbHome hp = new FbHome();
        hp.userCanGoFbMarketplace();


    }
}