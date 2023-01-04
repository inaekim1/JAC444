package shapes2;

public class Triangle implements Shape{
    private double s1, s2, s3;

    // Constructor
    public Triangle(double s1, double s2, double s3) throws TriangleException {
        if(s1 > 0 && s2 > 0 && s3 > 0 && (s1 + s2) > s3 && (s2 + s3) > s1 && (s1 + s3) > s2) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        } else {
            throw new TriangleException("Invalid side(s)!");
        }
    }

    // Getter
    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    // Setter
    public void setS1(double s1) throws TriangleException {
        if(s1 > 0) {
            this.s1 = s1;
        } else {
            throw new TriangleException("Invalid side!");
        }
    }

    public void setS2(double s2) throws TriangleException {
        if(s2 > 0) {
            this.s2 = s2;
        } else {
            throw new TriangleException("Invalid side!");
        }
    }

    public void setS3(double s3) throws TriangleException {
        if (s3 > 0) {
            this.s3 = s3;
        } else {
            throw new TriangleException("Invalid side!");
        }
    }

    @Override
    public double getPerimeter() {
        return getS1() + getS2() + getS3();
    }

    @Override
    public String toString() {
        return String.format("%s {s1=%s, s2=%s, s3=%s} perimeter = %g",
                getClass().getSimpleName(), getS1(), getS2(), getS3(), this.getPerimeter());
    }
}
