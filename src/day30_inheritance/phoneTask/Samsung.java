package day30_inheritance.phoneTask;

public class Samsung extends Phone{


    public Samsung(String brand, String model, String size, String color) {
        super(brand, model, size, color,200.0);
    }

    public void freeze(){
        System.out.println(getBrand() + " "+ getModel()+ " freezes a lot");
    }
}
/*
Samsung:
        Extra methods:
        freeze()
 */