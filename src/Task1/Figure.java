package Task1;

public class Figure {
    private double a;
    private double b;
    private double c;
    private double R;

    public Figure(){

    }
    public Figure(double a, double b, double c, double R){

        this.a = a;
        this.b = b;
        this.c = c;
        this.R = R;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getR() {
        return  R;
    }

    public double calculateTheArea() {
        double area= a*b;
return area;
    }
    public double calculateThePerimeter() {
       double perimeter= (a + b) * 2;
return perimeter;
    }

}
