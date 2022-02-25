package com.blz.array;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        System.out.println(" Welcome to array ");
        System.out.println("Enter the size of arrray ");
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.println("Enter 5 elements");


        for (int i=0; i<ar.length;i++ ){
            ar[i] = sc.nextInt();
        }
        System.out.println("Entered values are");
        for (int i=0;i<ar.length;i++ )
        {
            System.out.println(ar[i]);
        }
    }
}
