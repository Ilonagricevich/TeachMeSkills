public class Login {
    String UserLogin;

    public Login(String Login) {
        UserLogin=Login;
    }

    public void enterLogin() {
        int counter = UserLogin.indexOf(' ');
        if (counter < 0 && UserLogin.length() < 19) {
            System.out.println("Your Login is correct.");
        } else {
            throw new StringIndexOutOfBoundsException("WrongLoginExeption! You enter wrong Login. Your login has space or " +
                    "login's length is more than 20 symbols.");
        }
    }
}
