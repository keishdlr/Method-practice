package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        System.out.println(isEven(5));

    }

    public static boolean isEven (int number){

        if (number % 2 == 0){ // Use modulus to determine even or ordd
            System.out.println(number + " Is Even");
            return true;
        }
        else {
            System.out.println(number + " Is Odd");
            return (false);
        }
    }

    public static boolean isPossitive(double number) {

        return true;

    }
}
