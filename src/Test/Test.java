package Test;


import java.util.ArrayList;
import java.util.List;
import java.util.jar.Manifest;

public class Test {
    public static void main(String[] args){
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String)animals.get(1);
        System.out.println(animal);




    }
}
