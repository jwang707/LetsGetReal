public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (getValue() == other.getValue()) {
      return 0;
    }
    else if (getValue() > other.getValue()) {
      return 1;
    }
    else return -1;
  }

  public boolean equals(Number other){
    if (getValue() == 0 || other.getValue() == 0) {
      return getValue() == 0 && other.getValue() == 0;
    }

    double dummy = Math.abs((getValue() - other.getValue())/getValue());
    return (dummy < 0.0001);

  }
}
