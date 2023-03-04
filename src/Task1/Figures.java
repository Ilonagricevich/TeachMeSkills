package Task1;

public class Figures {
    private double a;
    private double b;
    private double c;
    private double R;
    private int perimeter;
    private int area;


    public Figures(){

    }
    public Figures(double a, double b, double c, double R){

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
    public double getPerimeter() {
        return  perimeter;
    }
    public double getArea() {
        return  area;
    }

    public int calculateTheArea() {
        return area;
    }
    public int calculateThePerimeter() {
       return perimeter;
    }

}
