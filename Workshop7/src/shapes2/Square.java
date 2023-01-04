package shapes2;

public class Square extends Rectangle{
	
	AreaOfShape squareArea = () -> getWidth() * getWidth();
	
	
    public Square(double length) throws ParallelogramException {
        super(length, length);
    }
    

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return String.format( "%s {s=%s} perimeter = %g area = %g",
                this.getClass().getSimpleName(), this.getWidth(), this.getPerimeter(), this.squareArea.calculateArea());
    }
}
