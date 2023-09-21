package SelemiumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Jaypatel
 */
public class ListBoxdemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");
        WebElement sel= driver.findElement(By.id("source_118"));
        Select selop=new Select(sel);
        selop.selectByIndex(0);
        selop.selectByVisibleText("Delhi");
        selop.selectByValue("4215");

        WebElement addbtn=driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));
        addbtn.click();

        WebElement sel1= driver.findElement(By.id("fld_118"));
        Select selbox=new Select(sel1);
        //selbox.selectByIndex(0);
        selbox.selectByIndex(1);

        WebElement rembtn=driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
        rembtn.click();

    }
}
