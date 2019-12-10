// Devon Keen
//
// CS 113-002
//
// Homework 1

//#2.5

import java.util.Scanner;

public class Converter{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter inches as a digit with or without decimals");
      double inches = scan.nextDouble();
      double feet = inches / 12;
      System.out.println(feet + " feet");
   }
}

//#2.6

public class Converter2{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
     System.out.println("Enter grams as a digit with or without decimals");
      double grams = scan.nextDouble();
     double pounds = grams / 456.592;
      System.out.println(pounds + " pounds");
   }
}

//#2.8

public class Converter3{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter kilograms as a digit with or without decimals");
      double kilograms = scan.nextDouble();
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Enter grams as a digit with or without decimals");
      double grams = scan2.nextDouble();
      Scanner scan3 = new Scanner(System.in);
      System.out.println("Enter milligrams as a digit with or without decimals");
      double milligrams = scan3.nextDouble();
      double total = kilograms *1000000 + grams *1000 + milligrams;
      System.out.println(total + " total milligrams");
   }
}

//#2.9

public class Converter4{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter milligrams as a digit without decimals");
      int milligrams = scan.nextInt();
      int kilograms = milligrams / 1000000;
      int next = milligrams - kilograms * 1000000;
      int grams = next / 1000;
      int milligrams2 = next - grams * 1000;
      System.out.println(kilograms + " kilograms");
      System.out.println(grams + " grams");
      System.out.println(milligrams2 + " milligrams");
   }
}
    
