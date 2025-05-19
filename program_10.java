import java.util.*;

class Display
{
    public int CountSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;
    }
}
class program_10
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequency :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        iRet = dobj.CountSum(iValue);

        System.out.println("The Summetion is "+iRet);

    }
}
