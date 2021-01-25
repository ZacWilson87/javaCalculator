import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-------------------------------");
        System.out.println("----Console-Calculator-v1.0----");
        System.out.println("-------------------------------");
        System.out.println("----Please Choose an option----");
        String userChoice;
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        boolean run = true;
        String regex = "^-?\\d+$";

        do {
            userChoice = UserChoiceQuery.greeting();
            userChoice = userChoice.toLowerCase();

            if (userChoice.equals("add")) {
                System.out.print("1st Number to add: ");
                Scanner addition = new Scanner(System.in);
                if(addition.hasNextInt()) {
                    num1 = addition.nextInt();
                    System.out.print("2nd Number to add: ");
                    num2 = addition.nextInt();
                    answer = Operations.addition(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + answer);
                    TimeUnit.MILLISECONDS.sleep(800);

                }else {
                    System.out.println("this calculator only take numbers...Resetting");
                    TimeUnit.MILLISECONDS.sleep(800);
                }

            } else if (userChoice.equals("sub")) {
                System.out.println("1st Number to subtract: ");
                Scanner subtract = new Scanner(System.in);
                if(subtract.hasNextInt()) {
                    num1 = subtract.nextInt();
                    System.out.println("2nd Number to subtract: ");
                    num2 = subtract.nextInt();
                    answer = Operations.subtraction(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + answer);
                    TimeUnit.MILLISECONDS.sleep(800);

                }else {
                    System.out.println("this calculator only take numbers...Resetting");
                    TimeUnit.MILLISECONDS.sleep(800);
                }

            } else if (userChoice.equals("mul")) {
                System.out.println("1st Number to multiply: ");
                Scanner multiply = new Scanner(System.in);
                if(multiply.hasNextInt()) {
                    num1 = multiply.nextInt();
                    System.out.println("2nd Number to multiply: ");
                    num2 = multiply.nextInt();
                    answer = Operations.multiplication(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + answer);
                    TimeUnit.MILLISECONDS.sleep(800);
                }else {
                    System.out.println("this calculator only take numbers...Resetting");
                    TimeUnit.MILLISECONDS.sleep(800);
                }

            } else if(userChoice.equals("div")) {
                System.out.println("1st Number to divide: ");
                Scanner divide = new Scanner(System.in);
                if(divide.hasNextInt()) {
                    num1 = divide.nextInt();
                    System.out.println("2nd Number to divide: ");
                    num2 = divide.nextInt();
                    answer = Operations.division(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + answer);
                }else {
                    System.out.println("this calculator only take numbers...Resetting");
                    TimeUnit.MILLISECONDS.sleep(800);
                }

            }else if(userChoice.equals("exit")){
                break;
            }
            else{
                System.out.println("invalid entry");
                TimeUnit.MILLISECONDS.sleep(800);
            }

        } while (run);

    }

}
