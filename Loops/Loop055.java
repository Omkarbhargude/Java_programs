import java.io.*;

class Display
{
    public int FactDiff(int iNo)
    {
        int iCnt = 0, iSum1 = 0, iSum2 = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2  = iSum2 + iCnt;
            }
        }
        return iSum1 - iSum2;
    }
}
class program055
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0, iRet = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.FactDiff(iValue);

        System.out.println("Difference of Sum factors and non Factors are : "+iRet);

    }
        
}