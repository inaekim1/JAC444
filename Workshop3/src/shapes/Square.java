package shapes;

public class Square extends Rectangle{
    public Square(double length) throws ParallelogramException {
        super(length, length);
    }
    

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return String.format( "%s {s=%s} ",
                this.getClass().getSimpleName(), this.getWidth());
    }
}
