 package Dummy_Odd_Even;

import java.util.Scanner;

/**
  * code
  */
 public class code {
 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number to check for odd even Range(1-5)");
        int k= sc.nextInt();
   
        if(k == 1)
        System.out.println("It is Odd");
       else if(k == 2)
        System.out.println("It is even");
        else if(k == 3)
        System.out.println("It is Odd");
        else if(k == 4)
        System.out.println("It is even");
        else if(k == 5)
        System.out.println("It is Odd");

        //condition till number 5
        
        sc.close();

     }
 }