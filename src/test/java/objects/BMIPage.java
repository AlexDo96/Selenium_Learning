package objects;

import org.openqa.selenium.By;

public class BMIPage {
    public By metric_tab_locator = By.xpath("//a[.='Metric Units']");
    public By age_field_locator = By.id("cage");
    public By male_rad_locator = By.xpath("//input[@id='csex1']/following-sibling::span");
    public By female_rad_locator = By.xpath("//input[@id='csex2']/following-sibling::span");
    public By height_field_locator = By.id("cheightmeter");
    public By weight_field_locator = By.id("ckg");
    public By calculate_button_locator = By.xpath("//input[@alt='Calculate']");
    public By result_label_locator = By.className("bigtext");
}
