public class Rectangle  extends Shape {
    private double         length_, width_;

    Rectangle (double length, double width, int color) {
        super (color);
        length_ = length;
        width_  = width;
    }
    public double getArea () {
        return length_ * width_;
    }
    public String toString() {
        return "Area=" + getArea() + ",Color =" + getColor();
    }
}


