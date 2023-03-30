import java.io.IOException;

public class Lesson14 extends Thread{
    public static void main(String[] args) {
        Thread T1 = new Thread(() ->
                System.out.println("This is the first thread"));

        Thread T2 = new Thread(() ->
                System.out.println("This is the second thread"));
        Thread T3 = new Thread(() ->
                    System.out.println("This is the third thread"));
        T3.start();

        try
        {

            T3.join();

        } catch (InterruptedException msg)
        {
            System.out.println(msg);
        }
        T2.start();
        try
        {

            T2.join();

        } catch (InterruptedException msg)
        {
            System.out.println(msg);
        }
        T1.start();

        try
        {

           T1.join();
        } catch (InterruptedException msg)
        {
            System.out.println(msg);
        }

    }


}

