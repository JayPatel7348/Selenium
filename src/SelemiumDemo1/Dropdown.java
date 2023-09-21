package SelemiumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * @author Jaypatel
 */
public class Dropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.lifepartner.in/");
        WebElement d1=driver.findElement(By.id("sel1"));
        Select selMinAge=new Select(d1);
        selMinAge.selectByVisibleText("20");

        WebElement d2=driver.findElement(By.id("sel2"));
        Select selMaxAge=new Select(d2);
        //selMaxAge.selectByValue("30");
        selMaxAge.selectByIndex(3);

        driver.get("https://blazedemo.com/");
        WebElement d3=driver.findElement(By.name("fromPort"));
        Select depaCity=new Select(d3);
        depaCity.selectByValue("Boston"); //value="Boston" inside tag, Not visible text on site




    }
}
