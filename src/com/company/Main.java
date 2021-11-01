package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Basic Java Programs");

        System.out.println("1 - Area of circle");
        System.out.println("2 - Area of Triangle");
        System.out.println("3 - Area of Rectangle Program");
        System.out.println("4 - Area of Isosceles Triangle");
        System.out.println("5 - Area of Parallelogram");
        System.out.println("6 - Area of Rhombus");
        System.out.println("7 - Area of Equilateral Triangle");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Operation number to perform the appropriate task: ");
        int bjp = in.nextInt();

        switch (bjp) {
            case 1:
                System.out.println("Area of circle:-");
                double Pi = 3.14;
                Scanner myRadii = new Scanner(System.in);
                System.out.print("Enter r: ");
                double r = myRadii.nextDouble();

                System.out.println("Area of your Triangle is = " + (Pi * r * r));
                break;

            case 2:
                System.out.println("Area of Triangle:-");

                Scanner triHeight = new Scanner(System.in);
                System.out.print("Enter h: ");
                double h = triHeight.nextDouble();
                Scanner triBase = new Scanner(System.in);
                System.out.print("Enter b: ");
                double b = triBase.nextDouble();

                System.out.println("Area of your Triangle is = " + (h*b/2));
                break;

            case 3:
                System.out.println("Area of Rectangle:-");

                Scanner rectHeight = new Scanner(System.in);
                System.out.print("Enter h: ");
                double H = rectHeight.nextDouble();
                Scanner rectBase = new Scanner(System.in);
                System.out.print("Enter b: ");
                double B = rectBase.nextDouble();

                System.out.println("Area of your Rectangle is = " + (H*B));
                break;

            case 4:
                System.out.println("Area of Isoscles Triangle:-");

                Scanner IsoHeight = new Scanner(System.in);
                System.out.print("Enter h: ");
                double ih = IsoHeight.nextDouble();
                Scanner IsoBase = new Scanner(System.in);
                System.out.print("Enter b: ");
                double ib= IsoBase.nextDouble();

                System.out.println("Area of your Triangle is = " + (ih*ib/2));
                break;

            case 5:
                System.out.println("Area of parallelogram:-");

                Scanner parHeight = new Scanner(System.in);
                System.out.print("Enter h: ");
                double pH = parHeight.nextDouble();
                Scanner parBase = new Scanner(System.in);
                System.out.print("Enter b: ");
                double pB = parBase.nextDouble();

                System.out.println("Area of your Rectangle is = " + (pH*pB));
                break;

            case 6:
                System.out.println("Area of Rhombus:-");

                Scanner diag1 = new Scanner(System.in);
                System.out.print("Enter d1: ");
                double d1 = diag1.nextDouble();
                Scanner diag2 = new Scanner(System.in);
                System.out.print("Enter d2: ");
                double d2 = diag2.nextDouble();

                System.out.println("Area of your Rhombus is = " + (d1*d2/2));
                break;

            case 7:
                System.out.println("Area of Equilateral Triangle:-");

                Scanner side = new Scanner(System.in);
                System.out.print("Enter h: ");
                double a = side.nextDouble();

                System.out.println("Area of your Triangle is = " + (3/4*a*a));
                break;

            default:
                System.out.println("Input unrecognised.");

        }
    }
}
