package ru.stqa.javaept.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello(" world");
    hello(" user");
    hello(" Lena");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point(14,27);
    Point p2 = new Point(33,56);
    System.out.println("Diff = " + p.dis(p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello" + somebody + "!");
  }





}
