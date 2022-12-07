package day25_Constructor;

public class TestRectangleObjects {
    public static void main(String[] args) {
Rectangle rectangle1 = new Rectangle(3,4);
Rectangle rectangle2 = new Rectangle(5,7);
Rectangle rectangle3 = new Rectangle(6,2);
       // Rectangle rectangle1 = new Rectangle();
//rectangle1.setInfo(3,4);//manually calling setInfo method to set length and width

  //      Rectangle rectangle2 = new Rectangle();
    //    rectangle2.setInfo(5,7);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
    }
}
/* //this code is long, upper
Rectangle rectangle1 = new Rectangle();
rectangle1.setInfo(3,4);//manually calling setInfo method to set length and width

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(5,7);

 */