package day13_customMethods;

public class WarmupTasks {
    public static void main(String[] args) {
//to call custom methods here
calculate(200,5,'/');
calculate(1,100,'-');
        System.out.println("--------------------------------");
        ageGroup(78);
        System.out.println("---------------------------------");
        eligibleToVote(18,true);

    }

    public static void calculate(double num1, double num2, char mathOperator){
                                    //parameters are variables of the method

        switch (mathOperator){

            case '+':
                System.out.println(num1+" "+mathOperator+ " " + num2+"="+(num1 + num2));
                break;
            case '-':
                System.out.println(num1+" "+mathOperator+ " " + num2+"="+(num1 - num2));
                break;
            case '*':
                System.out.println(num1+" "+mathOperator+ " " + num2+"="+(num1 * num2));
                break;
            case'/':
                System.out.println(num1+" "+mathOperator+ " " + num2+"="+(num1/num2));
                break;

            default :
                System.out.println("Invalid operator: "+mathOperator);
        }


    }

public static void ageGroup(int age){

        if(age>=0 && age<=150){
            System.out.println((age<=21)? "Teenager":(age< 55)? "Adult":"Senior");

        }else{
            System.out.println("Invalid age: "+ age);
        }

}

public static void eligibleToVote(int age, boolean isAmerican){

        if(age>=18 && isAmerican ){
            System.out.println("You are eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }

}
}
/*
1.Create method named calculate that can take three arguments:
num1 (double)
num2 (double)
mathOperator(char)
The method should display the calculation result of those two numbers as long as the 3rd
argument is a valid math operator, otherwise the method
Ex:
   calculate(10,20, '+')
   output:
          10+20=30

 2.Create a method named ageGroup that can print the age group of the person
    age groups are:
                   Teenager(<21)
                   Adult(>=21&&<55)
                   Senior(>55)

 3. Create a method named eligibleToVote that takes two arguments:
      - age(int)
      -isAmerican(boolean)
      Then method should determine if the person is eligible to vote
      Ex:
         eligibleToVote(23,true)
         output:
                You are eligible to vote
 */