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


        System.out.println ("Average value of the array numbers are: " + average/numbers.length);
        System.out.println ("Maximal value of the array numbers are: " + max);
        System.out.println ("Minimal value of the array numbers are: " + min);
        arraysize.close();

        }

    static void outputMinMaxAverageOfArrayNumbers() {

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











    