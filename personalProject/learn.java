package personalProject;

import java.util.Date;

import sun.tools.jconsole.MaximizableInternalFrame;

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
        // int[][] numbers = { { 3, 4, 5 }, { 3, 5 } };
        // // use deepToString for printing multi dimentional arrays
        // System.out.println(Arrays.deepToString(numbers));

        // int[][] ages = { { 6, 8, 7 }, { 8, 3, 8 } };
        // System.out.println(Arrays.deepToString(ages));

        // Constant (final unmutable)
        // final float pi = 3.78F //pi is use to calculate the area of a circle

        // Arithmetic expression(+,-,%,/)

        // int result = 17 / 5; // This will print 3 as a whole number without the
        // remainder
        // to get the floating number, you need to convert the variable to FLOAT OR
        // DOUBLE

        // float result = (float) 17 / (float) 5;
        // System.out.println(result);

        // int acc = 2;
        // ++acc;
        // System.out.println(acc);

        // int acc = 2;
        // int f = acc++;// postfix of++ gives 2 and prefix prints 3;
        // System.out.println(f);

        // ORDER OF OPERATION

        // int x = 10 + 3 * 2; // THis will print 16, NOT 26 because MULTIPLICATION
        // // have a higher priority so regardless of how it is wriitten, * will be
        // // calculated first
        // int x = (10 + 3) * 2; // you want to change the order, you must wrap + in
        // //parenthesis and the code above with print 26.
        // System.out.println(x);

        // CASTING

        // implicit casting byte->short->int->long
        // short x = 1; // two byte
        // int y = x + 2;// four bytes

        // byte->short->int->long->float->double
        // double x = 1.1; //1.1 two byte
        // double y = x + 2;//2.0 four bytes
        // this will print 3.1

        // explicit casting byte->short->int->long->float->double
        // double x = 1.1; // two byte
        // int y = (int) x + 2;// considered as 2 four bytes
        // System.out.println(y);

        // CONVERTING STRING TO INT
        // String x = "8";
        // int y = Integer.parseInt(x) + 2;
        // System.out.println(y);

        // CONVERTING STRING TO INT
        // String e = "8.1";
        // double f = Double.parseDouble(e) + 2;
        // System.out.println(f);

        // MATHS METHODS

        // Math.floor()the largest integer that is smaller or equal to a given number
        // int result = (int) Math.floor(4.9);
        // System.out.println(result);

        // Math.min/Max() returning the min or max number
        // int result = Math.min(2, 3);
        // System.out.println(result);

        // Math.random generating random value
        // double result = Math.random();
        // System.out.println(result);

        // EXAMPLE 2( gives random numbers between 0-100)
        // double result = Math.random() * 100;
        // System.out.println(result);

        // example 3. Results in whole numbers between 0-100
        // int result = (int) Math.round(Math.random() * 100);
        // System.out.println(result);

        // example 4. Results in whole numbers between 0-100 with using Math.round
        // int result = (int) (Math.random() * 100);
        // System.out.println(result);

        // Math.ceil() returns the smallest interger that is greater or equal to the
        // given number
        // int result = (int) Math.ceil(3.8F);
        // System.out.println(result);

        // Math.round can round a floating point number to a WWOLE number
        // int x = Math.round(1.5F); //Prints 2 round the number to the nearest whole
        // number
        // System.out.println(x);

    }
}