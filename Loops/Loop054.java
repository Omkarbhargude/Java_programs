import java.io.*;

class Display
{
    public int SumNonFactor(int iNo)
    {
        int iCnt = 0, iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}
class program054
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0, iRet = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.SumNonFactor(iValue);

        System.out.println("Summation of Non Factors are : "+iRet);

    }
        
}