import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("----Console-Calculator-v1.0----");
        System.out.println("-------------------------------");
        System.out.println("----Please Choose an option----");
        System.out.println("Enter: ");
        System.out.println("       'add' for addition");
        System.out.println("       'sub' for subtraction");
        System.out.println("       'mul' for multiplication");
        System.out.println("       'div' for division");
        Scanner operatorChoices = new Scanner(System.in);
        String userChoice = operatorChoices.nextLine();
        int num1 = 0;
        int num2 = 0;
        int answer = 0;

        do {

            if (userChoice.equals("add")) {
                System.out.println("1st Number to add: ");
                Scanner addition = new Scanner(System.in);
                num1 = addition.nextInt();
                System.out.println("2nd Number to add: ");
                num2 = addition.nextInt();
                answer = Operations.addition(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + answer);
                UserChoiceQuery.greeting();
                continue;
            } else if (userChoice.equals("sub")) {
                System.out.println("1st Number to subtract: ");
                Scanner subtract = new Scanner(System.in);
                num1 = subtract.nextInt();
                System.out.println("2nd Number to subtract: ");
                num2 = subtract.nextInt();
                answer = Operations.subtraction(num1,num2);
                System.out.println(num1 + " - " + num2 + " = " + answer);
                UserChoiceQuery.greeting();

            } else if (userChoice.equals("mul")) {
                System.out.println("1st Number to multiply: ");
                Scanner multiply = new Scanner(System.in);
                num1 = multiply.nextInt();
                System.out.println("2nd Number to multiply: ");
                num2 = multiply.nextInt();
                answer = Operations.multiplication(num1,num2);
                System.out.println(num1 + " * " + num2 + " = " + answer);
                UserChoiceQuery.greeting();

            } else if (userChoice.equals("div")) {
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


        }while (!(userChoice.equals("add")) || !(userChoice.equals("sub")) || !(userChoice.equals("mul")) || !(userChoice.equals("div")));

    }
}
