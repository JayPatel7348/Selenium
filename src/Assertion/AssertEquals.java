package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;


/**
 * @author Jaypatel
 */
public class AssertEquals {

    ChromeDriver driver;
    @BeforeClass
    public void OpenBroser()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser Opened and Maximized");
        driver.get("http://stock.scriptinglogic.org/");
        driver.getTitle();
    }
    @AfterClass
    public void CloseBroser()
    {
        driver.quit();
        System.out.println("Browser Closed");
    }
    @Test
    public void ValidLogin() throws InterruptedException {
      driver.findElement(By.id("login-username")).sendKeys("admin");
      driver.findElement(By.id("login-password")).sendKeys("admin");

      driver.findElement(By.name("submit")).click();

      String expected="Dashboard";
        String actual="";
        Thread.sleep(2000);
      try
      {
          actual = driver.findElement(By.xpath("//a[@href='dashboard.php']")).getText();
      }
      catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

      Assert.assertEquals(expected,actual,"Issue while matching result");
    }
    @Test
    public void BlankLogin()
    {
        driver.findElement(By.name("submit")).click();

        ArrayList<String> expected=new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");

        ArrayList<String> actual=new ArrayList<>();

        try
        {
           String actual1 = driver.findElement(By.xpath("//label[@for='login-username'][@class='error']")).getText();
           String actual2 = driver.findElement(By.xpath("//label[@for='login-password'][@class='error']")).getText();

           actual.add(actual1);
           actual.add(actual2);
        }
        catch(Exception e)
        {

        }

        Assert.assertEquals(expected,actual,"Issue while matching result");
    }


}
