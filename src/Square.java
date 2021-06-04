public class Square extends Shape {
    private  double         side;

    Square (double s, int color) {
        super (color);
        side = s;
    }

    public double getArea () {
        return  side * side;
    }
    public String toString() {
        return "Area=" + getArea() + ",Color =" + getColor();
    }
}