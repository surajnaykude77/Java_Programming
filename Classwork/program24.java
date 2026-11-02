//////////////////////////////////////////////////////////////////////////
//
// Program Name   : program24.java
// Description    :print the single word from user using next() method
// Input          : String
// Output         : String
// Author         : Suraj Navanath Naykude
// Date           : 03/11/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class program24
{
    public static void main(String A[])
    {
        Scanner scanner = null;             
        String sName = null;

        scanner =new Scanner(System.in);

        System.out.println("Enter your name:");
         sName = scanner.next();                    // next() method is used to read single word from user
            //   we use next.Line() method to read complete line from user

        System.out.println("Welcome "+sName);
    }
}