package ru.stqa.javaept.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javaept.addressbook.model.UserData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification () {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getUserHelper().isThereAContact()) {
      app.getUserHelper().createContact(new UserData("Helen", "Zoz", "0936777963", "zozelenka@gmail.com", "test1"), true);}
    app.getUserHelper().initModificationContact();
    app.getUserHelper().fillNewContactForm(new UserData("test","test","133","test@gmail.com", "test1"),false);
    app.getUserHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();
  }
}
