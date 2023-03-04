package Task2;

public class Director extends Staff implements Info{
    String position;

    public Director (){
        position = "Director";
    }

    @Override
    public void getInfo() {
        System.out.println ("The position of this specialist is "+position);
    }
}
