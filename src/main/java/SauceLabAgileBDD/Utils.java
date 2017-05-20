package SauceLabAgileBDD;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gamita on 19/05/2017.
 */
public class Utils extends BasePage {


    //Reusable Method for FailedTestScreenShot
    public static void failBrowserScreenShot(String filepath, Scenario scenario){
        if(scenario.isFailed()){
            try{
                byte[]screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                TakesScreenshot takesScreenshot =(TakesScreenshot)driver;
                File screenShot1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
                scenario.embed(screenshot,"image/png");
                FileUtils.copyFile(screenShot1,new File(filepath + "\\photo"+dateStamp() + ".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //Reusable Method For DateStamp
    public static String dateStamp(){
        DateFormat dateFormat = new SimpleDateFormat("ddmmyyhhss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    //re-usable meyhof for click on Element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }

    // re-usable method for typing text into element (instead of sendKeys())
    public static void typeText(By by, String text){
        //clearing any existing text from the element
        driver.findElement(by).clear();
        //sending your text to the locator by
        driver.findElement(by).sendKeys(text);
    }

    //Reusable Method for selectByValue
    public static void selectValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    //Reusable method for selectByIndex
    public static void selectIndex(By by, int i){
        Select select;
        new Select(driver.findElement(by)).selectByIndex(i);
    }

    //Reusable method for selecting checkbox
    public static void selectCheckbox(By by){
        if (!driver.findElement(by).isSelected()){   // check if the checkbox is NOT ticked/selected
            driver.findElement(by).click();          // tick on the checkbox
        }
    }

    //Reusable method for selectByVisibleText(NameLassObject)
    public static void selectText(By by, String text){

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    //Reusable method for getText
    public static String getTextFromElement(By by){     //return type as String - why? to store and return the test we are receving from the element
        String text =  driver.findElement(by).getText();                                                          // so we can reuse the text
        return text;
    }
}
