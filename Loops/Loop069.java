import java.io.*;

class Display
{
    public int DiffFactorial(int iNo)
    {
        int iCnt = 0, iSum1 = 1, iSum2 = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2 ) == 0)
            {
                iSum1 = iSum1 * iCnt;
            }
            else
            {
                iSum2 = iSum2 * iCnt;
            }
        }
        return iSum1 - iSum2;
    }
}

class program069
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        int iRet = dobj.DiffFactorial(iValue);

        System.out.println("Diff Factorial is : "+iRet);

    }
}