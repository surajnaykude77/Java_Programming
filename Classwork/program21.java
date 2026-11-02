//////////////////////////////////////////////////////////////////////////
//
// Program Name   : program21.java
// Description    : display string input from user using nextline() method
// Input          : String
// Output         : String
// Author         : Suraj Navanath Naykude
// Date           : 03/11/2026
//
//////////////////////////////////////////////////////////////////////////

import java.util.*;

class program21
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String Name = sobj.nextLine();

        System.out.println("Welcome "+Name);
    }
}