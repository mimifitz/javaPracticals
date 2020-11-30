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
        // int[] numbers = new int[5];// 5 is the length of items in the array. Pay
        // attention name
        // of variable names: plu and sing.
        // numbers[0] = 78;
        // numbers[1] = 25;
        // numbers[3] = 38;

        // System.out.println(Arrays.toString(numbers));

        // THE METHOD ABOVE IS OLD syntax OF DECLARING ARRAY

        // HERE IS THE NEW ONE
        // NOTE JAVA ARRRAYS have fix length. onvce created, it cannot be mutated

        // int[] numbers = { 34, 78, 90, 300, 180, 65, 98, };
        // System.out.println(numbers.length);
        // System.out.println(Arrays.toString(numbers));

        // two dimentional arrays
        // int[][] numbers = new int[2][3];
        // numbers[0][0] = 1;
        // // use deepToString for printing multi dimentional arrays
        // System.out.println(Arrays.deepToString(numbers));

        // curly braces syntax
        int[][] numbers = { { 3, 4, 5 }, { 3, 5 } };
        // use deepToString for printing multi dimentional arrays
        System.out.println(Arrays.deepToString(numbers));

    }
}