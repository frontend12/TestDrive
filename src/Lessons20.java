public class Lessons20 {
    public static void main(String[] args){
        Human human1 = new Human("bob",15);

    }

}

class Human {

    private String name;
    private int age;

    public  Human() {
        this.name = "имя по умолчанию";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("Привет я второй конструктор");
        this.name = name;
    }
    public Human(String name, int age){
        System.out.println("привет я третий конструктор");
        this.name = name;
    }

    public void setName(String name){ this.name = name;}

    public void setAge(int age) { this.age = age;}


}