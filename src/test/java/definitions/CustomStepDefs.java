package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class CustomStepDefs {
    @Given("client open web page")
    public void clientOpenWebPage() throws InterruptedException {
        getDriver().navigate().to("https://google.com");
        Thread.sleep(2000);
        WebElement searchBar = getDriver().findElement(By.xpath("//textarea[@name='q']"));
        searchBar.sendKeys("Portnov");
        searchBar.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        getDriver().navigate().back();
        Thread.sleep(1000);
        getDriver().navigate().forward();
        Thread.sleep(1000);
        getDriver().navigate().refresh();
        Thread.sleep(1000);
    }

    @Given("client open portnov web page")
    public void clientOpenPortnovWebPage() {
        getDriver().get("https://portnov.com");
    }


    @Then("client set browser size to mobile")
    public void clientSetBrowserSizeToMobile() {
        getDriver().manage().window().setSize(new Dimension(980, 600));
        WebElement headerBar = getDriver().findElement(By.xpath("//div[@id='header-bar-desktop']"));
        boolean headerBarDisplayed = headerBar.isDisplayed();
        assertThat(headerBarDisplayed).isFalse();
    }
}



