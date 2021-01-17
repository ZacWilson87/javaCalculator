import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("----Console-Calculator-v1.0----");
        System.out.println("-------------------------------");
        System.out.println("----Please Choose an option----");
        System.out.println("Enter: ");
        String userChoices = UserChoiceQuery.greeting();
        int num1 = 0;
        int num2 = 0;
        int answer = 0;

        do {

            if (userChoices.equals("add")) {
                System.out.println("1st Number to add: ");
                Scanner addition = new Scanner(System.in);
                num1 = addition.nextInt();
                System.out.println("2nd Number to add: ");
                num2 = addition.nextInt();
                answer = Operations.addition(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + answer);
                UserChoiceQuery.greeting();
            } else if (userChoices.equals("sub")) {
                System.out.println("1st Number to subtract: ");
                Scanner subtract = new Scanner(System.in);
                num1 = subtract.nextInt();
                System.out.println("2nd Number to subtract: ");
                num2 = subtract.nextInt();
                answer = Operations.subtraction(num1,num2);
                System.out.println(num1 + " - " + num2 + " = " + answer);
                UserChoiceQuery.greeting();

            } else if (userChoices.equals("mul")) {
                System.out.println("1st Number to multiply: ");
                Scanner multiply = new Scanner(System.in);
                num1 = multiply.nextInt();
                System.out.println("2nd Number to multiply: ");
                num2 = multiply.nextInt();
                answer = Operations.multiplication(num1,num2);
                System.out.println(num1 + " * " + num2 + " = " + answer);
                UserChoiceQuery.greeting();

            } else if (userChoices.equals("div")) {
                System.out.println("1st Number to divide: ");
                Scanner divide = new Scanner(System.in);
                num1 = divide.nextInt();
                System.out.println("2nd Number to divide: ");
                num2 = divide.nextInt();
                answer = Operations.division(num1,num2);
                System.out.println(num1 + " / " + num2 + " = " + answer);
                UserChoiceQuery.greeting();


            }else {
                UserChoiceQuery.greeting();
            }


        }while (!(userChoices.equals("add")) || !(userChoices.equals("sub")) || !(userChoices.equals("mul")) || !(userChoices.equals("div")));

    }
}
