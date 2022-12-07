package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed ="Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "large";
        dog1.color = "Gray";

        Dog dog2 = new Dog();

        dog1.name = "Bella";
        dog1.breed ="Golden Retriever";
        dog1.gender = 'F';
        dog1.age = 2;
        dog1.size = "Small";
        dog1.color = "Orange";

        Dog dog3 = new Dog();
        dog3.setInfo("Loki","Chow chow", "Small",'M', 2, "White" );
        Dog dog4 = new Dog();
        dog4.setInfo("Cooper", "Labrador","Big",'M',2,"Yellow");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);


        dog3.eat(); //dog3 will be eating
        dog2.drink(); //dog2 will be drinking
    }

}
