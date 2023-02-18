import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    double accountAmount;

    public CreditCard()
    {
        accountNumber = 12345678;
        accountAmount = 200.3;

    }
    public void chargeAnAmount() {
        System.out.print ("Enter the amount: ");
        Scanner UserAmount = new Scanner (System.in);
        int UserAmount2 = UserAmount.nextInt();
        double amountAfterDeposit = accountAmount + UserAmount2;}

    public void withdrawAnAmount() {
        System.out.print ("Enter the amount: ");
        Scanner UserAmount = new Scanner (System.in);
        int UserAmount2 = UserAmount.nextInt();
        double amountAfterWithdrawal = accountAmount - UserAmount2;}

    public void accountInfo() {
        System.out.println ("Your account number is: "+accountNumber);
        System.out.printf ("You hva %d roubles on your account. ", accountNumber);}


    }


    