// Devon Keen
//
// CS 113-002
//
// Lab 3

//Exercises

//#1.

// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************
public class Lab3
{
   public static void main (String[] args)
   {
      String college = new String ("PoDunk College");
      String town = "Anytown, USA"; // part (a)
      int stringLength;
      String change, change2, change3;
      stringLength = college.length(); // part (b)
      System.out.println (college + " contains " + stringLength + " characters.");
      change = college.toUpperCase(); // part (c)
      change2 = change.replace("O", "*"); // part (d)
      change3 = college.concat(town); // part (e)
      System.out.println ("The final string is " + change3);
      }
}

//#2.

// *******************************************************************
// RightTriangle.java
//
// Compute the length of the hypotenuse of a right triangle
// given the lengths of the sides
// *******************************************************************
import java.util.Scanner;
public class Lab3
{
public static void main (String[] args)
{
double side1, side2; // lengths of the sides of a right triangle
double hypotenuse; // length of the hypotenuse
Scanner scan = new Scanner(System.in);
// Get the lengths of the sides as input
System.out.print ("Please enter the lengths of the two sides of " +
"a right triangle (separate by a blank space): ");
side1 = scan.nextDouble();
side2 = scan.nextDouble();
// Compute the length of the hypotenuse
hypotenuse = Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2)));
// Print the result
System.out.println ("Length of the hypotenuse: " + hypotenuse);
}
}

//#3.

// **************************************************
// LuckyNumbers.j ava
//
// To generate three random "lucky" numbers
// **************************************************
import java.util.Random;
public class Lab3
{
public static void main (String[] args)
{
Random generator = new Random();
int lucky, lucky2, lucky3;
// Generate lucky1 (a random integer between 50 and 79) using the
// nextInt method (with no parameter)
lucky = Math.abs(generator.nextInt()) % 30 + 50;
// Generate lucky2 (a random integer between 90 and 100) using the
// nextInt method with an integer parameter
lucky2 = generator.nextInt(11) + 90; 
//40 Chapter 3: Using Classes and Objects
// Generate lucky3 (a random integer between 11 and 30) using nextFloat
lucky3 = (int) (generator.nextFloat() * 21) + 11;
System.out.println ("Your lucky numbers are " + lucky + ", " + lucky2 + ", and " + lucky3);
}
} 

//Working with Strings

// ***************************************************************
// StringManips.java
//
// Test several methods for manipulating String objects
// ***************************************************************
import java.util.Scanner;
public class Lab3
{
public static void main (String[] args)
{
String phrase = new String ("This is a String test.");
int phraseLength; // number of characters in the phrase String
int middleIndex; // index of the middle character in the String
String firstHalf; // first half of the phrase String
String secondHalf; // second half of the phrase String
String switchedPhrase; //a new phrase with original halves switched
// compute the length and middle index of the phrase
phraseLength = phrase.length();
middleIndex = phraseLength / 2;
String middle3 = phrase.substring(middleIndex - 1, middleIndex +2);
// get the substring for each half of the phrase
firstHalf = phrase.substring(0,middleIndex);
secondHalf = phrase.substring(middleIndex, phraseLength);
// concatenate the firstHalf at the end of the secondHalf
switchedPhrase = secondHalf.concat(firstHalf);
switchedPhrase = switchedPhrase.replace(" ", "*");
// print information about the phrase
System.out.println();
System.out.println ("Original phrase: " + phrase);
System.out.println ("Length of the phrase: " + phraseLength +
" characters");
System.out.println ("Index of the middle: " + middleIndex);
System.out.println ("Character at the middle index: " +
phrase.charAt(middleIndex));
System.out.println ("Switched phrase: " + switchedPhrase);
System.out.println("Middle3 = " + middle3);
Scanner scan = new Scanner(System.in);
System.out.println("Enter city");
String city = scan.nextLine();
Scanner scan2 = new Scanner(System.in);
System.out.println("Enter state");
String state = scan2.nextLine();
System.out.println(state.toUpperCase()+ city.toLowerCase() + state.toUpperCase());


}
}

//#1. Output is Original phrase: This is a String test. Length of the phrase: 22 characters Index of the middle: 11 Character at the middle index: t Switched phrase: tring test.This is a S

//Rolling Dice

import java.util.Random;
public class Lab3
{
public static void main (String[] args)
{
Random generator = new Random();
Random generator2 = new Random();
int dice = generator.nextInt(6) + 1;
int dice2 = generator2.nextInt(6) + 1;
int total = dice + dice2;
System.out.println("Dice 1 rolled: " + dice);
System.out.println("Dice 2 rolled: " + dice2);
System.out.println("Total: " + total);
}
}

//Computing Distance

// ************************************************************
// Distance.java
//
// Computes the distance between two points
// ************************************************************
import java.util.Scanner;
public class Lab3
{
public static void main (String[] args)
{
double x1, y1, x2, y2; // coordinates of two points
double distance; // distance between the points
Scanner scan = new Scanner(System.in);
// Read in the two points
System.out.print ("Enter the coordinates of the first point " +
"(put a space between them): ");
x1 = scan.nextDouble();
y1 = scan.nextDouble();
System.out.print ("Enter the coordinates of the second point: ");
x2 = scan.nextDouble();
y2 = scan.nextDouble();
distance = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
System.out.print ("Distance: " + distance);
// Compute the distance
// Print out the answer
}
}

//Formatting Output

// ************************************************************
// DeliFormat.java
//
// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item.
//
// ************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Lab3
{
// ---------------------------------------------------
// main reads in the price per pound of a deli item
// and number of ounces of a deli item then computes
// the total price and prints a "label" for the item
// ---------------------------------------------------
public static void main (String[] args)
{
final double OUNCES_PER_POUND = 16.0;
double pricePerPound; // price per pound
double weightOunces; // weight in ounces
double weight; // weight in pounds
double totalPrice; // total price for the item
Scanner scan = new Scanner(System.in);
// Declare money as a NumberFormat object and use the
// getCurrencyInstance method to assign it a value
// Declare fmt as a DecimalFormat object and instantiate
// it to format numbers with at least one digit to the left of the
// decimal and the fractional part rounded to two digits.
// prompt the user and read in each input
System. out. println ("Welcome to the CS Deli! ! \n ");
System.out.print ("Enter the price per pound of your item: ");
pricePerPound = scan.nextDouble();
System.out.print ("Enter the weight (ounces): ");
weightOunces = scan.nextDouble();
//Convert ounces to pounds and compute the total price
System.out.println("Enter the price per pound of your item: ");
weight = weightOunces / OUNCES_PER_POUND;
totalPrice = pricePerPound * weight;
NumberFormat money = NumberFormat.getCurrencyInstance();
DecimalFormat fmt = new DecimalFormat("0.##");
System.out.println("Unit Price: " + money.format(pricePerPound));
System.out.println("Weight: " + fmt.format(weight));
System.out.println("Total Price: " + money.format(totalPrice));
// Print the label using the formatting objects
// fmt for the weight in pounds and money for the prices
}
}

//Experimenting with the Integer Class (Not Graded)

import java.util.Scanner;
public class Lab3
{
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter number: ");
int number = scan.nextInt();
System.out.println("Binary: " + Integer.toBinaryString(number));
System.out.println("Hex: " +Integer.toHexString(number));
System.out.println("Octal: " +Integer.toOctalString(number));
System.out.println("Max: " +Integer.MAX_VALUE(number));
System.out.println("Min: " +Integer.MIN_VALUE(number));
}
}
