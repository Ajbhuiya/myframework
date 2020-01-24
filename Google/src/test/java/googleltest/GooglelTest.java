package googleltest;

import common.CommonAPI;
import googlehome.Google;
import org.testng.annotations.Test;

public class GooglelTest extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://google.com/mail");
        Google hp = new Google();
        hp.logIn("firoz11218@gmail.com", "test");
    }
    @Test
    public void search() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.search("book");
    }
    @Test
    public void goStore() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.goStore();
    }
    @Test
    public void goImages() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.images("book");
    }
    @Test
    public void trySearchWithBlank() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.searchBlank();
    }
    @Test
    public void tryVoiceSearch() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.voiceSearch();
    }
    @Test
    public void searchDropDown() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.searchFirstDropDown();
    }
    @Test
    public void searchandClickfirstlink() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.searchAndClickFirstResult("java");
    }
    @Test
    public void goAboutPage() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.goAboutPage();
    }
    @Test
    public void goSettingsPage() {
        driver.get("https://google.com");
        Google hp = new Google();
        hp.goSettingsPage();
    }
}