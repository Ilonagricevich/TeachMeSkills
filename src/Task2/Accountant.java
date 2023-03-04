package Task2;

public class Accountant extends Staff implements Info{
    String position;

    public Accountant (){
        position = "Accountant";}

    @Override
    public void getInfo() {
        System.out.println ("The position of this specialist is "+position);
    }
}
