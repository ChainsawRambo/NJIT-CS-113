// Devon Keen
//
// 3/6/19
//
// CS 113-002
//
// Homework 4

//#5.1

import java.util.Scanner;

public class Homework4{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter year");
      int year = scan.nextInt();
      if (year < 1582)
      {
         System.out.println("Error");
      }
      else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
      {
         System.out.println(year + " " + "is a leap year");
      }
      else
      {
         System.out.println(year + " " + "is not a leap year");
      }
   }
}


//#5.2


import java.util.Scanner;

public class Homework4{
   public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      while (true)
      {
          System.out.println("Enter year or enter -1 to exit");
          int year = scan.nextInt();
          if (year == -1)
          {
            break;
          }
          if (year < 1582)
          {
            System.out.println("Error, enter a year greater than or equal to 1582");
          }
          else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
          {
            System.out.println(year + " " + "is a leap year");
          }
          else
          {
            System.out.println(year + " " + "is not a leap year");
          }
      }
   }
}


//#5.4


import java.util.Scanner;

public class Homework4{
   public static void main (String[] args) {
   Scanner scan = new Scanner(System.in);
   int answer = (int)(Math.random() * 100 + 1);
   int count = 0;
   while (true)
   {
   System.out.println("Guess the number between 1 and 100 or enter -1 to quit");
   int guess = scan.nextInt();
   count += 1;
   if (guess == -1)
   {
       System.out.println("Guesses: " + (count - 1));
       System.out.println("Do you want to play again? Enter yes or no");
       String response = scan.nextLine();
       if (response.equals("yes"))
       {
         answer = (int)(Math.random() * 100 + 1);
         count = 0;
         continue;
       }
       else if (response.equals("no"))
       {
         break;
       }
   }
   if (guess == answer)
   {
      System.out.println("Correct");
      System.out.println("Guesses: " + count);
      System.out.println("Do you want to play again? Enter -1 if you want to quit");
      int response = scan.nextInt();
       if (response == -1)
       {
         break;
       }
       else
       {
         answer = (int)(Math.random() * 100 + 1);
         count = 0;
         continue;
       }
   }
   else if (guess > answer)
      {
         System.out.println("Too high");
         
      }
   else
      {
         System.out.println("Too low");
      }
     }
   } 
 }



//Project Euler: Problem 1


public class Homework4{
   public static void main (String[] args) {
   
   int sum3 = 0;
   int sum5 = 0;
   int repeat = 0;
   
   for (int x =1; x < 1000; x++)
   {
      if (x % 3 == 0 || x % 5 == 0)
      {
         repeat += x;
      }
   }
   
   System.out.println(repeat);
   }
  }



   