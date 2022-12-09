package day30_inheritance.phoneTask;

public class TestPhoneObject {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone 12","Large","Black",1000.5);
        Samsung samsung = new Samsung("Galaxy S22","Medium","White","White");
        Nokia nokia = new Nokia ("bf","Brick","Small","Pink",50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(1387348785);
        samsung.text(1387348785);
        nokia.text(1387348785);


        System.out.println("---------------------------------------------------------");
        iphone.faceTime(123456789);

        nokia.selfDefense();

        samsung.freeze();

        System.out.println("------------------------------------------------------------");

        System.out.println(iphone);
        System.out.println(nokia);
        System.out.println(samsung);
    }
}
