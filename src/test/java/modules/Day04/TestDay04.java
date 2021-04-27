package modules.Day04;

import org.openqa.selenium.support.How;

import static supports.CommonFunctions.*;

public class TestDay04 {
    public static void main(String[] args) {
        launchBrowser("chrome");

        String url = "https://the-internet.herokuapp.com/tables";
        String celllocator1 = "//*[@id='table1']/tbody/tr[%d]/td[%d]";  //%d dai dien x (Int)
        String celllocator2 = "//*[@id='table2']/tbody/tr[%d]/td[%d]";  //%d dai dien x (Int)

        navigate(url);
        highlight(How.XPATH, "//table[@id='table1']");
        highlight(How.XPATH, "//table[@id='table2']");
        //commonFunction.captureScreenshot();

        int totalColumnsTable1 = getWebElementList(How.XPATH, "//table[@id='table1']/thead/tr/th").size();
        int totalRowsTable1 = getWebElementList(How.XPATH, "//table[@id='table1']/tbody/tr").size();
        int totalColumnsTable2 = getWebElementList(How.XPATH, "//table[@id='table2']/thead/tr/th").size();
        int totalRowsTable2 = getWebElementList(How.XPATH, "//table[@id='table2']/tbody/tr").size();

        /*System.out.println(String.format("Number column is %s, Number row is %s", totalColumnsTable1, totalRowsTable1));
        System.out.println("\n----------------------------------------------------------------------");

        commonFunction.tableDetail(celllocator1, totalRowsTable1, totalColumnsTable1);

        System.out.println(String.format("\nNumber column is %s, Number row is %s", totalColumnsTable2, totalRowsTable2));
        System.out.println("\n----------------------------------------------------------------------");

        commonFunction.tableDetail(celllocator2, totalRowsTable2, totalColumnsTable2);*/


        //---------------------------------------Home Work---------------------------------------
        /*System.out.println(day04HwFunctions.getTableIndexWithTextCondition(4,totalRowsTable1,"$50.00")+"");
        System.out.println("\n" + day04HwFunctions.getLastNameWithTextCondition(4, totalRowsTable1, "$50.00"));*/

        System.out.println("Last name with Due = $50.00:");

        closeBrowser();
    }
}
