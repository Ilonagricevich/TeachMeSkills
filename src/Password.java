public class Password {
    String UsPass;
    String UsPassConf;

    public Password() {
        //
    }
    public Password (String UsPass, String ConfirmedPassword) {
        this.UsPass = UsPass;
        UsPassConf=ConfirmedPassword;

    }

    public void enterPassword() {
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
    }
    public void confirmPassword() {
        System.out.println(UsPassConf.equals(UsPass));
    }

}
