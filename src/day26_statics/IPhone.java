package day26_statics;

public class IPhone {

    public static String brand = "Apple";
    public String model;
    public String color;
    public double price;
    public static String OS = "iOS"; //OS is all the same for iphone objects
    public static String madeIn = "China";
public static boolean hasBattery = true;
public static boolean isTouchScreen = true;
public static boolean isExpensiveToFix = true;

public void printPhoneInfo(){
    System.out.println("Brand: " + brand);
    System.out.println("color = " + color);
    System.out.println("model = " + model);
    System.out.println("price = " + price);
}

public static void printOperatingSystem(){
    System.out.println("OS = " + OS);
}

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
/*
Attributes:
brand,model,color, price, OS, madeIn,hasBattery
static,inst, inst,  inst,static,static,static,
 */