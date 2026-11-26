//////////////////////////////////////////////////////////////////////////
//
// Function Name  : Display
// Input          : Void
// Output         : Void
// Description    : Displays Jay Ganesh four times using a loop
// Date           : 27/11/2026
// Author         : Suraj Navanath Naykude
//
//////////////////////////////////////////////////////////////////////////

class program55
{
  public static void main(String A[])
  {
    Iteration iteration = new Iteration();

    iteration.Display();
  }
}

class Iteration 
{
  public  void Display() 
  {
    int icnt=0;
    
    for(icnt = 1; icnt <= 4; icnt++)
    {
      System.out.println("jay ganesh..");
    }
  }

}
