package Task1;

public class Rectangle extends Figures{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }
    @Override
    public int calculateTheArea() {
        int area=(int) (a*b);
        return area;}

    @Override
    public int calculateThePerimeter() {
        int perimeter= (int)((a + b) * 2);
        return perimeter;}


}
