import java.util.*;

class Display
{
    public Long Factorial(Long iNo)
    {
        int iCnt = 0;
        Long iFact = 1L;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}
class program21
{
    public static void main(String A[])
    {
        Long iValue = 0L;
        Long iRet = 0L;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue = sobj.nextLong();

        Display dobj = new Display();

        iRet = dobj.Factorial(iValue);

        System.out.println("The Factorial is "+iRet);
    }
}