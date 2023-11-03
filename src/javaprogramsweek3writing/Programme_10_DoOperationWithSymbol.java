package javaprogramsweek3writing;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int y = scan.nextInt();
        System.out.println("Select the calculation symbol +, -, *, /");
        char symbol = scan.next().charAt(0);
        doOperationBySelectingSymbol(x,y, symbol);
        //close scanner
        scan. close();
    }
    //calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol){
        if(symbol=='+'){
            System.out.println(x + " + " + y + " = " + (x+y));
        }else if (symbol=='-'){
            System.out.println(x + " - " + y + " = " + (x-y));
        }else if (symbol=='*'){
            System.out.println(x + " * " + y + " = " + (x*y));
        }else if (symbol=='/'){
            System.out.println(x + " / " + y + " = " + (x/y));
        }else {
            System.out.println("Invalid Input. Enter Correct symbol +, -, *, /");
        }
    }
}
