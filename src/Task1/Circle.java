package Task1;

public class Circle extends Figure{
    public Circle() {

    }
        public Circle(double a, double b, double c, double R) {
        super(a, b, c, R);
    }
    @Override
    public double calculateThePerimeter() {
        double perimeter = 2*Math.PI*this.getR();
    return perimeter; }


    @Override
    public double calculateTheArea() {
                double area = 2*Math.PI*this.getR()*this.getR();
        return area;
    }
}
