package lv.iljapavlovs.testng.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class GoogleSearchResultPage extends Page {

    @FindBy(how = How.CLASS_NAME, using = "g")
    private List<WebElement> searchResultElements;

    public GoogleSearchResultPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("g")));
    }

    public List<WebElement> getSearchResultElements() {
        return searchResultElements;
    }

    ;
}
