//////////////////////////////////////////////////////////////////////////
//
// Program Name   : program23.java
// Description    : Create Reference for Scanner and String
// Input          : String
// Output         : String
// Author         : Suraj Navanath Naykude
// Date           : 03/11/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program23
{
    public static void main(String A[])
    {
        Scanner scanner = null;             //Scanner reference
        String sName = null;                // String reference

        scanner =new Scanner(System.in);

        System.out.println("Enter your name:");
        sName = scanner.nextLine();

        System.out.println("Welcome "+sName);
    }

}