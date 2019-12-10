// Devon Keen

// 3/27/19

// CS 113-002

// Lab 5

//Tracking Sales

// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************


import java.util.Scanner;
public class Lab5
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter how many salepeople = ");
int SALESPEOPLE = scan.nextInt();
int[] sales = new int[SALESPEOPLE];
int sum;
int max = 0;
int min = 0;
int maxsales = 0;
int minsales = 0;
for (int i=0; i<sales.length; i++)
 {
System.out.print("Enter sales for salesperson " + (i+1) + ": ");
sales[i] = scan.nextInt();
 }
System.out.println("\nSalesperson Sales");
System.out.println(" ------------------ ");
sum = 0;
for (int i=0; i<sales.length; i++)
 {
System.out.println(" " + i + " " + sales[i]);
sum += sales[i];
if (sales[i] > max)
{
   max = sales[i];
   maxsales = i+1;
}
if (sales[i] < max)
{
   min = sales[i];
   minsales = i+1;
   
}
 }
System.out.println("\nTotal sales: " + sum);
System.out.println("Average Sales = " + sum/SALESPEOPLE);
System.out.println("Salesperson " + maxsales + " had the highest sale with " + max);
System.out.println("Salesperson " + minsales + " had the lowest sale with " + min);

System.out.print("Enter a value ");
int exceed = scan.nextInt();
int count = 0;
for (int i=0; i<sales.length; i++)
 {
   if (sales[i] > exceed)
   {
      count +=1;
      System.out.println("Salesperson " + (i+1) + " had sales " + sales[i]);
   }
 }
System.out.println("Amount of salespeople who exceeded = " + count);

}
}



//Grading Quizzes


import java.util.Scanner;
public class Lab5
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter how many questions are in the quiz ");
      int questions = scan.nextInt();
      int [] quiz = new int[questions];
      int correct = 0;
      for (int i=0; i<quiz.length; i++)
      {
         System.out.print("Enter correct answers for question " + i + ": ");
         quiz[i] = scan.nextInt();
      }
      while (true)
      {
          for (int i=0; i<quiz.length; i++)
          {
            System.out.print("Enter your answers for question " + i + ": ");
            int answer = scan.nextInt();
            if (answer == quiz[i])
            {
               correct += 1;
            }
          }
         double percent = (double)correct/questions*100.00;
         System.out.println("Number of correct answers = " + correct);
         System.out.println("Percentage of correct answers = " + percent);
         System.out.println("Grade another quiz? Enter yes or no ");
         String reply = scan.next();
         if (reply.equals("no"))
         {
            break;
         }
      }
    }
}



//Reversing an Array 


import java.util.Scanner;
public class Lab5
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an integer ");
      int integer = scan.nextInt();
      System.out.print("Enter " + integer + " values");
      int [] values = new int[integer];
      int reverse = 0;
      for (int i=0; i<values.length; i++)
      {
         values[i] = scan.nextInt();
      }
      for (int i : values)
      {
         System.out.print(i + " ");
      }
      System.out.println();
      for (int i=0; i<values.length/2; i++)
      {
         reverse = values[i];
         values[i] = values[values.length - 1 - i];
         values[values.length - i -1] = reverse;
      }
      for (int i : values)
      {
         System.out.print(i + " ");
      }

   }
}





//Adding To and Removing From an Integer List

// ***************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//
// ***************************************************************
public class Lab5
{
int length;
int nums;
int[] list; //values in the list
//-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
public Lab5(int size)
{
length = size;
nums = 0;
list = new int[size];
 }
//-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
public void randomize()
{
for (int i=0; i<list.length; i++)
list[i] = (int)(Math.random() * 100) + 1;
}
//-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
public void print()
{
for (int i=0; i<list.length; i++)
System.out.println(i + ":\t" + list[i]);
}
public void increaseSize()
{
   length = list.length * 2;
   int[] list2 = new int[length];
   for (int i=0; i<list2.length; i++)
   {
      list2[i] = list[i];
   }
   list = list2;
}
public void addElement(int newVal)
{
   if (list.length == nums)
   {
      list.increaseSize();
      list[nums] = newVal; 
   }
   else
   {
      list[nums] = newVal; 
   } 
   nums +=1;
}
public void removeFirst(int newVal)
{
 for (int i=0; i<list.length; i++)
 {
   if (list[i] == newVal)
   {
    nums -=1;
    for (int j = i; j<list.length; j++)
    {
    
      list[j] = list[j+1];
    }
    break;
   }
 }
}
public void removeAll(int newVal)
{
 for (int i=0; i<list.length; i++)
 {
   if (list[i] == newVal)
   {
    nums -=1;
    for (int j = i; j<list.length; j++)
    {
    
      list[j] = list[j+1];
    }
   }
 }
}

}

// ***************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//
// ***************************************************************
import java.util.Scanner;
public class IntegerListTest
{
static Lab5 list = new Lab5(10);
static Scanner scan = new Scanner(System.in);
//-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
public static void main(String[] args)
{
printMenu();
int choice = scan.nextInt();
while (choice != 0)
 {
dispatch(choice);
printMenu();
choice = scan.nextInt();
 }
}
//-------------------------------------
// Do what the menu item calls for
//-------------------------------------
public static void dispatch(int choice)
{
int loc;
switch(choice)
 {
 case 0:
 System.out.println("Bye! ") ;
 break;
 case 1:
 System.out.println("How big should the list be?");
 int size = scan.nextInt();
 list = new Lab5(size);
 list.randomize();
 break;
 case 2:
 list.print();
 break;
 case 3:
 System.out.println("What do you want to add? ");
 int reply = scan.nextInt();
 list.addElement(reply);
 break;
 case 4:
 System.out.println("What do you want to remove? ");
 int reply2 = scan.nextInt();
 list.removeFirst(reply2);
 break;
 case 5:
 System.out.println("What do you want to remove from all? ");
 int reply3 = scan.nextInt();
 list.removeAll(reply3);
 break;

 default:
 System.out.println("Sorry, invalid choice");
 }
}
//----------------------------
// Print the user's choices
//----------------------------
public static void printMenu()
{
System.out.println("\n Menu ");
System.out.println(" ====");
System.out.println("0: Quit");
System.out.println("1: Create a new list (** do this first!! **)");
System.out.println("2: Print the list");
System.out.print("\nEnter your choice: ");
}
}





//A Shopping Cart

// ***************************************************************
// Item.java
//
// Represents an item in a shopping cart.
// ***************************************************************
import java.text.NumberFormat;
public class Lab5
{
private String name;
private double price;
private int quantity;
// ----------------------------------------------------- --
// Create a new item with the given attributes.
// ----------------------------------------------------- --
public Lab5 (String itemName, double itemPrice, int numPurchased)
{
name = itemName;
price = itemPrice;
quantity = numPurchased;
}
// ----------------------------------------------------- --
// Return a string with the information about the item
// ----------------------------------------------------- --
public String toString ()
{
NumberFormat fmt = NumberFormat.getCurrencyInstance();
return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
 + fmt.format(price*quantity));
}
// -----------------------------------------------
// Returns the unit price of the item
// -----------------------------------------------

public double getPrice()
{
return price;
}
// -----------------------------------------------
// Returns the name of the item
// -----------------------------------------------
public String getName()
{
return name;
}
// -----------------------------------------------
// Returns the quantity of the item
// -----------------------------------------------
public int getQuantity()
{
return quantity; 
}
}

// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.text.NumberFormat;
public class ShoppingCart
{
private int itemCount; // total number of items in the cart
private double totalPrice; // total price of items in the cart
private int capacity; // current cart capacity
private Lab5 [] cart;
// ---------------------------------------------------------
// Creates an empty shopping cart with a capacity of 5 items.
// ---------------------------------------------------------
public ShoppingCart()
{
capacity = 5;
itemCount = 0;
totalPrice = 0.0;
cart = new Lab5[capacity];

}
// -----------------------------------------------------
// Adds an item to the shopping cart.
// -----------------------------------------------------
public void addToCart(String itemName, double price, int quantity)
{
if (capacity != cart.length)
{
   Lab5 newItem = new Lab5(itemName, price, quantity);
   cart[itemCount] = newItem;
   totalPrice += (price * quantity);
}
else
{
   increaseSize();
   Lab5 newItem = new Lab5(itemName, price, quantity);
   cart[itemCount] = newItem;
   totalPrice += (price * quantity);
}
itemCount += 1;
}
// -----------------------------------------------------
// Returns the contents of the cart together with
// summary information.

// -----------------------------------------------------
public String toString()
{
NumberFormat fmt = NumberFormat.getCurrencyInstance();
String contents = "\nShopping Cart\n";
contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
for (int i = 0; i < itemCount; i++)
contents += cart[i].toString() + "\n";
contents += "\nTotal Price: " + fmt.format(totalPrice);
contents += "\n";
return contents;
}
// -----------------------------------------------------
// Increases the capacity of the shopping cart by 3
// -----------------------------------------------------
private void increaseSize()
{
Lab5 [] cart2 = new Lab5[capacity + 3];
for (int i = 0; i < capacity; i++)
{
   cart2[i] = cart[i];
}
cart = cart2;
}
}

// Lab 5 A Shopping Cart Part 3

import java.util.Scanner;
public class Shopping
{
public static void main(String[] args)
{
ShoppingCart cart = new ShoppingCart();
Scanner scan = new Scanner(System.in);
double price;
double totalPrice = 0;
int quantity;
while (true)
{
   System.out.println("Enter price, quantity, and name ");
   price = scan.nextDouble();
   quantity = scan.nextInt();
   scan.nextLine();
   cart.addToCart(scan.nextLine(), price, quantity);
   totalPrice += price * quantity;
   System.out.println(cart);
   System.out.println("Do you want to continue? Enter yes or no? ");
   if (scan.next().equals("yes"))
   {
      continue;
   }
   else
   {
      break;
   }
}
System.out.println("Please pay " + totalPrice);
}
}




//Averaging Numbers

public class Lab5
{
public static void main(String[] args)
{
int total =0;
if (args.length == 0)
  {
      System.out.println("No arguments");
  }
else
{
   for (int i=0;i<args.length; i++)
   {
   total += Integer.parseInt(args[i]);
   }
   double average = (double)total/args.length;
   System.out.println(average);
}



}
}





//Exploring Variable Length Parameter Lists

//*******************************************************
// Parameters.java
//
// Illustrates the concept of a variable parameter list.
//*******************************************************
import java.util.Scanner;
public class Lab5
{
//-----------------------------------------------
// Calls the average and minimum methods with
// different numbers of parameters.
//-----------------------------------------------
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
double mean1, mean2;
mean1 = average(42, 69, 37);
mean2 = average(35, 43, 93, 23, 40, 21, 75);
double single = average(13);
double nothing = average();
System.out.println ("mean1 = " + mean1);
System.out.println ("mean2 = " + mean2);
System.out.println ("single average = " + single);
System.out.println ("nothing average = " + nothing);
int[] integers = new int[20];
int count = 0;
System.out.print("Enter up to 20 non-negative integers ");
while (count < 20)
 {
   int answer = scan.nextInt();
   if (answer < 0)
   {
     break;
   }
   else
   {
      integers[count] = answer;
      count +=1;
   }
 }
int[] int2 = new int[count];
for (int i=0;i < count; i++)
{
  int2[i] = integers[i];
}
double intAverage = average(int2);
System.out.println ("Integer list average = " + intAverage);
int minimum = min(int2);
System.out.println ("Integer list minimum = " + minimum);
}
//----------------------------------------------
// Returns the average of its parameters.
//----------------------------------------------
public static double average (int ... list)
{
double result = 0.0;
if (list.length != 0)
 {
int sum = 0;
for (int num: list)
sum += num;
result = (double)sum / list.length;
 }
return result;
}
public static int min (int...list)
{
int min = Integer.MAX_VALUE;
if (list.length != 0)
{
   for (int num: list)
   {
      if( num < min)
      {
         min = num;
      }
      
   }
}
else
{
   System.out.println("No values");
}
return min;
}
}
      




//Magic Squares

// ***************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//
// ***************************************************************
import java.util.Scanner;
public class Lab5
{
int[][] square;
//--------------------------------------
//create new square of given size
//--------------------------------------
public Lab5(int size)
{
square = new int[size][size];
}
//--------------------------------------
//return the sum of the values in the given row
//--------------------------------------
public int sumRow(int row)
{
int totalValue = 0;
for (int i=0;i < square.length; i++)
{
   totalValue += square[row][i];
}
return totalValue;
}
//--------------------------------------
//return the sum of the values in the given column
//--------------------------------------
public int sumCol(int col)
{
int totalValue = 0;
for (int i=0;i < square.length; i++)
{
   totalValue += square[i][col];
}
return totalValue;
}
//-------------------------------------- 

//return the sum of the values in the main diagonal
//--------------------------------------
public int sumMainDiag()
{
int totalValue = 0;
for (int i=0;i < square.length; i++)
{
   totalValue += square[i][i];
}
return totalValue;
}
//--------------------------------------
//return the sum of the values in the other ("reverse") diagonal
//--------------------------------------
public int sumOtherDiag()
{
int totalValue = 0;
for (int i=0;i < square.length; i++)
{
   totalValue += square[square.length-i-1][i];
}
return totalValue;
}
//--------------------------------------
//return true if the square is magic (all rows, cols, and diags have
//same sum), false otherwise
//--------------------------------------
public boolean magic()
{
if (sumMainDiag() != sumOtherDiag())
{
return false;
}
else{

for (int i=0;i < square.length; i++)
{
   if (sumRow(i) != sumMainDiag() || sumCol(i) != sumMainDiag())
   {
      return false;
   }
}
return true;
   }
}

//--------------------------------------
//read info into the square from the input stream associated with the
//Scanner parameter
//--------------------------------------
public void readSquare(Scanner scan)
{
for (int row = 0; row < square.length; row++)
 for (int col = 0; col < square.length; col ++)
 square[row][col] = scan.nextInt();
}
//----------------------------------------
//print the contents of the square, neatly formatted
//----------------------------------------
public void printSquare()
{
for (int i=0;i < square.length; i++)
{
   for (int j=0;j < square.length; j++){
   System.out.print(square[i][j] + " ");
   }
   System.out.println();
}
}
}


// ***************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ***************************************************************
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class SquareTest
{
public static void main(String[] args) throws IOException
{
Scanner scan = new Scanner(new File("magicData"));
int count = 1; //count which square we're on
int size = scan.nextInt(); //size of next square
//Expecting -1 at bottom of input file
while (size != -1)
 {
//create a new Square of the given size
Lab5 square = new Lab5(size);
//call its read method to read the values of the square
square.readSquare(scan);
System.out.println("\n******** Square " + count + " ********");
//print the square
square.printSquare();
//print the sums of its rows
for (int i=0;i < size; i++){
System.out.println(square.sumRow(i));
}
//print the sums of its columns
for (int i=0;i < size; i++){
System.out.println(square.sumCol(i));
}
//print the sum of the main diagonal
square.sumMainDiag();
System.out.println(square.sumMainDiag());
//print the sum of the other diagonal
square.sumOtherDiag();
System.out.println(square.sumOtherDiag());
//determine and print whether it is a magic square
square.magic();
System.out.println(square.magic());
//get size of next square
size = scan.nextInt();

count++;
 }
}
}

