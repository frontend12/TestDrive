package Traid;

public class Test {
    public static void main(String[] args){
        Animal animal = new Dog();
        animal.eat();

        Dog doc2 = (Dog) animal;
        doc2.barc();
    }
}



