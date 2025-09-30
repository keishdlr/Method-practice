package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        String last = "De La Rosa"; // Variable for last name
        String first = "Keisha"; // Variable for first name

        String fullName = formatName(first, last);   // Call the method
        System.out.println(fullName); // Print full name

        // less verbose
        //System.out.println(formatName("Keisha", "De La Rosa"));

    }

    public static String formatName(String first, String last) {

        return (last + "," + first);
    }
}
