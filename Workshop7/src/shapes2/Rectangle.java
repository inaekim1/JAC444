package shapes2;

public class Rectangle extends Parallelogram{
	
    public Rectangle(double width, double height) throws ParallelogramException {
        super(width, height);
    }
    
    AreaOfShape rectangleArea = () -> getHeight() * getWidth();

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return String.format( "%s {w=%s, h=%s} perimeter = %g area = %g",
                this.getClass().getSimpleName(), this.getWidth(), this.getHeight(), this.getPerimeter(), this.rectangleArea.calculateArea());
    }
}
