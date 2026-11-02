//////////////////////////////////////////////////////////////////////////
//
// Program Name   : program28.java
// Description    : Accepts string input from user until user press enter
// Input          : String , Integer, Float
// Output         : String , Integer, Float
// Author         : Suraj Navanath Naykude
// Date           : 03/11/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program28
{
    public static void main(String A[])
    {
        Scanner scanner = null;            
        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;             

        scanner =new Scanner(System.in);

        System.out.println("Enter your name:");
         sName = scanner.next();                    /* Exception in thread "main" java.util.InputMismatchException
         because next() method only accept single word if user enter space then next scanner start taking input */

         System.out.println("Enter your age:");
         iAge = scanner.nextInt();

         System.out.println("Enter yours marks");
         fMarks = scanner.nextFloat();

        System.out.println("Welcome "+sName);
        System.out.println(("Your age is :"+ iAge));
        System.out.println(("Your marks is :"+ fMarks));
    }
}