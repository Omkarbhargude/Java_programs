import java.util.*;

class Number
{
    public int SumNonFactors(int iNo)
    {
        int iCnt  = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
    
}
class program013
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Number aobj = new Number();

        iRet = aobj.SumNonFactors(iValue1);

        System.out.println("Summation of non factors are : "+iRet);

    }
}
