//////////////////////////////////////////////////////////////////////////
//
// Function Name  : Display
// Input          : Integer
// Output         : Void
// Description    : Accepts a frequency and displays Jay Ganesh that many times
// Date           : 27/11/2026
// Author         : Suraj Navanath Naykude
//
//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class program57
{
  public static void main(String A[])
  {
    Scanner scanner = new Scanner(System.in);

    int iValue = 0;

    Iteration iteration = new Iteration();

    System.out.println("Enter the frequency:");
    iValue=scanner.nextInt();

    iteration.Display(iValue);
  }
}

class Iteration 
{
  public  void Display(int iNo) 
  {
    int icnt=0;
    
    for(icnt = 1; icnt <= iNo; icnt++)
    {
      System.out.println("jay ganesh..");
    }
  }

}
