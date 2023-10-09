package testNG1;



/**
 * @author Jaypatel
 */
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class classOne {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite");
    }
    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite");
    }



    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }
    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
