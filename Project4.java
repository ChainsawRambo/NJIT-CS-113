//Devon Keen

//4/17/19

//CS113-002

//Project 4

public class Project4 {

  public static void main(String[] args) {
  
  class Rational extends Number implements Comparable<Rational> {
  
  private int numerator;
  private int denominator;
  public Rational(int numerator, int denominator) {
    
    int gcd = gcd(numerator,denominator);
    this.numerator = numerator/gcd;
    this.denominator = denominator/gcd;
  }

  public Rational add(Rational second) {
    return new Rational((this.numerator * second.denominator) + (this.denominator * second.numerator), this.denominator * second.denominator);
  }

  public Rational div(Rational second) {
    
    return new Rational(this.numerator * second.denominator, this.denominator * second.numerator);
    }

  public Rational mul(Rational second) {

    return new Rational(this.numerator * second.numerator, this.denominator * second.denominator);
  }

  public Rational sub(Rational second) {

    return new Rational((this.numerator * second.denominator) - (this.denominator * second.numerator), this.denominator * second.denominator);
  }
  public int gcd(int m, int n) {
    int r = 0;
    while(n != 0)
    {
      r = m % n;
      m = n;
      n = r;
  }
    return m; 
  }
  public String toString() {

    return numerator + "/" + denominator;
  }
  public double doubleValue(){
   return numerator/denominator;
  }
  public float floatValue(){
   return (float)(numerator/denominator);
  }
  public long longValue(){
   return (long)(numerator/denominator);
  }
  public int intValue(){
   return (int)(numerator/denominator);
  }
  public int compareTo(Rational o){
   if ((double)(numerator)/denominator > (double)(o.numerator)/o.denominator){
      return 1;
   }
   else if ((double)(numerator)/denominator < (double)(o.numerator)/o.denominator){
      return -1;
   }
   else {
      return 0;
   }
  }
 }
}
}
  

