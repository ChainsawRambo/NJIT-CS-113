//Devon Keen

//2/27/19

//CS 113-002

// CS 113 MIDTERM EXAM 1 Fall 2018

//1. Which of the following is a legal Java identifier? B. oneForAll
//2. What is the value of z after the following assignment statement is executed? A. 0.0
//3. The relationship between a class and an object is best described as B. objects are instances of classes
//4. The behavior of an object is defined by the object's D. methods
//5. If you want to store the value "Harry Potter" in a new String variable name, which of the following statements could you use? D. Any of the above ==>  String name = "Harry Potter"; String name = new String("Harry Potter"); String name = "Harry" + " " + "Potter"; 
//6. Given the method defined here, which of the following method calls is legal? public void foo(int a, int b) 
//   Answer = B. foo(0/1, 2*3);
//7. In Java a variable may contain A. a value or a reference
//8. Which of the following declares and initializes obj to an object of class Bag? A. Bag obj = new Bag();
//9. Which properties are true of String objects? D. A and B
//10. If a method does not have a return statement, then B. it must be a void method

//11.

public class Java1   
{
   private int radius;
   public Circle(int radius)
   {
      this.radius = radius;
   }
   public Circle()
   {
   radius = 1;
   }
   
   public int getRadius()
   {   
      return this.radius;
   }
   public void setRadius(int radius)
   {
      this.radius = radius;
   }
   public double area()
   {
      return radius * radius * Math.PI;
   }
   public String toString()
   {
      return "" + radius;
   }
}


//12.

 import java.util.Scanner;
 public static void main (String[] args) { 
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter radius");
   int radius = scan.nextInt();
   Circle circle1 = new Circle(radius);
   Circle circle2 = new Circle((int)(Math.random()*11+5));
   System.out.println(circle1.area());
   System.out.println(circle2.area());
   circle1.getRadius();
   circle2.getRadius();
   int swap = circle1.getRadius();
   int swap2 = circle2.getRadius();
   circle1.setRadius(swap2);
   circle2.setRadius(swap);
   System.out.println(circle1);
   System.out.println(circle2);
}


//13.

 import java.util.Scanner;
 public class Java1
 {
 public static void main (String[] args) { 
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter String");
   String one = scan.nextLine();
   String two = scan.nextLine();
   double average = (one.length() + two.length()) / 2.0;
   System.out.println(average);
   System.out.println(one.equals(two));
   System.out.println(one.charAt((int)(Math.random()*one.length())) + "," + two.charAt((int)(Math.random()*two.length())));
   }
   }
   
   

