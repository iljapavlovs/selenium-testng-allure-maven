package lv.iljapavlovs.testng.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static lv.iljapavlovs.testng.constants.Constants.WAIT_EXPLICIT_SEC;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, WAIT_EXPLICIT_SEC);
    }

}
