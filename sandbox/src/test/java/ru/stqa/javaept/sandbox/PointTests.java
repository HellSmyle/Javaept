package ru.stqa.javaept.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDis(){
      Point p = new Point(14,27);
      Point p2 = new Point(33,56);
      Assert.assertEquals(p.dis(p2), 34.66987164671943);

    }
  @Test
  public void testDisError(){
    Point p = new Point(14,27);
    Point p3 = new Point(33,56);
    Assert.assertNotEquals(p.dis(p3), 371943);

  }
}
