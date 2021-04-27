package modules.Day07;

import libraries.BMIFunctions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BMITest extends BaseTest {

    @DataProvider(name = "bmidata")
    public Object[][] testData() {
        return new Object[][]{
                new Object[]{"30", "male", "172", "64", "BMI = 21.6 kg/m2   (Normal)"},
                new Object[]{"30", "male", "172", "64", "BMI = 21.6 kg/m2   (Normal)"},
                new Object[]{"30", "male", "172", "64", "BMI = 21.6 kg/m2   (Normal)"},
                new Object[]{"30", "male", "172", "64", "BMI = 20.70 kg/m2  (Normal)"},
                new Object[]{"30", "male", "172", "64", "BMI = 20.70 kg/m2  (Normal)"},
                new Object[]{"30", "male", "172", "64", "BMI = 21.6 kg/m2   (Normal)"},
        };
    }


    @Test(dataProvider = "bmidata")
    public void bmiCalculate(String age,
                             String gender,
                             String height,
                             String weight,
                             String expectedResult)
    {
        BMIFunctions bmiPage = new BMIFunctions();
        bmiPage.selectMetricTab();
        bmiPage.fillBmiForm(age, gender, height, weight);
        Assert.assertEquals(bmiPage.getResult(), expectedResult);
    }


}
