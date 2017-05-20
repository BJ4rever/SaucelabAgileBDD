package SauceLabAgileBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Gamita on 18/05/2017.
 */
public class HomePage extends Utils {

    public void userIsOnHomePage(){
        driver.get("https://www.tesco.com/groceries/?icid=dchp_groceries_signin");

    }

    public void userShouldAbleToSearchAnyProduct(String productName){
        //Type any product on Search Menu on homepage
        typeText(By.id("searchBox-2"),productName);
        //click on search button
        clickOnElement(By.id("searchBtn"));
    }

    public void verifySearchResult(String product){
        WebElement productGrid = driver.findElement(By.className("productLists"));
        List<WebElement> productNames = productGrid.findElements(By.xpath("//ul[@class='products grid']/li/div/h2/a/span[2]"));
        java.util.Iterator<WebElement> x = productNames.iterator();
        while (x.hasNext()){
            WebElement productName = x.next();
            System.out.println(productName.getText());
            Assert.assertTrue(productName.getText().contains(product));
        }
    }
}
