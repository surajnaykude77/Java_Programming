//////////////////////////////////////////////////////////////////////////
//
// Program Name   : program27.java
// Description    : Display Name, Age, Marks
// Input          : String, int, float
// Output         : String, int, float
// Author         : Suraj Navanath Naykude
// Date           : 03/11/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program27
{
    public static void main(String A[])
    {
        Scanner scanner = null;     //refrence
        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;

        scanner =new Scanner(System.in);

        System.out.println("Enter your name:");
        sName = scanner.next();

        System.out.println("Enter your age:");
        iAge = scanner.nextInt();

        System.out.println("Enter yours marks");
        fMarks = scanner.nextFloat();

        System.out.println("Welcome "+sName);
        System.out.println(("Your age is :"+ iAge));
        System.out.println(("Your marks is :"+ fMarks));
    }
}