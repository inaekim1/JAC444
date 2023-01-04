package shapes;

public class Square extends Rectangle{
    public Square(double length) throws ParallelogramException {
        super(length, length);
    }

    @Override
    public void setHeight(double height) throws ParallelogramException {
        if(height > 0 && height == getWidth()) {
            super.setHeight(height);
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    @Override
    public void setWidth(double width) throws ParallelogramException {
        if(width > 0 && width == getHeight()) {
            super.setWidth(width);
        } else {
            throw new ParallelogramException("Invalid side!");
        }
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
