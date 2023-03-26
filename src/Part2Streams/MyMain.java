package Part2Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class MyMain {
    public static void main(String[] args)
    {
        ArrayList<Integer> elements = new ArrayList<>(Arrays.asList(1,2,3,4,8,10,10,5,69,82,102,543,54,1,87,29,6,5,8,7,4,25,85));
        System.out.println("Elements without duplicates: "+ elements.stream().distinct().collect(Collectors.toList()));
        System.out.println();
        System.out.println("Even elements from 7 to 17: "+ elements.stream().filter(x -> x % 2 == 0 && x>=7 && x<=17).collect(Collectors.toList()));
        System.out.println();
        System.out.println("Multiplied elements: "+ elements.stream().map(x -> x*2).collect(Collectors.toList()));
        System.out.println();
        System.out.println("Sorted first 4 elements are: "+ elements.stream().sorted().limit(4).collect(Collectors.toList()));
        System.out.println();
        System.out.println("Stream's size is: "+elements.size());
        System.out.println();
        int sum =0;
        for (int i = 0; i< elements.size(); i++){
            sum+=elements.get(i);
        }
        System.out.println("Arithmetic mean of all elements of stream is: "+(sum/ elements.size()));

    }}
