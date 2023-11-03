package javaprogramsweek3writing;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //scanner declaration for reading from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter alphabet between A to F:");
        String city = scan.next().toUpperCase();
        //create object and call instance method
        Programme_9_PrintCityNameWithSwitch obj = new Programme_9_PrintCityNameWithSwitch();
        obj.printCityName(city);
        //close scanner
        scan.close();
    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("Invalid Input. Enter Alphabet between A to F.");
        }
    }
}
