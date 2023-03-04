package Task1;

public class Main {

    public static void main(String[] args) {

        Figures[] figure = {new Triangle(3, 4, 25),
                new Circle(3),
                new Rectangle(1, 4),
                new Rectangle(2, 10),
                new Circle(5)};


        int sumP = 0;
        int sumA = 0;
        for (int i = 0; i < figure.length; i++) {
            sumP +=  figure[i].calculateThePerimeter();
            sumA += figure[i].calculateTheArea();

        }
        System.out.println("The sum of perimeters is: "+sumP);
        System.out.println("The sum of areas is: "+sumA);
    }
}
