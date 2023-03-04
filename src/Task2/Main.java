package Task2;

public class Main {
    public static void main (String [] args){

       Director director = new Director();
       director.getInfo();
       System.out.println();
       Worker worker = new Worker();
       worker.getInfo();
       System.out.println();
       Accountant accountant = new Accountant();
       accountant.getInfo();
    }}
