import java.io.*;

class Display
{
    public int Factorial(int iNo)
    {
        int iCnt = 0, iSum = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum * iCnt;
        }
        return iSum;
    }
}

class program062
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        int iRet = dobj.Factorial(iValue);

        System.out.println("Factorial is : "+iRet);
    }
}