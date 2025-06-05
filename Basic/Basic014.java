import java.util.*;

class Number
{
    public void Sum(int iNo)
    {
        int iCnt  = 0, iSum1 = 0, iSum2 = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }

        System.out.println("Summation of Factors are : "+iSum1);
        System.out.println("Summation of non factors are : "+iSum2);
    }
    
}
class program014
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter a number : ");
        iValue1 = sobj.nextInt();

        Number aobj = new Number();

        aobj.Sum(iValue1);

    }
}
