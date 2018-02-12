import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class GroupDeletionTest extends CommonMethods{

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
@Test
public void groupDeletionTest(){
    openAddressBook();
        login();
        selectGroup();

}

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
        wd.findElement(By.name("delete")).click();

    }

    private void openAddressBook() {
        wd.get("http://localhost/addressbook/");
    }


    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
