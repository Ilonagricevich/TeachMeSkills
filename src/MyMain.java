import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

      outputNumbers ();
      replaceLetters ();
      outputLetters ();
     outputLetters2 ();
      containsLetters ();
     startsWithNumbers ();
     endsWithNumbers ();
    }
    public static void outputNumbers (){
        //Вывести на экран в одну строку два первых блока по 4 цифры

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        String DocumentNumber = Number.next();

        String str1 = DocumentNumber.substring(0,4);
        String str2 = DocumentNumber.substring(9,13);
        System.out.println("The first two blocks of 4 digits are: " +str1+str2);


    }
    public static void replaceLetters (){
        //Вывести на экран номер документа, но блоки из трех букв заменить
        //на *** (каждая буква заменятся на *).

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        String DocumentNumber = Number.next();

        String str1 = DocumentNumber.substring(0,5);
        String str2 = DocumentNumber.substring(8,14);
        String str3 = DocumentNumber.substring(17,22);
        System.out.println("New number of document is: " +str1+"***"+str2+"***"+str3);

    }

    public static void outputLetters (){
        //Вывести на экран только одни буквы из номера документа в
        //формате yyy/yyy/y/y в нижнем регистре.

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        String DocumentNumber = Number.next();

        String str1 = DocumentNumber.substring(5,8);
        String str2 = DocumentNumber.substring(14,17);
        String str3 = DocumentNumber.substring(19,20);
        String str4 = DocumentNumber.substring(21,22);
        System.out.println("New number of document is: " +str1.toLowerCase()+"/"+str2.toLowerCase()+"/"+str3.toLowerCase()+
                "/"+str4.toLowerCase());

   }
    public static void outputLetters2 (){
       // Вывести на экран буквы из номера документа в формате
       // "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        StringBuilder DocumentNumber = new StringBuilder (Number.next());

        DocumentNumber.setCharAt(8, '/');
        DocumentNumber.setCharAt(17, '/');
        DocumentNumber.setCharAt(20, '/');
        DocumentNumber.delete(0,5);
        DocumentNumber.delete(4,9);
        DocumentNumber.delete(8,9);

        String Str = String.valueOf(DocumentNumber);

        System.out.println("Letters: "+ Str.toUpperCase());


    }

    public static void containsLetters (){
       // Проверить содержит ли номер документа последовательность abc и
      //  вывеcти сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        String DocumentNumber = Number.next();

        if (DocumentNumber.indexOf("ABC")>0) {
            System.out.println("This string contains ABC");}
        if (DocumentNumber.indexOf("abc")>0) {
                System.out.println("This string contains abc");}
        if (DocumentNumber.indexOf("abc")<0 && DocumentNumber.indexOf("ABC")<0) {
            System.out.println("This string contains other symbols");}

        }

    public static void startsWithNumbers () {
        // Проверить заканчивается ли номер документа на последовательность 1a2b.

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        String DocumentNumber = Number.next();

        System.out.println ("This string starts with 555: "+DocumentNumber.startsWith("555"));

    }

    public static void endsWithNumbers () {
        // Проверить начинается ли номер документа с последовательности 555.

        System.out.print("Please, enter document number in the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter: ");
        Scanner Number = new Scanner(System.in);
        String DocumentNumber = Number.next();

        System.out.println ("This string ends with 1a2b: "+DocumentNumber.endsWith("1a2b"));

        Number.close();
    }

}
