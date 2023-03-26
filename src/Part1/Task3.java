package Part1;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        System.out.print("Enter 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 2) {

            Interface<Integer, Integer> factorial = x -> {
                int result = 1;
                for (int i = 1; i <=x; i ++){
                    result = result*i;
                }
                return result;
            };
            System.out.println(factorial.apply(scanner.nextInt()));}
            else if (userNumber == 1) {

                Interface<String, String> reverseTheString = x -> {
                    String result = "";
                    for (int i = 0; i < x.length(); i++) {
                        result = x.charAt(i) + result;
                    }
                    return result;
                };
            Scanner scanner1 = new Scanner(System.in);
                String user = scanner1.nextLine();
                System.out.println(reverseTheString.apply(user));
            scanner1.close();
            }

    }}
