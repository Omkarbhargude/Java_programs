import java.util.*;

class Number
{
    public int SumFactors(int iNo)
    {
        int iCnt  = 0, iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
    
}
class program011
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Number aobj = new Number();

        iRet = aobj.SumFactors(iValue1);

        System.out.println("Summation of Factors are : "+iRet);
    }
}
