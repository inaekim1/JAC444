package shapes;

public class Parallelogram implements Shape{
    private double width;
    private double height;

    public Parallelogram(double width, double height) throws ParallelogramException {
        if(width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) throws ParallelogramException {
        if(width > 0) {
            this.width = width;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    public void setHeight(double height) throws ParallelogramException {
        if(height > 0) {
            this.height = height;
        } else {
            throw new ParallelogramException("Invalid side!");
        }
    }

    @Override
    public double getPerimeter() {
        return (getWidth() + getHeight()) * 2;
    }

    @Override
    public String toString() {
        return String.format( "%s {w=%s, h=%s} ",
                this.getClass().getSimpleName(), this.getWidth(), this.getHeight());
    }
}
