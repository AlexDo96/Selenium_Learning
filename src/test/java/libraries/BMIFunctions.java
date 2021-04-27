package libraries; //Functions of product methods


import objects.BMIPage;

import static supports.CommonFunctions.*;

public class BMIFunctions {
    BMIPage bmiPage = new BMIPage();

    public void selectMetricTab() {
        click(bmiPage.metric_tab_locator);
    }

    public void fillBmiForm(String age, String gender, String height, String weight) {
        fill(bmiPage.age_field_locator, age);
        if (gender.equalsIgnoreCase("male")) {
            click(bmiPage.male_rad_locator);
        } else click(bmiPage.female_rad_locator);

        fill(bmiPage.height_field_locator, height);
        fill(bmiPage.weight_field_locator, weight);
        click(bmiPage.calculate_button_locator);
    }

    public String getResult() {
        return getText(bmiPage.result_label_locator);
    }
}
