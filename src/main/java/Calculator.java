import java.util.Scanner;
import java.time.YearMonth;


public class Calculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String currAge = input.next();
        int age1 = Integer.parseInt(currAge);

        System.out.print("At what age would you like to retire? ");
        Scanner input2 = new Scanner(System.in);
        String retireAge = input2.next();
        int age2 = Integer.parseInt(retireAge);

        int years = age2 - age1;
        int currYear = YearMonth.now().getYear();
        int endYear = currYear + years;
        System.out.printf("You have %d years left until you can retire.\n", years);
        System.out.printf("It's %d, so you can retire in %d.", currYear, endYear);
    }
}
