package ru.stqa.javaept.addressbook.tests;


import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.javaept.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=submit | ]]
    app.getGroupHelper().returntoGroupPage();
  }


}

