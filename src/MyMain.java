import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        System.out.print("Please, enter your login: ");
        Scanner Login = new Scanner(System.in);
        String UserLogin = Login.nextLine();


        int counter = UserLogin.indexOf(' ');
        if (counter < 0 && UserLogin.length() < 19) {
            System.out.println("Your Login is correct.");
        } else {
            throw new StringIndexOutOfBoundsException("WrongLoginExeption! You enter wrong Login. Your login has space or " +
                    "login's length is more than 20 symbols.");
        }
        System.out.print("Please, enter your password: ");
        Scanner Password = new Scanner(System.in);
        String UsPass = Password.nextLine();

        int counter1 = UsPass.indexOf(' ');
        int num=0;
        if (UsPass.indexOf("0") > 0 || UsPass.indexOf("1") > 0 || UsPass.indexOf("2") > 0 || UsPass.indexOf("3") > 0 || UsPass.indexOf("4") > 0) {
            num++;
            if (UsPass.indexOf("5")>0 || UsPass.indexOf("6")>0 || UsPass.indexOf("7")>0 || UsPass.indexOf("8")>0 || UsPass.indexOf("9")>0){
                num++;}}


        if (counter1<0 && UsPass.length()<19 && num>0) {
            System.out.println ("Your Password is correct.");
        }
        else {throw new NumberFormatException("WrongPasswordExeption! You enter wrong Password. Your password has space or " +
                "hasn't got numbers or password's length is more than 20 symbols.");}

        System.out.print ("Please, confirm your password: ");
        Scanner Password2 = new Scanner (System.in);
        String UserPassword2 = Password2.next();

        System.out.println(UserPassword2.equals(UsPass));

        Login.close();
        Password.close();
        Password2.close();



    }


}
