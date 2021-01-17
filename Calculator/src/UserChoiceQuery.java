import java.util.Scanner;

public class UserChoiceQuery {
    public static String greeting(){

            System.out.println("Enter: ");
            System.out.println("       'add' for addition");
            System.out.println("       'sub' for subtraction");
            System.out.println("       'mul' for multiplication");
            System.out.println("       'div' for division");
            Scanner operatorChoices = new Scanner(System.in);
            String userChoice = operatorChoices.nextLine();
            return userChoice;
    };


}
