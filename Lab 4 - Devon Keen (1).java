// Devon Keen
//
// 2/27/19
//
// CS 113-002
//
// Lab 4

//#Pre-Lab Exercises

//#1a. We use contructors for initializing variables associated with each object.
//#1b. Contructors differ from other methods because the name is the sam as the name for the class and it cannot return a value and does not have a return type specified in method header.
//#2. Difference between public and private is public can be accessed from outside an object whereas private can only be accessed from inside the class definition.  To determine which should be used we look at the purpose. If it is for client services it must be public, but if it is just to help other methods in class it should be private.
//#3a. I would use a private long for the account number called acctNumber, private double for balance called balance, and private String for name called name.
//#3b1. public void withdraw(double amount)
//#3b2. public void double deposit(double amount)
//#3b3. public double getBalance()
//#3b4. public String to String()
//#3b5. public void int fee(double amount)
//#3b6. public class Account

//A Bank Account Class

// *******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
// *******************************************************

import java.text.NumberFormat;
public class Lab4
{
public static void main (String[] args) {
//create account1 for Sally with $1000
Lab4 acct1 = new Lab4(1000, "Sally", 1111);
//create account2 for Joe with $500
Lab4 acct2 = new Lab4(500, "Sally", 1112);
//deposit $100 to Joe's account
acct2.deposit(100);
//print Joe's new balance (use getBalance())
acct2.getBalance();
//withdraw $50 from Sally's account
acct1.withdraw(50);
//print Sally's new balance (use getBalance())
acct1.getBalance();
//charge fees to both accounts
acct1.chargeFee();
acct2.chargeFee();
//change the name on Joe's account to Joseph
acct2.changeName("Joseph");
//print summary for both accounts
System.out.println(acct1);
System.out.println(acct2);
}
private double balance;
private String name;
private long acctNum;
// ---------------------------------------------
//Constructor -- initializes balance, owner, and account number
// --------------------------------------------
public Lab4(double initBal, String owner, long number)
{
balance = initBal;
name = owner;
acctNum = number;
}
// --------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
// --------------------------------------------
public void withdraw(double amount)
{
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
}
// --------------------------------------------
// Adds deposit amount to balance. 
// --------------------------------------------
public void deposit(double amount)
{
balance += amount;
}
// --------------------------------------------
// Returns balance.
// --------------------------------------------
public double getBalance()
{
return balance;
}
// --------------------------------------------
// Returns a string containing the name, account number, and balance.
// --------------------------------------------
public String toString()
{
NumberFormat fmt = NumberFormat.getCurrencyInstance();
return acctNum + "\t" + name + "\t" + fmt.format(balance);
}

// --------------------------------------------
// Deducts $10 service fee //
// --------------------------------------------
public double chargeFee()
{
balance = balance - 10;
return balance;
}
// --------------------------------------------
// Changes the name on the account
// --------------------------------------------
public void changeName(String newName)
{
name = newName;
}

}

//Tracking Grades

// ************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************
import java.util.Scanner;
public class Lab4
{
public static void main(String[] args)
{
Lab4 student1 = new Lab4("Mary");
//create student2, "Mike"
Lab4 student2 = new Lab4("Mike");
//input grades for Mary
student1.inputGrades();
//print average for Mary
System.out.println("Mary Average: " + student1.getAverage());
//input grades for Mike
student2.inputGrades();
//print average for Mike
System.out.println("Mike Average: " + student2.getAverage());
System.out.println("Student 1: " + student1);
System.out.println("Student 2: " + student2);
}
//declare instance data
// ---------------------------------------------
private String name;
private int test1;
private int test2;

//constructor
// ---------------------------------------------
public Lab4(String studentName)
{
//add body of constructor
name = studentName;
}
// ---------------------------------------------
//inputGrades: prompt for and read in student's grades for test1 and test2.
//Use name in prompts, e.g., "Enter's Joe's score for test1".
// ---------------------------------------------
public void inputGrades()
{
//add body of inputGrades
Scanner scan = new Scanner(System.in);
System.out.println("Enter " + name + "'s" + " score" + " as a digit with or without decimals");
test1 = scan.nextInt();
test2 = scan.nextInt();
}
// ---------------------------------------------
//getAverage: compute and return the student's test average
// ---------------------------------------------
//add header for getAverage
public double getAverage()
{
//add body of getAverage
double average = (test1 + test2)/2;
return average;
}
// ---------------------------------------------
//getName: print the student's name
// ---------------------------------------------
//add header for printName
public String getName()
{
//add body of printName
return name;
}

public String toString()
{
return "Name: " + name + "\t" + "Test1: " + test1 + "\t" + "Test1: " + test2;
}

}

//Band Booster Class

import java.util.Scanner;
public class Lab4
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter name");
String name1 = scan.nextLine();
String name2 = scan.nextLine();
Lab4 band1 = new Lab4(name1);
Lab4 band2 = new Lab4(name2);
System.out.println("Enter the number of boxes sold by " + name1 + " this week: ");
int week1 = scan.nextInt();
band1.updateSales(week1);
System.out.println("Enter the number of boxes sold by " + name1 + " this week: ");
int week2 = scan.nextInt();
band1.updateSales(week2);
System.out.println("Enter the number of boxes sold by " + name1 + " this week: ");
int week3 = scan.nextInt();
band1.updateSales(week3);
System.out.println("Enter the number of boxes sold by " + name2 + " this week: ");
int week4 = scan.nextInt();
band2.updateSales(week4);
System.out.println("Enter the number of boxes sold by " + name2 + " this week: ");
int week5 = scan.nextInt();
band2.updateSales(week5);
System.out.println("Enter the number of boxes sold by " + name2 + " this week: ");
int week6 = scan.nextInt();
band2.updateSales(week6);
System.out.println(band1);
System.out.println(band2);
}
private String name;
private int boxesSold;

public Lab4(String bname)
{
name = bname;
boxesSold = 0;
}

public void updateSales(int aBoxes)
{
boxesSold = boxesSold + aBoxes;
}

public String getName()
{
return name;
}

public String toString()
{
return name + ": " + boxesSold;
}

}

//Representing Names

import java.util.Scanner;
public class Lab4
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter first name");
String first1 = scan.nextLine();
String first2 = scan.nextLine();
System.out.println("Enter middle name");
String middle1 = scan.nextLine();
String middle2 = scan.nextLine();
System.out.println("Enter last name");
String last1 = scan.nextLine();
String last2 = scan.nextLine();
Lab4 person1 = new Lab4(first1, middle1, last1);
Lab4 person2 = new Lab4(first2, middle2, last2);
System.out.println(person1.firstMiddleLast());
System.out.println(person1.lastFirstMiddle());
System.out.println(person1.initials());
System.out.println(person1.length());
System.out.println(person2.firstMiddleLast());
System.out.println(person2.lastFirstMiddle());
System.out.println(person2.initials());
System.out.println(person2.length());
System.out.println(person1.equals(person2));
}

private String first;
private String middle;
private String last;

public Lab4(String f, String m, String l)
{
first = f;
middle = m;
last = l;
}

public String getFirst()
{
return first;
}

public String getMiddle()
{
return middle;
}

public String getLast()
{
return last;
}

public String firstMiddleLast()
{
return first + " " + middle + " " + last;
}

public String lastFirstMiddle()
{
return last + "," + first + " " + middle;
}

public boolean equals(Lab4 otherName)
{
return this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
}

public String initials()
{
return (first.substring(0,1) + middle.substring(0,1) + last.substring(0,1)).toUpperCase();
}

public int length()
{
return first.length() + middle.length() + last.length();
}


}

