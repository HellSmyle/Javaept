package ru.stqa.javaept.addressbook.tests;


import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.javaept.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=submit | ]]
    app.returntoGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }


}

