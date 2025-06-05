import java.io.*;

class Display
{
    public int EvenFactorial(int iNo)
    {
        int iCnt = 0, iSum = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum * iCnt;
            }
        }
        return iSum;
    }
}

class program067
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        int iRet = dobj.EvenFactorial(iValue);

        System.out.println("Even Factorial is : "+iRet);

    }
}