import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        System.out.println();
        //increaseNumbers();
        System.out.println();
        playChess();
    }


    static void increaseNumbers() {

        /* Создать двухмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый
        элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.*/

        int[][] twoDimensionalArray = {
                {1, 2, 3},
                {10, 12, 11},
                {5, 16, 20}
        };

        System.out.println("The array is: " + Arrays.deepToString(twoDimensionalArray));
        int Nubmer2;
        System.out.print("Please, enter your number: ");
        Scanner Number = new Scanner(System.in);
        Nubmer2 = Number.nextInt();



        for (int rows = 0; rows < twoDimensionalArray.length; rows++) {
            for (int cols = 0; cols < twoDimensionalArray[rows].length; cols++) {

                twoDimensionalArray[rows][cols] += Nubmer2;
                Number.close();}
            }

        System.out.println("New array is: " + Arrays.deepToString(twoDimensionalArray));
    }

    static void playChess() {

        /* Создать двухмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый
        элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.*/

        char[][] twoDimensionalArray = new char[8][8];
        char SybmolW = 'W';
        char SybmolB = 'B';

        for (int rows = 0; rows < twoDimensionalArray.length; rows++) {
            for (int cols = 0; cols < twoDimensionalArray[rows].length; cols++) {
            if ((cols+rows)%2==0) {
                twoDimensionalArray[rows][cols] = SybmolW;
            } else {
                twoDimensionalArray[rows][cols] = SybmolB;}
                            }

                      }

        System.out.println(Arrays.deepToString(twoDimensionalArray));
    }


}


    