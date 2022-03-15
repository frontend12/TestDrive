package Dom;

public class Test {
    public static void main(String[] args){

        Dog dog = new Dog();
        Animal animal = new Dog();  // upCasting

        Dog dog2 = (Dog) new Animal();//Dowcasting
        dog2.barc();


    }
}
