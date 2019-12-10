//Devon Keen

//2/14/19

//CS113-002

//Project 1

public class Project1 {

  public static void main(String[] args) {

    Rational one = new Rational(2.0, 3.0);
    Rational two = new Rational(1.0, 2.0);

    System.out.println(one + " + " + two + " = " + one.add(two));
    System.out.println(one + " - " + two + " = " + one.sub(two));
    System.out.println(one + " * " + two + " = " + one.mul(two));
    System.out.println(one + " / " + two + " = " + one.div(two));
  }
}

class Rational {
  
  private double numerator;
  private double denominator;
  public Rational(double numerator, double denominator) {

    this.numerator = numerator;
    this.denominator = denominator;
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
  public double gcd(double m, double n) {
    double r = 0;
    while(n != 0)
    {
      r = m % n;
      n = m;
      n = r;
  }
    return m; 
  }
  public String toString() {

    return numerator + "/" + denominator;
  }

  
}
