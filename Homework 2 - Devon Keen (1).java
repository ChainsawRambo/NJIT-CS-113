// Devon Keen
//
// CS 113-002
//
// Homework 2

//#3.5

import java.util.Scanner;

public class Homework2{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 1st x coordinate");
      double x1 = scan.nextDouble();
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Enter 1st y coordinate");
      double y1 = scan2.nextDouble();
      Scanner scan3 = new Scanner(System.in);
      System.out.println("Enter 2nd x coordinate");
      double x2 = scan3.nextDouble();
      Scanner scan4 = new Scanner(System.in);
      System.out.println("Enter 2nd y coordinate");
      double y2 = scan4.nextDouble();
      double slope = (y2-y1)/(x2-x1);
      System.out.println(slope);
   }
}

//#3.6

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework2{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter radius");
      double radius = scan.nextDouble();
      double volume = (4.0/3.0)*(Math.PI)*(Math.pow(radius, 3));
      double surfacearea = 4*(Math.PI)*(Math.pow(radius, 2));
      DecimalFormat fmt = new DecimalFormat("0.####");
      System.out.println("volume = " + fmt.format(volume));
      System.out.println("surface area = " + fmt.format(surfacearea));
   }
}

#3.7

import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework2{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter side 1");
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Enter side 2");
      Scanner scan3 = new Scanner(System.in);
      System.out.println("Enter height");
      double side1 = scan.nextDouble();
      double side2 = scan2.nextDouble();
      double height = scan3.nextDouble();
      double area = ((((side1 + side2)/2.0) * height));
      DecimalFormat fmt = new DecimalFormat("0.##");
      System.out.println("area = " + fmt.format(area));
   }
}

//#3.9

import java.util.Random;

public class Homework2{
   public static void main (String[] args) {
      Random generator = new Random();
      int base = generator.nextInt(20) + 11;
      int side = generator.nextInt(20) + 11;
      int height = generator.nextInt(20) + 11;
      int area = base * height;
      int perimeter = 2*(side+base);
      System.out.println("base = " + base);
      System.out.println("side = " + side);
      System.out.println("height = " + height);
      System.out.println("area = " + area);
      System.out.println("perimeter = " + perimeter);
   }
}

//#4.3

public class Homework2{
   public static void main (String[] args) { 
   
   Circle circle1 = new Circle(5);
   System.out.println(circle1.getRadius());
   circle1.setRadius(6);
   System.out.println(circle1.circumference());
   System.out.println(circle1.area());
   System.out.println(circle1);
}
}   
class Circle
{
   public double radius;
   public Circle(double radius)
   {
      this.radius = radius;
   }
   public double getRadius()
   {   
      return this.radius;
   }
   public void setRadius(double radius)
   {
      this.radius = radius;
   }
   public double circumference()
   {
      return radius * 2 * Math.PI;
   }
   public double area()
   {
      return radius * radius * Math.PI;
   }
   public String toString()
   {
      return "The cirlce's radius is " + radius;
   }
}

//#4.6

public class Homework2{
   public static void main (String[] args) { 
   
   Shelf item = new Shelf(5,5,5);
   System.out.println(item.getLength());
   System.out.println(item.getWidth());
   System.out.println(item.getCapacity());
   System.out.println(item.getOccupied());
   item.setLength(6);
   item.setWidth(6);
   item.setCapacity(6);
   item.setOccupied(true);
   System.out.println(item);
}
}   
class Shelf
{
   private double length;
   private double width;
   private double capacity;
   private boolean occupied;
   public Shelf(double length, double width, double capacity)
   {
      this.length = length;
      this.width = width;
      this.capacity = capacity;
      this.occupied = false;
   }
   public double getLength()
   {   
      return this.length;
   }
   public double getWidth()
   {   
      return this.width;
   }
   public double getCapacity()
   {   
      return this.capacity;
   }
   public boolean getOccupied()
   {   
      return this.occupied;
   }

   public void setLength(double length)
   {
      this.length = length;
   }
   public void setWidth(double width)
   {
      this.width = width;
   }
   public void setCapacity(double capacity)
   {
      this.capacity = capacity;
   }
   public void setOccupied(boolean occupied)
   {
      this.occupied = occupied;
   }
   public String toString()
   {
      return "The shelf is " + length + " long, " + width + " wide, " + "and capcity is " + capacity;
   }
}

      
