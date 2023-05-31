package Areaandperimeter;

import java.util.Scanner;

public class binarynumbers {
    public static void main(String[] args) {
       // int inputfirstbinarynumber=10;
        //int inputsecondbinarynumber=11;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Binary number :");

        String x=sc.next();
        System.out.println("Enter 2nd Binary number :");
        String y=sc.next();

 int n1=Integer.parseInt(x,2);
 int n2=Integer.parseInt(y,2);
 int n3=n1+n2;
        System.out.println("n1 :"+ Integer.toBinaryString(n1));
        System.out.println("n2 :"+ Integer.toBinaryString(n2));
        System.out.println("the sum of two binary number is :" + Integer.toBinaryString(n3));
    }
    }
