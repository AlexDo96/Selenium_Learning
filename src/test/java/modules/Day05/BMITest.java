package modules.Day05;

import supports.BMI_Functions;
import static supports.CommonFunctions.*;

public class BMITest {
    public static void main(String[] args) {
        launchBrowser("chrome");
        String url = "https://www.calculator.net/bmi-calculator.html";
        BMI_Functions bmi_functions = new BMI_Functions();

        navigate(url);
        System.out.println("\nBMI Result:" + bmi_functions.selectMetricTab().fillBmiForm("23", "male", "170", "70").getResult());
        closeBrowser();
    }
}
