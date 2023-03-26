package Part1;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        System.out.print("Enter 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if (userNumber == 1) {
            String user = scanner.nextLine();

            Interface<String, String> reverseTheString = x -> {
                String.valueOf(new StringBuilder(x).reverse());
                return x;
            };

            System.out.println(reverseTheString.apply(user));
        }
        if (userNumber == 2) {

            Interface<Integer, Integer> factorial = x -> {
                int result = 1;
                for (int i = 1; i <=x; i ++){
                    result = result*i;
                }
                return result;
            };
            System.out.println(factorial.apply(scanner.nextInt()));
    }}}
