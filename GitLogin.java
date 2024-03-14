package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class opengithubaccount {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://github.com/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("login_field")).sendKeys("bitramohanyaswanthkumar@gmail.com");
        driver.findElement(By.id("password")).sendKeys("$1$4UDatfVZ$57vTky5L1tucByk0fvyH7.");// standard *** encryption password for my account privacy
        driver.findElement(By.name("commit")).submit();
    }
}
