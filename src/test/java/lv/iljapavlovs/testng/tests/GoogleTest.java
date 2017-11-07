package lv.iljapavlovs.testng.tests;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Flaky;
import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import lv.iljapavlovs.testng.base.TestBase;
import lv.iljapavlovs.testng.pageobjects.GooglePage;
import lv.iljapavlovs.testng.pageobjects.GoogleSearchResultPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static lv.iljapavlovs.testng.core.DriverBase.getDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

@Epic("Google")
@Feature("Google Search")
public class GoogleTest extends TestBase {

    @Test(groups = {"smoke"})
    @Flaky
    @Description("Searching for fish")
    @Story("Fish Search")
    @Severity(SeverityLevel.CRITICAL)
    @Issues({
            @Issue("MYISSUE-1"),
            @Issue("MYISSUE-2")
    })
    @TmsLink("TMS-123")
    public void searchForFishTest() {
        //Arrange
        GooglePage googlePage = new GooglePage(getDriver());
        //Act
        GoogleSearchResultPage googleSearchResultPage = googlePage.searchFor("Fish!");
        List<WebElement> searchResultElements = googleSearchResultPage.getSearchResultElements();
        //Assert
        assertThat(searchResultElements.get(0).getText().toLowerCase(), containsString("fish"));
        assertThat("Purposefully fail this test", true, is(false));
    }


    @Test(groups = {"smoke"})
    @Story("Cheese Search")
    @Issue("ALR-123")
    @TmsLink("TMS-123")
    public void searchForCheeseTest() {
        //Arrange
        GooglePage googlePage = new GooglePage(getDriver());
        //Act
        GoogleSearchResultPage googleSearchResultPage = googlePage.searchFor("Cheese!");
        List<WebElement> searchResultElements = googleSearchResultPage.getSearchResultElements();
        //Assert
        assertThat(searchResultElements.get(0).getText().toLowerCase(), containsString("cheese"));
    }

    @Test(groups = {"smoke"})
    @Story("Milk Search")
    @Issue("ALR-123")
    @TmsLink("TMS-123")
    public void searchForMilkTest() {
        //Arrange
        GooglePage googlePage = new GooglePage(getDriver());
        //Act
        GoogleSearchResultPage googleSearchResultPage = googlePage.searchFor("Milk!");
        List<WebElement> searchResultElements = googleSearchResultPage.getSearchResultElements();
        //Assert
        assertThat(searchResultElements.get(0).getText().toLowerCase(), containsString("milk"));
    }


    @Test(groups = {"smoke"})
    @Story("Eggs Search")
    @Issue("ALR-123")
    @TmsLink("TMS-123")
    public void searchForEggsTest() {
        //Arrange
        GooglePage googlePage = new GooglePage(getDriver());
        //Act
        GoogleSearchResultPage googleSearchResultPage = googlePage.searchFor("Eggs!");
        List<WebElement> searchResultElements = googleSearchResultPage.getSearchResultElements();
        //Assert
        assertThat(searchResultElements.get(0).getText().toLowerCase(), containsString("eggs"));

    }
}
