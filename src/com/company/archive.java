package com.company;

import java.util.*;

public class archive {
    public static void main(String[] args) {

        /*
        // Rupee to Dollar converter

        final double dr = 73.58;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in rupes: ");

        double R = input.nextFloat();
        double cnvrt = R*dr;
        System.out.println("Amount in dollars: " + cnvrt);

         */

        /*
        // Calculator Program

        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {

            System.out.println("Enter your operation ::");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter your 2 numbers ::");
                int p2 = input.nextInt();
                int p1 = input.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = p1 + p2;
                }
                if (op == '-') {
                    ans = p1 - p2;
                }
                if (op == '*') {
                    ans = p1 * p2;
                }
                if (op == '/') {
                    if (p2 != 0)
                        ans = p1 / p2;
                }
                if (op == '%') {
                    ans = p1 % p2;
                }
            }
            else if (op == 'x' || op == 'X' )
                break;
            else
                System.out.println("invalid");

            System.out.println(ans);
        }

         */



       /*
            System.out.println("please input Principal amount: ");

            Scanner input = new Scanner(System.in);
            int p = input.nextInt();

            System.out.println("please input Rate: ");
            int r = input.nextInt();

            System.out.println("please input Tenure: ");
            int t = input.nextInt();

            int SI = (p*r*t)/100;

            System.out.println("Simple interest after calculation comes out to be: " + SI);
        */


        /*
                String name;
        System.out.println("What's your name? ::");

        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        System.out.println("Good Morning " + name + "!!");
        System.out.println("How was your day?");

        Scanner talking = new Scanner(System.in);
        String talk = talking.nextLine();
        System.out.println("good to hear that! Have a great day");
         */

        /*
// Odd or Even check:-
            int num;
            System.out.println("Enter a number :: ");

            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if(2 % num == 0)
                System.out.println("Your input is Even");
            else
                System.out.println("Your input is Odd");
         */


        /*
                System.out.println("Enter Your Character ::");

                Scanner sc = new Scanner(System.in);

                char ch = sc.next().charAt(0);

                int asciiValue = ch;
                System.out.println("ASCII value is :: " + asciiValue);
         */


/*

WORKING:-
        // character whose ASCII value to be found
        char ch1 = 'a';
        char ch2 = 'b';
// variable that stores the integer value of the character
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
*/
        /*
        System.out.print("Enter a character: ");
Scanner sc = new Scanner(System.in);
char chr = sc.next().charAt(0);
int asciiValue = chr;
System.out.println("ASCII value of " +chr+ " is: "+asciiValue);
        */

        /*
         System.out.println("Enter Your Character ::");

         Scanner sc = new Scanner(System.in);

         char ch = sc.next().charAt(0);

         int asciiValue = ch;
         System.out.println("ASCII value is :: " + asciiValue)
         */

        //        System.out.println("size of char: " + ((Character.SIZE/8)) + " byte");
//
//        System.out.println("size of int: " + ((Integer.SIZE/8)) + " bytes");
//
//        System.out.println("size of double: " + ((Double.SIZE/8)) + " bytes");
//
//        System.out.println("size of float: " + ((Float.SIZE/8)) + " bytes");

        //Print Hello, World!
        /*
        System.out.println("Hello, World!");
        */

//      number swapping
/*      int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("InPut value x & y: ");

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before swapping numbers " + x + " " + y);

        z = x;
        x = y;
        y = z;

        System.out.println("After Swapping " + x + " " + y);
        System.out.println();
*/


//      decimal multiplicatiopn
/*      Scanner decimal = new Scanner(System.in);
        System.out.println("Input value of X & Y:");

        float x = decimal.nextFloat();
        float y = decimal.nextFloat();
        float multiply = x * y;
        System.out.println(multiply);
*/
        /*
        System.out.println("8 - Perimeter Of Circle");
        System.out.println("9 - Perimeter Of Equilateral Triangle");
        System.out.println("10 - Perimeter Of Parallelogram");
        System.out.println("11 - Perimeter Of Rectangle");
        System.out.println("12 - Perimeter Of Square");
        System.out.println("13 - Perimeter Of Rhombus");
        System.out.println("14 - Volume Of Cone Java Program");
        System.out.println("15 - Volume Of Prism");
        System.out.println("16 - Volume Of Cylinder");
        System.out.println("17 - Volume Of Sphere");
        System.out.println("18 - Volume Of Pyramid");
        System.out.println("19 - Curved Surface Area Of Cylinder");
        System.out.println("20 - Total Surface Area Of Cube");
*/
    }
}
