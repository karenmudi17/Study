package test.sandbox;

public class MyFirst {

    public static void main(String[] args) {

//     System.out.println("Hello, World!");
        Point po1 = new Point(1, 3);
        Point po2 = new Point(5, 8);

//        Здесь испольуется функция для подсчета расстояния между точками
        System.out.println("Расстояние между точками с кординатами ("+ po1.x + "," + po1.y + ") и (" + po2.x + "," + po2.y + ") = " + dist(po1, po2));

//        Здесь испольуется метод класса Point для подсчета расстояния между точками
        System.out.println("Расстояние между точками с кординатами ("+ po1.x + "," + po1.y + ") и (" + po2.x + "," + po2.y + ") = " + po1.dist(po2));

    }

    public static double dist(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2.0) + Math.pow(p1.y - p2.y, 2.0));

    }
}
