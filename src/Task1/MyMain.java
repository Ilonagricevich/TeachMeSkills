package Task1;

      public class MyMain{
      public static void main(String[] args) {

            Figure[] figure = {new Triangle(3, 4, 5, 0),
                    new Circle(0, 0, 0, 3),
                    new Rectangle(1, 4, 0, 0),
                    new Rectangle(2, 10, 0, 0),
                    new Circle(0, 0, 0, 5)};
            double sumP = 0;
            double sumA = 0;
            for (int i = 0; i < figure.length; i++) {
                  figure[i].calculateThePerimeter();
                  sumP = sumP + perimeter;
            }
            for (int i = 0; i < figure.length; i++) {
                  figure[i].calculateTheArea();
                  sumA = sumA + area;
            }
            System.out.println("The sum of perimeters is: "+sumP);
            System.out.println("The sum of areas is: "+sumA);
      }}





      }
            }
      }