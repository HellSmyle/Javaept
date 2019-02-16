package ru.stqa.javaept.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javaept.addressbook.model.UserData;
import ru.stqa.javaept.addressbook.tests.TestBase;

public class NewContactCreationTests extends TestBase {


  @Test
  public void testNewContactCreation() {
    app.getNavigationHelper().addNewContact();
    app.getUserHelper().fillNewContactForm(new UserData("Helen", "Zoz", "0936777963", "zozelenka@gmail.com", "test1"), true);
    app.getUserHelper().submitNewContactCreation();






  }







  }


