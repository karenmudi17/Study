package test.sandbox;

public class MyFirst {

 public static void main (String[] args) {
//  System.out.println("Hello, World!");

     Point po1 = new Point(3, 5);
     Point po2 = new Point(1, 2);
     System.out.println("Расстояние между точками" + distance(po1, po2));

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2.0) + Math.pow(p1.y - p2.y, 2.0));

    }
}