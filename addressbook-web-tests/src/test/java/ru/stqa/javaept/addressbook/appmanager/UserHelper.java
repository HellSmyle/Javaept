package ru.stqa.javaept.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.javaept.addressbook.model.GroupData;
import ru.stqa.javaept.addressbook.model.UserData;

public class UserHelper extends HelperBase {

  public UserHelper(WebDriver wd) {
    super(wd);
  }


  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillNewContactForm(UserData userData, boolean creation) {
    type(By.name("firstname"), userData.getFirstname());
    type(By.name("lastname"), userData.getLastname());
    type(By.name("mobile"), userData.getMobile());
    type(By.name("email"), userData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(userData.getGroup());

    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void submitNewContactCreation() {
    click(By.name("submit"));
  }

  public void gotoHomePage() {
    click(By.linkText("home"));
  }


  public void initModificationContact() {
    click(By.cssSelector("img[alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }


  public void createContact(UserData user, boolean b) {
    initContactCreation();
    fillNewContactForm(user, true);
    submitNewContactCreation();
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//*/input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

}
