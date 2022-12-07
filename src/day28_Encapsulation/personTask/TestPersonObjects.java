package day28_Encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {
        //3 person objects

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Abidulah",'M');
        Person person3 = new Person("Olga", 30);
        Person person4 = new Person("Daniel","English");
        Person person5 = new Person("Yulia", 25, 'F');
        Person person6 = new Person("Lucy",31,'F',"German");

        person4.name = "James"; //to change the name
        Person.planet = "Mars"; //for all objects got Mars

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

Person.printPlanetName(); //calling method

        person1.eat("Hot Dog");
        person2.drink("Pepsi");
        person5.drink("Tea");
        person6.drink("Coffee");

    }
}
