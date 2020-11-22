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
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
