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
class program015
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        try
        {
          iValue = Integer.parseInt(bobj.readLine());
        }
        catch(Exception eobj)
        {
            System.out.println(+eobj);
        }

        Display dobj = new Display();

        iRet = dobj.Summation(iValue);

        System.out.println("Summation is : "+iRet);

    }
}