package day18_garbageCollection;

public class TestPizzaObjects {
    public static void main(String[] args) {

  //data type//variable//object
      Pizza pizza1 = new Pizza();
      //pizza1.size = 'L';
pizza1.setInfo('L',2,3);

      Pizza pizza2 = new Pizza();
      //pizza2.size = 'M';
pizza2.setInfo('S',1,2);

Pizza pizza3 = new Pizza();
pizza3.setInfo('L', 3,1);
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println("-------------------------------------------------");

        double total = 0;
        for (int i = 0; i < 20; i++) { // we will have 60 total pizza's
            Pizza small = new Pizza();
            small.setInfo('S',2,2);
total +=small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M',4,3);
total +=medium.calcCost();
            Pizza large = new Pizza();
            large.setInfo('L',3,2);
total += large.calcCost();
        }
        System.out.println("total = " + total);
    }
}
