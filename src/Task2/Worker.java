package Task2;

public class Worker extends Staff implements Info{

    String position;

    public Worker (){
        position = "Worker";}

    @Override
    public void getInfo() {
        System.out.println ("The position of this specialist is "+position);
    }
}