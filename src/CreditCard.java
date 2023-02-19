import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    double accountAmount;

    public CreditCard (int cardNumber, double cardAmount)
    {
        accountNumber = cardNumber;
        accountAmount = cardAmount;
    }
    public void chargeAnAmount() {
        System.out.print ("Please, enter the amount of replenishment of the card with the account number "+accountNumber+": ");
        Scanner UserAmount = new Scanner (System.in);
        double UserAmount2 = UserAmount.nextDouble();
        accountAmount =accountAmount + UserAmount2;}

    public void withdrawAnAmount() {
        System.out.print ("Please, enter the withdrawal amount from the card with the account number "+accountNumber+": ");
        Scanner UserAmount = new Scanner (System.in);
        double UserAmount2 = UserAmount.nextDouble();
        accountAmount = accountAmount - UserAmount2;}

    public void accountInfo() {
        System.out.println ("The card account number is: "+ accountNumber);
        System.out.println ("Card balance is "+accountAmount+" roubles.");
        System.out.println();}


    }


    