package Task1;

public class Triangle extends Figure{

    public Triangle() {

    }
    public Triangle(double a, double b, double c, double R) {
        super(a, b, c, R);
    }

    @Override
    public double calculateThePerimeter() {
        double perimeter = this.getA()+this.getB()+this.getC();
        return perimeter;
    }

    @Override
    public double calculateTheArea() {
        double p = (this.getA()+this.getB()+this.getC())/2;
        double area = Math.sqrt(p*(p-this.getA())*(p-this.getB())*(p-this.getC()));
        return area;
    }
}
