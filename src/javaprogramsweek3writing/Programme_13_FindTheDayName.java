package javaprogramsweek3writing;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 up to 7 and print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7: ");
        int day = scan.nextInt();
        findTheDaysName(day);
        //close scanner
        scan.close();
    }

    //Finding the name of the day
    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("A week has 7 days only.");
        }
    }
}
