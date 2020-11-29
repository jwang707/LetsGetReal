public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nums, int deno){
    super(0.0);
    numerator = nums;
    denominator = deno;

    if (denominator == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (denominator < 0) {
      numerator = nums * -1;
      denominator = deno * -1;
    }
    reduce();
  }

  public double getValue() {
    return (double)numerator/(double)denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(this.denominator, this.numerator);
  }

  public boolean equals(RationalNumber other){
    reduce();
    other.reduce();
    return (this.numerator == other.numerator && this.denominator == other.denominator);
  }

  public String toString() {
    if (getNumerator() == 0) {return "0";}
    if (getDenominator() == 1) {return ""+getNumerator();}
    return ""+getNumerator()+"/"+getDenominator();
  }

  private static int gcd(int a, int b){
    int laziness = 1;
    for (int i = 1; i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        laziness = i;
        }
      }
    return laziness;
  }

  private void reduce() {
    int gcdHere = gcd(numerator, denominator);
    numerator = numerator/gcdHere;
    denominator = denominator/gcdHere;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
  }

  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(this.numerator * other.denominator, this.denominator * other.numerator);
  }

  public RationalNumber add(RationalNumber other){
    reduce();
    other.reduce();
    RationalNumber result = new RationalNumber(this.numerator*other.denominator + other.numerator*this.denominator, other.denominator*this.denominator);
    result.reduce();
    return result;
  }

  public RationalNumber subtract(RationalNumber other){
    reduce();
    other.reduce();
    RationalNumber result = new RationalNumber(this.numerator*other.denominator - other.numerator*this.denominator, other.denominator*this.denominator);
    result.reduce();
    return result;
  }

}
