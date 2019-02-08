package ru.stqa.javaept.addressbook;


import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=submit | ]]
    returntoGroupPage();
    wd.findElement(By.linkText("Logout")).click();
  }


}

