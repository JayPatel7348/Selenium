package SelemiumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Jaypatel
 */
public class DropdownCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://codefixup.com/demo/multiselect-dropdown-with-checkbox/");
        driver.findElement(By.className("multi-select-button")).click();
        Thread.sleep(2000);

        WebElement dm1=driver.findElement(By.tagName("input"));
        Select sdm=new Select(dm1);
        sdm.selectByIndex(0);


                /*
        WebElement d1=driver.findElement(By.id("people_0"));
        if(d1.isSelected()==false)
          d1.click();

        WebElement d2=driver.findElement(By.id("people_1"));
        if(d2.isSelected()==false)
            d2.click();

        WebElement d3=driver.findElement(By.id("people_2"));
        if(d3.isSelected()==false)
            d3.click();
*/

            }
        }



