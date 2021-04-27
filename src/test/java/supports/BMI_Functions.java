package supports;

import objects.BMIPage;

import static supports.CommonFunctions.*;

public class BMI_Functions extends BMIPage{

    public BMI_Functions selectMetricTab() {
        click(metric_tab_locator);
        return this;
    }

    public BMI_Functions fillBmiForm(String age, String gender, String height, String weight) {
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
}
