package modules.Day02;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
    public static void main(String[] args) {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("http://www.google.com");
    }
}
