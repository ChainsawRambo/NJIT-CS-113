// Devon Keen
// 
// 3/13/19
//
// CS 113-002
//
// Homework 5

import java.util.Random;
public class Homework5{
   public static void main (String[] args) {
   Random rand = new Random();
   int [] list = new int[50];
   int total = 0;
   for (int i = 0; i < 50; ++i){
      int number = rand.nextInt();
      list[i] = number;
      total += number;
      }
   double mean = (double)(total / 50.0);
   double standardDeviation = (double)(Math.sqrt(Math.pow((total - mean),2)));
   System.out.println(mean);
   System.out.println(standardDeviation);
   }
}
   
      