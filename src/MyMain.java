import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        System.out.print("Please, enter your login: ");
        Scanner Login = new Scanner(System.in);
        String UserLogin = Login.nextLine();
        Login login = new Login(UserLogin);
        login.enterLogin();


        System.out.print("Please, enter your password: ");
        Scanner Password = new Scanner(System.in);
        String UsPass = Password.nextLine();
        Password pass = new Password(UsPass,"");
        pass.enterPassword();



        System.out.print ("Please, confirm your password: ");
        Scanner Password2 = new Scanner (System.in);
        String UserPassword2 = Password2.next();
        Password pass2 = new Password(UsPass,UserPassword2);
        pass2.confirmPassword();



        Password2.close();
    }

}
