public class Lessons19 {
public static void main(String[] args) {
    Humen humen1 = new Humen();
    humen1.setAge(19);
    humen1.setName("Tom");
    humen1.getInfo();
}
}
class Humen{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+","+age);
    }

}
