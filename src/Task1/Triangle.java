package Task1;

public class Triangle extends Figures{
    double a;
    double b;
    double c;

    public Triangle() {

    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public int calculateThePerimeter() {
       int perimeter = (int) (this.a+this.b+this.c);
        return perimeter;
    }

    @Override
    public int calculateTheArea() {
       int p = (int) ((this.a+this.b+this.c)/2);
        int area = (int) (Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)));
        return area;
    }
}