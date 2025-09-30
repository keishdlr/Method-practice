package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        System.out.println(isEven(5));

    }

    public static boolean isEven (int number){
        // returns true if even
        if (number % 2 == 0){ // Use modulus to determine even or odd
            System.out.println(number + " Is Even");
            return true;
        }
        else { // returns false if odd
            System.out.println(number + " Is Odd");
            return (false);
        }

        // same logic with less code
        // return number % 2 == 0;
    }

    public static boolean isPossitive(double number) {

        if (number > 0){
            return true;
        }
        else {
            return false;
        }
        // less verbose
        //return > 0;
    }
}
