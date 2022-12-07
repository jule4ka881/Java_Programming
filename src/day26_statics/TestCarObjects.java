package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {
        //we need to create 5 different car objects
        //Car1:

        Car car1 = new Car("BMW");
        System.out.println(car1);

        //Car2:

        Car car2 = new Car("Audi","Q4");
        System.out.println(car2);

        //Car3:

        Car car3 = new Car("Toyota","Camry",2021);
        System.out.println(car3);

        //Car4:

        Car car4 = new Car("Honda","Accord",2020,30000);
        System.out.println(car4);

        //Car5:

        Car car5 = new Car("Lexus","RX350", 2019, 40000, "Black");
        System.out.println(car5);

    }
}
