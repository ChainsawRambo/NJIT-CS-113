// Devon Keen

// 3/27/19

// CS 113-002

// Project 3

public class Project3{
   public static void main (String[] args) {
   
   int[] array = new int[1000000];
   for (int index = 0; index < array.length; index++)
   {
      array[index] = index+1;
   }
   } 
   
   public static void sieve(int[] array){
   array[0] = 0;
   for (int i = 1; i < Math.sqrt((double)array.length); i++){
      if (array[i] != 0){
         for(int j = array[i] * 2 - 1; j < array.length; j+= array[i]){
            array[j] = 0;
         }
         }
      }
   }  
  
   public static void goldbach(int[] array){
   for (int i = 4; i < array.length; i++){
         for(int j = 0; j < array.length; j++){
            if (array[j] == 0){
               continue;
            }
            else if((array[j] + array[Math.abs(array[j] - i) - 1]) == i){
               break;
            }
         }
         }
      }
     }