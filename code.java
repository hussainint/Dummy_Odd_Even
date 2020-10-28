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
   // condition starts here
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
        else if(k == 6)
        System.out.println("It is Even");
        else if(k == 7)
        System.out.println("It is Odd");

        sc.close();

     }
 }