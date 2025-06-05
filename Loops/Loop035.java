import java.io.*;

class Digit
{
    public int CountDigit(int iNo)
    {
        int iDigit = 0, iCnt = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;

    }
}
class program035
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0, iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Digit dobj = new Digit();

        iRet = dobj.CountDigit(iValue);

        System.out.println(iRet);

    }
}