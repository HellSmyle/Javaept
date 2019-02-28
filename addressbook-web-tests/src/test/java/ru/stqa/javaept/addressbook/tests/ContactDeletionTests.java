package ru.stqa.javaept.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javaept.addressbook.model.UserData;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion () {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getUserHelper().isThereAContact()) {
        app.getUserHelper().createContact(new UserData("Helen", "Zoz", "0936777963", "zozelenka@gmail.com", "test1"), true);}
    app.getUserHelper().selectContact();
    app.getUserHelper().deleteSelectedContact();
    app.getNavigationHelper().gotoHomePage();


  }


  }
