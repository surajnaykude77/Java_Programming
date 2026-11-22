
//Approach :- business logic in another class and called it from main method
//best approach for industrial application

//////////////////////////////////////////////////////////////////////////
//
// Program Name   : Addition of Two Numbers
// Description    : Created helper method in different class and called it from main method
// Input          : Two numbers
// Output         : Sum of the two numbers
// Author         : Suraj Navanath Naykude
// Date           : 11/10/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program39
{
    public static void main(String A[])
    {   
        Scanner scanner = null;
        Arithematic arithematic = null;  // refrence variable of class Arithematic

        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner =new Scanner(System.in);

        System.out.println("Enter first number");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number");
        iValue2 = scanner.nextInt();

         arithematic = new Arithematic();       // creating object of class Arithematic to call its method Addition

        iResult =arithematic.Addition(iValue1,iValue2);    

        System.out.println("Addition is:"+iResult);

    }

}
class Arithematic                     // main class on the top JVM find main class from top if its not find may cause exception
{
    public int Addition(int iNo1,int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

}