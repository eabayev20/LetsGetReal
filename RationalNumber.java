public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber (int nume, int deno) {
    super(0.0);
  numerator = nume;
  denominator = deno;
  if (deno == 0) {
      deno = 1;
      nume = 0;
    }
    if (deno < 1) {
      deno = deno * -1;
      nume = nume * -1;
    }
    numerator = nume;
    denominator = deno;
    reduce();
  }
  public double getValue(){
    return (double)numerator/(double)denominator;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
    RationalNumber r = new RationalNumber(denominator,numerator);
    r.reduce();
    return r;

  }
  public boolean equals(RationalNumber other){
    if (other.getNumerator()==0) {
      denominator = other.getDenominator();
    }

    if (numerator == other.getNumerator() && denominator == other.getDenominator()) {
      return true;
    }
    return false;
  }
  public String toString() {
    String s = "";
    s = s + numerator + "/" + denominator;
    return s;
  }
  private static int gcd(int a, int b){
    while(b!=0){
      int r = a%b;
      a = b;
      b = r;
    }
    return a;
  }
  private void reduce(){
    int g = gcd(numerator, denominator);
    numerator = numerator/g;
    denominator = denominator/g;
  }
  public RationalNumber multiply(RationalNumber other){
    int newden = denominator * other.getDenominator();
    int newnum = numerator * other.getNumerator();
    RationalNumber r = new RationalNumber(newnum,newden);
    return r;
  }
  public RationalNumber divide(RationalNumber other){
    int newden = denominator * other.getNumerator();
    int newnum = numerator * other.getDenominator();

    RationalNumber r = new RationalNumber(newnum,newden);
    return r;
  }
  public RationalNumber add(RationalNumber other){
    int nume1 = numerator * other.getDenominator();
    int nume2 = other.getNumerator() * denominator;
    int diff = nume1 + nume2;
    int commonDeno = denominator * other.getDenominator();
    return new RationalNumber(diff,commonDeno);
  }
  public RationalNumber subtract(RationalNumber other){
    int nume1 = numerator * other.getDenominator();
    int nume2 = other.getNumerator() * denominator;
    int diff = nume1 - nume2;
    int commonDeno = denominator * other.getDenominator();
    return new RationalNumber(diff,commonDeno);
  }
}
