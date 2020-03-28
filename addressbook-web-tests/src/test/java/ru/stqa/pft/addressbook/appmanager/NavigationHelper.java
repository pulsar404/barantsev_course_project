package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver){
        this.driver = driver;
    }

    public void goToGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }
}
