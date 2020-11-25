public class RealNumber extends Number{
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
    if (other.getValue() == 0) {
      return value == 0;
    }
    else if (value == 0) {
      return other.getValue() == 0;
    }
    else {
      double error = (value-other.getValue())/value;
    return Math.abs(error)<0.00001;

      }
    }
    public RealNumber add(RealNumber other){
        RealNumber r = new RealNumber(other.getValue() + value);
         return r;
      }
    public RealNumber multiply(RealNumber other){

             RealNumber r = new RealNumber(other.getValue() * value);
              return r;
     }
     public RealNumber divide(RealNumber other) {

        RealNumber r = new RealNumber(value/other.getValue());
         return r;
     }
     public RealNumber subtract(RealNumber other ) {

       RealNumber r = new RealNumber(value- other.getValue());
        return r;
     }
   }
