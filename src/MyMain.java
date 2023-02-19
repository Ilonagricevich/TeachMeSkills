public class MyMain {
    public static void main (String [] args){
        CreditCard card1 = new CreditCard(123456789, 100.5);
        CreditCard card2 = new CreditCard(561234711, 90);
        CreditCard card3 = new CreditCard(951362487, 130);

        card1.chargeAnAmount();
        card2.chargeAnAmount();
        card3.withdrawAnAmount();

        System.out.println();

        card1.accountInfo();
        card2.accountInfo();
        card3.accountInfo();

    }
}
