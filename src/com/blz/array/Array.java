package com.blz.array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        System.out.println(" Welcome to array ");
        System.out.println("Enter the size of aray ");
        Scanner a =new Scanner(System.in);
        int size = a.nextInt();
        int ar[] = new int[size];

        System.out.println("Enter" +size+ "elements");


        for (int i=0; i<ar.length;i++ ){
            ar[i] = a.nextInt();
        }
        System.out.println("Entered values are");
        for(int b : ar)
        {
            System.out.println(b);
        }
    }
}
