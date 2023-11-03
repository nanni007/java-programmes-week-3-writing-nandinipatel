package javaprogramsweek3writing;

import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner Declaration to print input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scan.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        scan.close();
    }

    //checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println("The year " + year + " is a Leap Year.");
            return;
        }
        System.out.println("The year " + year + " is not a Leap Year.");
    }
}
