package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase{

    private boolean acceptNextAlert = true;

    @Test
    public void testGroupCreation() throws Exception{

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().fillInGroupForm(new GroupData("test", "test"));
        app.getGroupHelper().submitGroup();
    }

}
