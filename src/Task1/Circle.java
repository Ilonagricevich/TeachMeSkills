package Task1;

public class Circle extends Figures{
    double R;
    public Circle(double R) {
        this.R = R;
    }


    @Override
    public int calculateThePerimeter() {
        int perimeter = (int) (2*3.14*R);
        return perimeter; }


    @Override
    public int calculateTheArea() {
        int area = (int) (2*3.14*R*R);
        return area;
    }
}
