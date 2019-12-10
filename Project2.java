// Devon Keen
// 
// 3/13/19
//
// CS 113-002
//
// Project 2

import java.util.Random;
public class Project2{
   public static void main (String[] args) {
   
   Random rand = new Random();
   int areaSquare = 1;
   double r = .5;
   double areaCircle = Math.PI / 4.0;
   double probSqaure = 1.00;
   double probCircle = Math.PI / 4.0;
   int count = 0;
   
   for (int i = 0; i < 1000000; ++i){
      double x = rand.nextDouble();
      double y = rand.nextDouble();
      if ( -1.0/4.0 >= (Math.pow(x,2) - x + Math.pow(y,2) - y)){
         count += 1;
      }
   }
   double answer = (count/1000000.0) * 4;
   System.out.println(answer);
 }
}
      