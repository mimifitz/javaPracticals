package personalProject;

import java.util.Date;

import java.util.Arrays;

import java.awt.*;

public class learn {
    public static void main(String[] args) {
        // initializing variable with meaningfull variable names
        // byte age = 98; // short intergers
        // int davidSalary = 976_689_999; //
        // long viewsCount = 126_819_977_789_599L; // long integers
        // float price = 10.99F; //
        // char letter = 'A';
        // boolean isFemale = true;
        // Date today = new Date();
        // Primitives types for storing simple values

        // byte mimi = 45;
        // byte david = mimi;
        // mimi = 67;// reasssignng this doesn't affect david. davd will be 45. both
        // completely
        // //independent of each other

        // Reference type for complex values
        // Point point1 = new Point(x:1, y:1);
        // Point point2 = point1;
        // point1.x = 2;

        // both variables are pointing to the same values. they are referencing the same
        // vlaue.

        // System.out.println(point2); // sout to generate the snippet

        // Arrays
        int[] numbers = new int[5];// 5 is the length of items in the array. Pay attention name
        // of variable names: plu and sing.
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 3;

        System.out.println(Arrays.toString(numbers));
    }
}