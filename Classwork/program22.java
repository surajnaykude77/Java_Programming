//////////////////////////////////////////////////////////////////////////
//
// Program Name   : program22.java
// Description    : display string
// Input          : String
// Output         : String
// Author         : Suraj Navanath Naykude
// Date           : 03/11/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program22
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String sName = scanner.nextLine();

        System.out.println("Welcome "+sName);
    }
}