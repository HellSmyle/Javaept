package ru.stqa.javaept.sandbox;

public class Point {int x, y;

  public Point(int x, int y) {

    this.x = x;

    this.y = y;

  }

  public Point (int x, boolean y) {}

  public double dis(Point p) {
    double distance = Math.sqrt(((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)));
    return distance;
  }

}