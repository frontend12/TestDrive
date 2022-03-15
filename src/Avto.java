 class AvtoTest {
        String model;
        String type;
        int money;
        void playIt() {
            System.out.println("Test drive avto");
     }

}


public class Avto {
    public static void main(String[] args) {

        AvtoTest toyota = new AvtoTest();

        toyota.model = "Toyota";
        toyota.type = "Hechback";
        toyota.money = 1000000;
        toyota.playIt();
    }

}