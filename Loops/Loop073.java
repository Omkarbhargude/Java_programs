import java.io.*;

class Display
{
    public int CountFour(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 4)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}
class program073
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        int iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.CountFour(iValue);

       System.out.println(iRet);
    }
}