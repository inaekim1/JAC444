package shapes2;


/** This class creates a shape of type circle */
public class Circle implements Shape {
	
	private double radius;
	private final double PI = Math.PI;
	
	private AreaOfShape circleArea = () -> PI * getRadius() * getRadius();
	
	/**
	 * Constructor accepts a double for the radius
	 * @param radius A positive double representing the radius of the circle
	 * @throws CircleException Throws a message if data is not valid
	 */
	public Circle(double radius) throws CircleException {
		if (radius > 0) {
			this.radius = radius;			
		} else {
			throw new CircleException("Invalid radius!");
		}
	}
	
	// Setters
	public void setRadius(double radius) throws CircleException {
		if (radius > 0) {
			this.radius = radius;
		} else {
			throw new CircleException("Invalid radius!");
		}
	}
	
	// Getters
	public double getRadius() {
		return radius;
	}
	
	  @Override
	  public double getPerimeter() {
	      return getRadius() * 2 * PI;
	  }
	
    @Override
    public String toString() {
        return String.format("%s {r=%s} perimeter = %g area = %g",this.getClass().getSimpleName(), this.getRadius(), getPerimeter(), circleArea.calculateArea());
    }

}

