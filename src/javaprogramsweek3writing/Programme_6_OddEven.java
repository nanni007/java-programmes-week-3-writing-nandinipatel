package javaprogramsweek3writing;

import java.util.Scanner;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_OddEven {
    public static void main(String[] args) {
        //Scanner declaration for reading from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = scan.nextInt();
        Programme_6_OddEven oddEven = new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber (number) + " number ");
        //close scanner
        scan.close();
    }
//checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if (number %2 ==0){
            return "Even";
        }else {
            return "Odd";
        }
    }
}
