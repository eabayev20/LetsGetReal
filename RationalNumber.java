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
    denominator = deno;s
  }
  public double getValue() {
    return nume/deno;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
    return RationalNumber(getDenominator(), getNumerator());
  }
  public boolean equals(RationalNumber other){
    if (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator()) {
      return true;
    }
    return false;
  }
  public String toString() {
    String s = "";
    s = s + getNumerator() + "/" + getDenominator();
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
    g = gcd(getNumerator(), getDenominator());
    RationalNumber(getNumerator()/g, getDenominator()/g);
  }
  public RationalNumber multiply(RationalNumber other){
    int newden = getDenominator() * other.getDenominator();
    int newnum = getNumerator() * other.getNumerator();
    return RationalNumber(newnum,newden);
  }
  public RationalNumber divide(RationalNumber other){
    int newden = getDenominator() * other.getNumerator();
    int newnum = getNumerator() * other.getDenominator();
    return RationalNumber(newnum,newden);
  }
