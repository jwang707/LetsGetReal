public class RealNumber{
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return "" + getValue();
  }

  public boolean equals(RealNumber other) {
    if (getValue() == 0.0 && other.getValue() != 0.0 || getValue() != 0.0 && other.getValue() == 0.0) {
        return false;
      }
      else if (Math.abs(getValue()-other.getValue()) <= 0.00001) {return true;}
      return false;
  }

  public RealNumber add(RealNumber other) {
    return RealNumber(getValue() + other.getValue());
  }

}