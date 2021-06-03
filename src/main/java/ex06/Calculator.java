package ex06;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;
import java.time.YearMonth;

public class Calculator {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Calculator app = new Calculator();
        int ageNow = app.inputCurrAge();
        int ageThen = app.inputRetireAge();
        int years = app.AmountYears(ageNow, ageThen);
        int currYear = app.getCurrentYear();
        int endYear = app.getEndYear(currYear, years);
        app.printOutput(years, currYear, endYear);
    }

    public int inputCurrAge(){
        System.out.print("What is your current age? ");
        String currAge = input.next();
        return Integer.parseInt(currAge);
    }

    public int inputRetireAge(){
        System.out.print("At what age would you like to retire? ");
        String retireAge = input.next();
        return Integer.parseInt(retireAge);
    }

    public int AmountYears(int ageNow, int ageThen){
        return ageThen - ageNow;
    }

    public int getCurrentYear(){
        return YearMonth.now().getYear();
    }

    public int getEndYear(int currYear, int years){
        return currYear + years;
    }

    public void printOutput(int years, int currYear, int endYear){
        System.out.println("You have " +years+ " years left until you can retire.");
        System.out.printf("It's %d, so you can retire in %d.", currYear, endYear);
    }

}
