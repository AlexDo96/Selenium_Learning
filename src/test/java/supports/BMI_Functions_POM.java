package supports;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

import static supports.CommonFunctions.*;

public class BMI_Functions_POM extends LoadableComponent<BMI_Functions_POM>{

    @FindBy(xpath = "//a[.='Metric Units']")
    By metric_tab_locator;

    @FindBy(id = "cage")
    By age_field_locator;

    @FindBy(xpath = "//input[@id='csex2']/following-sibling::span")
    By female_rad_locator;

    @FindBy(xpath = "//input[@id='csex1']/following-sibling::span")
    By male_rad_locator;

    @FindBy(id = "cheightmeter")
    By height_field_locator;

    @FindBy(id = "ckg")
    By weight_field_locator;

    @FindBy(xpath = "//input[@alt='Calculate']")
    By calculate_button_locator;

    @FindBy(className = "bigtext")
    By result_label_locator;




    public BMI_Functions_POM selectMetricTab() {
        click(metric_tab_locator);
        return this;
    }

    public BMI_Functions_POM fillBmiForm(String age, String gender, String height, String weight) {
        clearText(age_field_locator);
        fill(age_field_locator, age);

        if (gender.equalsIgnoreCase("female")) {
            click(female_rad_locator);
        } else click(male_rad_locator);

        clearText(height_field_locator);
        fill(height_field_locator, height);
        clearText(weight_field_locator);
        fill(weight_field_locator, weight);
        click(calculate_button_locator);

        return this;
    }


    public String getResult() {
        return getText(result_label_locator);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }



}
