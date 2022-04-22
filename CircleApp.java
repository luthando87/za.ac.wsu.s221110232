import za.ac.wsu.s221110232.Circle;

import static java.lang.System.*;

public class CircleApp {
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.setx(10);
        c1.sety(15);
        c1.setRadius((float) 5.23);

        Circle c2=new Circle();
        c2.setx(5);
        c2.sety(7);
        c2.setRadius((float) 7.45);

        Circle c3=new Circle();
        c3.setx(4);
        c3.sety(2);
        c3.setRadius((float) 6.76);
        //now i am going to display my srceen

        System.out.println("my X coordinate is: " +c1.getx());
        System.out.println("my Y coordinate is: " +c1.gety());
        System.out.println("my Radius is: " +c1.getRadius());
        System.out.println("my Area is: " +c1.getArea());
        System.out.println("my  Diameter is: " +c1.getDiameter());
        System.out.println("my Circumference: " +c1.getCircumference());
        System.out.println("\n");

        System.out.println("my X coordinate is: " +c2.getx());
        System.out.println("my Y coordinate is: " +c2.gety());
        System.out.println("my Radius is: " +c2.getRadius());
        System.out.println("my Area is: " +c2.getArea());
        System.out.println("my  Diameter is: " +c2.getDiameter());
        System.out.println("my Circumference: " +c2.getCircumference());
        System.out.println("\n");

        System.out.println("my X coordinate is: " +c3.getx());
        System.out.println("my Y coordinate is: " +c3.gety());
        System.out.println("my Radius is: " +c3.getRadius());
        System.out.println("my Area is: " +c3.getArea());
        System.out.println("my  Diameter is: " +c3.getDiameter());
        System.out.println("my Circumference: " +c3.getCircumference());
    }
}
