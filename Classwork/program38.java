
//Approach :- business logic in another class and called it from main class
//best approach for industrial application

//////////////////////////////////////////////////////////////////////////
//
// Program Name   : Addition of Two Numbers
// Description    : Created helper method in different class and called it from main method
//                  healper method is static so we can call it from main method without creating object of class
// Input          : Two numbers
// Output         : Sum of the two numbers
// Author         : Suraj Navanath Naykude
// Date           : 11/10/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program38 {

    public static void main(String A[]) {

        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number");
        iValue2 = scanner.nextInt();

        iResult = Arithematic.Addition(iValue1, iValue2);

        System.out.println("Addition is:" + iResult);

    }

}

class Arithematic {
    public static int Addition(int iNo1, int iNo2) // static method because we are calling it from main method without
                                                   // creating object of class
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

}