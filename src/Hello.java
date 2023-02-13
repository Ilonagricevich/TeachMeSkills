import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hello {

        public static void main(String[] args) {
        System.out.println();
        checkThenumber();
        System.out.println();
        deleteNumbers();
        System.out.println();
        outputminmax();
        System.out.println();
        outputMinMaxAverageOfArrayNumbers();
    }

    static void checkThenumber() {

    /*Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число
    в массив или нет. Пусть число для поиска задается с консоли (класс Scanner).*/

        int[] numbers = new int[]{10, 20, 30, 5};

        System.out.print("Please, enter your number: ");
        Scanner Number = new Scanner(System.in);
        int userNumber = Number.nextInt();
        int index = 0;
        int ArrayElement;
        int place=0;

        for (index = 0; index < numbers.length; index++) {
            ArrayElement = numbers[index];
            if (ArrayElement == userNumber)
            place++;}
        if (place>0){
                System.out.println("This number is in the array");}
        else {
                System.out.println("This number is not in the array");
            }


            Number.close();
        }


    static void deleteNumbers() {

    /*Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть число задается с
    консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом. В результате должен быть
    новый массив без указанного числа.*/

        int[] numbers = new int[]{6, 10, 128, 1010};
        System.out.print("Please, enter your number: ");
        Scanner Number = new Scanner(System.in);
        int userNumber = Number.nextInt();
        int index = 0;
        int ArrayElement;
        int place = Arrays.binarySearch(numbers, userNumber);
        int index2 =0;

        if (place<0){
            System.out.println ("This number is not in the array");}

       for (index = 0; index < numbers.length; index++) {
       index2=index;
       ArrayElement = numbers[index];
       if (ArrayElement != userNumber && place>=0) {
       System.out.println(numbers[index2]);}


       }

          Number.close();
    }



    static void outputminmax() {

    /* Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
    Для генерации случайного числа используйте метод Math.random(). Пусть будет возможность создавать массив произвольного
    размера. Пусть размер массива вводится с консоли.*/


        System.out.print("Please, enter your number: ");
        Scanner arraysize = new Scanner (System.in);
        int[] numbers = new int[arraysize.nextInt()];
        int average = 0;



        for (int index = 0; index<numbers.length; index++) {
           Random newnumber = new Random ();
            numbers[index] = newnumber.nextInt(101);
            average += numbers[index];
        }

            System.out.println(Arrays.toString(numbers));

        int min = numbers[0];
        for (int index = 0; index<numbers.length; index++) {
        if (numbers[index]<min) {
            min = numbers[index];}}

        int max = numbers[0];
        for (int index = 0; index<numbers.length; index++) {
        if (numbers[index]>max) {
                max = numbers[index];}}


        System.out.println ("Average value of the array numbers is: " + average/numbers.length);
        System.out.println ("Maximal value of the array numbers is: " + max);
        System.out.println ("Minimal value of the array numbers is: " + min);
        arraysize.close();

        }

    static void outputMinMaxAverageOfArrayNumbers() {
    /*Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
    сообщите, что их средние арифметические равны).*/


        int[] array1 = new int[] {21,4,6,7,10};
        int [] array2 = new int [] {5,6,7,8,9};

        System.out.println("The first array is: "+Arrays.toString(array1));
        System.out.println("The second array is: "+Arrays.toString(array2));


        int average1 = 0;
        int average2 = 0;


        for (int index1 = 0; index1<array1.length; index1++) {
            average1 += array1[index1];}

        for (int index2 = 0; index2<array2.length; index2++) {
            average2 += array2[index2];}

        if (average1>average2){
            System.out.println ("The first array has the highest value of the arithmetic mean.");}

        else if (average1<average2){
            System.out.println ("The second array has the highest value of the arithmetic mean.");}

        else if (average1==average2){
            System.out.println ("Values of arrays arithmetic means are equal.");}
    }
        }











    