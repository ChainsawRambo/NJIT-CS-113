//Devon Keen
//
//2/15/19
//
//CS 113-002
//
//Lab 2

// Name and Places

public class Lab2 {
	// --------------------------
	// main prints the list
	// --------------------------
	public static void main (String[] args)
	{
	System.out.println ();
	System.out.println (" \tName\t\tHometown\tMajor") ;
	System.out.println ("\t====\t\t========\t=====");
	System.out.println ("\tDevon\t\tNorth Arlington\tInformation Technology");
	System.out.println ("\tAlexander\tWashington\tMath");
	System.out.println ("\tSally\t\tRoanoke\t\tComputer Science");
	System.out.println ("\tGeorge\t\tNewark\t\tInformation Technology");
	System.out.println ("\tAnna\t\tElizabeth\tComputer Science");
	System.out.println ();
	}
}

//A Table of Student Grades

public class Lab2 {
	public static void main (String[] args)
	{
	System.out.println ("\t///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	System.out.println ("\t== Student Points ==");
	System.out.println ("\t\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
	System.out.println ();
	System.out.println (" \tName\tLab\tBonus\tTotal") ;
	System.out.println ("\t----\t---\t-----\t-----");
	System.out.println ("\tDevon\t100\t100\t200");
	System.out.println ("\tAlex\t43\t7\t50");
	System.out.println ("\tSally\t50\t8\t58");
	System.out.println ("\tGeorge\t39\t10\t49");
	System.out.println ("\tAnna\t50\t50\t100");
	}
}

//Two Meanings of Plus

// ************************************************************
// PlusTest.java
//
// Demonstrate the different behaviors of the + operator
// ************************************************************
public class Lab2
{
// -------------------------------------------------
// main prints some expressions using the + operator
// -------------------------------------------------
public static void main (String[] args)
{
System.out.println ("This is a long string that is the " +
"concatenation of two shorter strings.");
System.out.println ("The first computer was invented about" + 55 +
"years ago.");
System.out.println ("8 plus 5 is " + 8 + 5);
System.out.println ("8 plus 5 is " + (8 + 5)) ;
System.out.println (8 + 5 + " equals 8 plus 5.");
}
}

//1. It wrote that 8 plus 5 is 85 on first line and 8 plus 5 is 13 on second and 13 equals 8 plus 5 on third.  The reason the first line is off is because 8 + 5 wasn't in parenthesis. The years statement is scrunched because a space was not entered before closing the quotations.
//2.
public class Lab2
{
public static void main (String[] args)
{
System.out.println ("Ten robins plus " + 13 + " canaries is " + 23 + " birds.");
}
}

//Prelab Exercises

//1. The difference between a variable and a constant is that a variable can change values, but a constant cannot.
//2a. int x just declares x as an integer.
//2b. int x = 3 declares x as an integer with a variable with the value of 3.
//2c. x = 3 will probably give you an error since it is not declared as a type.
//3.
// *****************************************************************
// Average.java
//
// Read three integers from the user and print their average
// *****************************************************************
import java.util.Scanner;
public class Lab2
{
public static void main(String[] args)
{
int val1, val2, val3;
double average;
Scanner scan = new Scanner(System.in) ;
Scanner scan2 = new Scanner(System.in) ;
Scanner scan3 = new Scanner(System.in) ;
// get three values from user
System.out.println("Please enter three integers and " +
"I will compute their average");
val1 = scan.nextInt();
val2 = scan2.nextInt();
val3 = scan.nextInt();
//compute the average
average = (val1 + val2 + val3)/3.0;
//print the average
System.out.println (average);
}
}

//4a. 73
//4b. -14
//4c. 0
//4d. 3
//4e. 2
//4f. 4.03125
//4g. 0.24806201550387597
//4h. 4.29
//4i. 0.9375
//4j. 1
//4k. 0.09999999999999964
public class Lab2
{
public static void main(String[] args)
{
	int a = 3, b = 10, c = 7;
	double w = 12.9, y = 3.2;
	System.out.println (w%y);
}
}

//5.
// File: Errors.java
// Purpose: A program with lots of syntax errors
// Correct all of the errors (STUDY the program carefully!!)
import java.util.Scanner;
public class Lab2
{
public static void main (String[] args)
{
String Name; // Name of the user
int number;
int numSq;
Scanner scan = new Scanner(System.in);
System.out.print ("Enter your name, please: ");
Name = scan.next();
System.out.println ("What is your favorite number?");
number = scan.nextInt();
numSq = number * number;
System.out.println (Name + ", the square of your number is "
+ numSq);
}
}

//6.
// FILE: Trace.java
// PURPOSE: An exercise in tracing a program and understanding
// assignment statements and expressions.
import java.util.Scanner;
public class Lab2
{
public static void main (String[] args)
{
int one, two, three;
double what;
Scanner scan = new Scanner(System.in);
System.out.print ("Enter two integers: ");
one = scan.nextInt();
two = scan.nextInt();
System.out.print("Enter a floating point number: ");
what = scan.nextDouble() ;
three = 4 * one + 5 * two;
two = 2 * one;
System.out.println ("one " + two + ":" + three);
one = 46 / 5 * 2 + 19 % 4;
three = one + two;
what = (what + 2.5) / 2 ;
System.out.println (what + " is what!");
}
}

//Output is one 20:55
//8.4 is what!

//Area and Circumference of a Circle

// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
public class Lab2
{
public static void main(String[] args)
{
final double PI = 3.14159;
int radius = 10;
double area = PI * radius * radius;
double circumference = 2 * Math.PI * radius;
System.out.println("The area of a circle with radius " + radius +
" is " + area);
System.out.println("The circumference of a circle with radius " + radius +
" is " + circumference);
radius = 20;
area = PI * radius * radius;
circumference = 2 * Math.PI * radius;
System.out.println("The area of a circle with radius " + radius +
" is " + area);
System.out.println("The circumference of a circle with radius " + radius +
" is " + circumference);
}
}

//2. The area almost quadruples and the circumference doubles when radius doubles.
//3.

// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
import java.util.Scanner;
public class Lab2
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println ("Please enter a value for the radius.");
double radius = scan.nextInt();
final double PI = 3.14159;
double area = PI * radius * radius;
double circumference = 2 * (Math.PI * radius);
System.out.println("The area of a circle with radius " + radius + " is " + area);
System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
}
}

//The output from this new program has same affect where the area almost quadruples and the circumference basically doubles.

//Painting a Room

//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Lab2
{
public static void main(String[] args)
{
final int COVERAGE = 350; //paint covers 350 sq ft/gal
int length, width, height;
double totalSqFt;
double paintNeeded;
Scanner scan = new Scanner(System.in);
System.out.println ("Enter length");
Scanner scan2 = new Scanner(System.in);
System.out.println ("Enter width");
Scanner scan3 = new Scanner(System.in);
System.out.println ("Enter height");
Scanner scan4 = new Scanner(System.in);
System.out.println ("Enter number of doors");
Scanner scan5 = new Scanner(System.in);
System.out.println ("Enter number of windows");
length = scan.nextInt();
width = scan2.nextInt();
height = scan3.nextInt();
int numdoors = scan4.nextInt();
int numwindows = scan5.nextInt();
int doors = numdoors * 20;
int windows = numwindows * 15;
totalSqFt = (length * width * height) - doors - windows;
paintNeeded = totalSqFt / COVERAGE;
System.out.println ("length = " + length);
System.out.println ("width = " + width);
System.out.println ("height = " + height);
System.out.println ("number of gallons needed = " + paintNeeded);
}
}

//Ideal Weight

import java.util.Scanner;
public class Lab2
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println ("Enter height in feet");
	int feet = scan.nextInt();
	Scanner scan2 = new Scanner(System.in);
	System.out.println ("Enter height in additional inches");
	int inches = scan2.nextInt();
	int totalinches = (feet * 12) + inches;
	int five = 5 * 12;
	int difference = 0;
	if (totalinches > five) {
		difference = totalinches - five;
	}
	int female = 100 + (5 * difference);
	int male = 100 + (6 * difference);
	double okmale = male - (male * .15);
	double okfemale = female - (female * .15);
	double okmale2 = male + (male * .15);
	double okfemale2 = female + (female * .15);
	System.out.println ("Ok range for females  = " + okfemale + " to " + okfemale2);
	System.out.println ("Ok range for males  = " + okmale + " to " + (okmale2));
	System.out.println ("Total Inches = " + totalinches);
	System.out.println ("Ideal female weight is = " + female);
	System.out.println ("Ideal male weight is = " + male);
	
}
}

//Lab Grades

// ***************************************************************
// LabGrade.java
// This program computes a student's lab grade from
// the grades on the three components of lab: the pre-lab
// assignment, the lab itself, and the post-lab assignment.
// ***************************************************************
import java.util.Scanner;
public class Lab2
{
public static void main (String[] args)
{
// Declare constants
final double IN_WEIGHT = 0.6; // in-class weight is 60%
final double OUT_WEIGHT = 0.4; // out-of-class weight is 40%
// Declare variables
double preLabPts; //number of points earned on the pre-lab assignment
double preLabMax; //maximum number of points possible for pre-lab
double labPts; //number of poitns earned on the lab
double labMax; //maximum number of points possible for lab
double postLabPts; //number of points earned on the post-lab assignment
double postLabMax; //maximum number of points possible for the post-lab
double outClassAvg; //average on the out of class (pre and post) work
double inClassAvg; //average on the in-class work
double labGrade; //final lab grade
double inWeight;
double outWeight;
Scanner scan = new Scanner(System.in);
// Get the input
System.out.println("\nWelcome to the Lab Grade Calculator\n");
System.out.print("Enter weight in decimal form: ");
inWeight = scan.nextDouble();
System.out.print("Enter weight in decimal form: ");
inWeight = scan.nextDouble();
System.out.print("Enter the number of points you earned on the pre-lab: ");
preLabPts = scan.nextDouble();
System.out.print("What was the maximum number of points you could have earned? ");
preLabMax = scan.nextDouble();
System.out.print("Enter the number of points you earned on the lab: ");
labPts = scan.nextDouble();
System.out.print("What was the maximum number of points for the lab? ");
labMax = scan.nextDouble();
System.out.print("Enter the number of points you earned on the post-lab: ");
postLabPts = scan.nextDouble();
System.out.print("What was the maximum number of points for the post-lab? ");
postLabMax = scan.nextDouble();
System.out.println();
// Calculate the average for the out of class work
outClassAvg = (((preLabPts + postLabPts) / (preLabMax + postLabMax))* 100);
// Calculate the average for the in-class work
inClassAvg = (labPts / labMax) * 100;
// Calculate the weighted average taking 40% of the out-of-class average
// plus 60% of the in-class
labGrade = (OUT_WEIGHT * outClassAvg) + (IN_WEIGHT * inClassAvg);
// Print the results
System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
System.out.println("Your average on in-class work is " + inClassAvg + "%");
System.out.println("Your lab grade is " + labGrade + "%");
System.out.println();
}
}

//1a. First of all, this program would not operate because the labGrade variable is written with a number 1 instead of an l.  If this was corrected the out of class average would be calculated by preLabPts + postLabPts / preLabMax + postLabMax * 100
//1b. In class would be executed by labPts / labMax * 100
//1c. Lab grade would be executed by OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg
//2.  Ran it and as predicted it didn't work because of 1a.'s explanation. After corrected, out put is Your average on out-of-class work is 1517%, Your average on in-class work is 0%, Your lab grade is 606.8000000000001%
//    Even then it needs to be corrected again. Even after trying to correct this program nothing works.  Even if you write it as instructed you get incorrect output.  Therefore, there is an error with the formula for these calculations.
//3.  Even if I change the values it will not run because the instructions for the formulas do not match the output for this program.

//Base Conversion

//***********************************************
//BaseConvert.java
//
//Converts base 10 numbers to another base
//(at most 4 digits in the other base). The
//base 10 number and the base are input.
//***********************************************
import java.util.Scanner;
public class Lab2
{
public static void main (String[] args)
{
int base; // the new base
int base10Num; // the number in base 10
int maxNumber; // the maximum number that will fit
//in 4 digits in the new base
int place0; // digit in the 1's (base^0) place
int place1; // digit in the base^1 place
int place2; // digit in the base^2 place
int place3; // digit in the base^3 place
String baseBNum = new String (""); // the number in the new base
Scanner scan = new Scanner(System.in);
//read in the base 10 number and the base
System.out.println();
System.out.println ("Base Conversion Program");
System.out.println() ;
System.out.print ("Please enter a base (2-9): ");
base = scan.nextInt();
//Compute the maximum base 10 number that will fit in 4 digits
//in the new base and tell the user what range the number they
//want to convert must be in
System.out.print ("Please enter a base 10 number to convert: ");
base10Num = scan.nextInt();
maxNumber = ((Math.pow(base, 4))-1);
System.out.println ("Max number = " + maxNumber);
//Do the conversion (see notes in lab)
//Print the result (see notes in lab)
//First compute place0 -- the units place. Remember this comes
//from the first division so it is the remainder when the
//base 10 number is divided by the base (HINT %).
place0 = base10Num % base;
place1 = (base10Num / base) % base;
place2 = ((base10Num / base) / base) % base;
//Then compute the quotient (integer division / will do it!) -
//You can either store the result back in base10Num or declare a
//new variable for the quotient
//Now compute place1 -- this is the remainder when the quotient
//from the preceding step is divided by the base.
//Then compute the new quotient
//Repeat the idea from above to compute place2 and the next quotient
//Repeat again to compute place3
System.out.println("The number in the new base is " + place0 + place1 + place2);
}
}

//1. The formula added to maxNumber does not compile and run, once again the instructions and formula do not match the expected output.
//2. Just added comments because it already doesn't work.
//3. Once again, it will not work because the base formula and instructions are incorrect.