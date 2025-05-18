import java.util.*;

class Display
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=( iNo / 2) ; iCnt++)  //time complexity is N/2 so loop will iterate half of the given number
        {
            if((iNo % iCnt == 0))
            {
                iSum = iSum + iCnt;  // Addition of factors logic
            }
        }
        return iSum;
    }
}
class program29
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number :");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        iRet = dobj.SumFactors(iValue);

        System.out.println("Addition of factors is :"+iRet);

    }
}

//Time complexity is O(N\2)