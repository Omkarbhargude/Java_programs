import java.util.*;

class Display
{
    public int Factorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            return -1;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}
class program19
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        iRet = dobj.Factorial(iValue);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
           System.out.println("The Factorial is "+iRet);
        }
    }
}