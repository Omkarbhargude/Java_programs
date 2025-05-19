import java.util.*;

class Display
{
    public Long Factorial(int iNo)
    {
        int iCnt = 0;
        Long iFact = 1L;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        for(iCnt = iNo; iCnt >= 1; iCnt--) // -- is important for decrement of number 
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}
class program_23
{
    public static void main(String A[])
    {
        int iValue = 0;
        Long iRet = 0L;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        iRet = dobj.Factorial(iValue);

        System.out.println("The Factorial is "+iRet);
    }
}
