public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;
  
    public double getRadius() {
      return radius;
    }
    public void setRadius(double radius) {
      this.radius = radius;
    }
    public double getSide() {
      return side;
    }
    public void setSide(double side) {
      this.side = side;
    }
    public double getArea() {
      return area;
    }
    public void setArea(double area) {
      this.area = area;
    }
    public double getPhi() {
      return phi;
    }
  
  
    public void setSquare(double side) throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("Side should 1 or more");
      }
      area = side * side;
    }
    public double getSquare() {
      return area;
    }
  
  
    public void setCircle(double radius) throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("Radius should 1 or more");
      }
      area = phi * radius * radius;
    }
    public double getCircle() {
      return area;
    }

  
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
      if (a < 1 || b < 1 || t < 1) {
        throw new IllegalArgumentException("Side dan tall in trapezoid should 1 or more");
      }
      area = ((a + b) * t) / 2;
    }
    public double getTrapezoid() {
      return area;
    }
    @Override
    public void run() {
      System.out.println("\n*****program will start in*****");
      for (int i = 3; i > 0; i--) {
        try {
          System.out.println("Starting with thread "+i);
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          System.out.println("ERROR");
        }
      }
    }
  }