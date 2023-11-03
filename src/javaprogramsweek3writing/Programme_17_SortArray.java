package javaprogramsweek3writing;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray = {
                1789, 2034, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //string array declaration
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual numerical Array was: " + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : " + Arrays.toString(strArray));
    }
}
