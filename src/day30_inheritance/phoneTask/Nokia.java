package day30_inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public String toString() {
        return "Nokia{} " + super.toString();
    }

    public void selfDefense(){
        System.out.println(getBrand()+ " " + getModel()+" can be used for self defense");


    }
}
/*
Nokia:

         Extra methods:
                        selfDefense()
 */