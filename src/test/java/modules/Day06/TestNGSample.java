package modules.Day06;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGSample {

    @DataProvider(name = "SumTestData") //Cung cap Data
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {1,1,2},
                new Object[] {2,2,4},
//                new Object[] {4,1,5},
        };
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(dataProvider = "SumTestData") //Goi data lay tu @Data Provider
    public void TC01(int firstNum, int secondNum, int expectedResult) {
        System.out.println("The first test");
        Assert.assertEquals(sum(firstNum, secondNum), expectedResult,"Wrong result");
    }

    @Test
    public void TC02() {
        System.out.println("The second test");
        Assert.assertFalse(sum(3, 1) == 2);
    }


    @Test
    public void TC03() {
        System.out.println("The third test");
        Assert.assertEquals(sum(5, 1), 3,"Wrong result");
    }

    @Test
    public void TC04() {
        System.out.println("The fourth test");
        Assert.assertEquals(sum(1, 1), 3,"Wrong result");
    }

    @Test
    public void TC05() {
        System.out.println("The fifth test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Group");
    }

    private int sum(int a, int b) {
        return a + b;
    }


}
