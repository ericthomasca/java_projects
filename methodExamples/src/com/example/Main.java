package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //methodA
        System.out.print("MethodA - Enter a: ");
        Scanner input_a = new Scanner(System.in);
        int a = input_a.nextInt();
        System.out.print("MethodA - Enter x: ");
        Scanner input_x = new Scanner(System.in);
        int x = input_x.nextInt();
        int y = methodA(a,x);
        System.out.printf("MethodA - %d = %d %d(3) + 7",y,a,x);
        System.out.println();

        //methodB
        System.out.print("MethodB - Enter Array Size 1 - 9: ");
        Scanner input_b = new Scanner(System.in);
        int b = input_b.nextInt();
        if (b<1)
            b=1;
        if (b>9)
            b=9;
        methodB(b);

        //methodC
        System.out.print("MethodC - Enter Integer 1 - 100: ");
        Scanner input_c = new Scanner(System.in);
        int c = input_c.nextInt();
        methodC(c);

        //methodD
        System.out.print("MethodD - Enter Integer d: ");
        Scanner input_d = new Scanner(System.in);
        int d = input_d.nextInt();
        System.out.print("MethodD - Enter Integer e: ");
        Scanner input_e = new Scanner(System.in);
        int e = input_e.nextInt();
        methodD(d,e);

        //methodE
        methodE();
    }

    public static int methodA(int a, int x) {
        return a * x * x * x + 7;
    }

    public static void methodB(int b) {
        System.out.println("Method B Start");
        for (int i=0; i<b; i++) {
            String symbol;
            for (int j=0; j<b; j++) {
                if (i==j) {
                    symbol = "*";
                }
                else symbol = "-";
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Method B End");
    }

    public static void methodC(int c) {
        if (c % 2 == 0)
            System.out.printf("MethodC - Number %d is Even",c);
        else
            System.out.printf("MethodC - Number %d is Odd",c);
        System.out.println();
    }

    public static void methodD(int d, int e) {
       if  (d % e == 0)
           System.out.printf("MethodD - %d is a multiple of %d",d,e);
       else
           System.out.printf("MethodD - %d is not a multiple of %d",d,e);
       System.out.println();
    }

    public static void methodE() {
        int negative = 0, zero = 0, positive = 0;
        for (int i = 1; i<6; i++)
            System.out.println("MethodE - Enter number " + i + ": ");
            Scanner input_f = new Scanner(System.in);
            int f = input_f.nextInt();
            if (f<0)
                negative++;
            if (f == 0)
                zero++;
            if (f>0)
                positive++;
        System.out.printf("MethodE - Totals <0 : %d  = 0 : %d  > 0 : %d",negative,zero,positive);
    }
}
