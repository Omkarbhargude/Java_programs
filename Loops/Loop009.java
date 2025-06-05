//Iteration
import java.io.*;

class Display
{
    public int Summation(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;
    }
}

class program009
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0, iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value : ");
        iValue = Integer.parseInt(bobj.readLine());

        Summation sobj = new Summation();

        iRet = sobj.Summation(iValue);

        System.out.println("The Summation is : "+iRet);
    }
}
