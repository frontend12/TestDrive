public class ClassesAndObgects {
     public static void main(String[] args) {
         Person person1 = new Person();
        person1.setName("roma");
         person1.age = 50;
         person1.speak();




         Person person2 = new Person();
         person2.name = "vova";
         person2.age = 30;
         person2.sayHello();
         int year1 = person1.calculateYearsToRetirement();
         int year2 = person2.calculateYearsToRetirement();
         System.out.println("первому челу до пенсии"+year1+" лет");
         System.out.println("первому челу до пенсии"+year2+" лет");


     }
}
class Person{
    //У класса могут быть
    // 1.данные(поля)
    // 2. действия, которые может совершать (методы)
    String name;
    int age;



    void setName(String username){
        name = username;
}


    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;

    }

    void speak(){
        for (int i =0; i<3; i++)
        System.out.println("мен зовут "+name+",мне"+age+" лет");
    }
    void sayHello(){
        System.out.println("Привет");
    }
}