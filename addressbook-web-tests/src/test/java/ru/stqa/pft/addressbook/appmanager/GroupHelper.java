package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void submitGroup() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillInGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGrHeader());
        type(By.name("group_footer"), groupData.getFooter());
        driver.findElement(By.name("group_footer")).clear();

    }

    private void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    private void createNewGroup() {
        driver.findElement(By.name("new")).click();
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void initGroupModification() {
        driver.findElement(By.name("edit")).click();
    }

    public void submitGroupModification() {
        driver.findElement(By.name("update")).click();
    }
}
