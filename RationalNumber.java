public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nums, int deno){
    super((0.0+nums)/deno);
    numerator = nums;
    denominator = deno;

    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    if (deno < 0) {
      numerator = nums * -1;
      denominator = deno * -1;
    }
  }

  public double getValue() {
    return super.getValue();
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }


}
