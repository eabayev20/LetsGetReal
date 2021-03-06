public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  public boolean equals (RealNumber other) {
    if (other == 0) {
      return getvalue() == 0;
    }
    else if (getvalue() == 0) {
      return other == 0;
    }
    else {
      double error = (value-other.getValue())/value;
    return Math.abs(error)<0.001;

    }
  }
