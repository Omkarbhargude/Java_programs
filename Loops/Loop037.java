import java.io.*;

class Digit
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0, iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;

    }
}
class program037
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0, iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Digit dobj = new Digit();

        iRet = dobj.SumDigit(iValue);

        System.out.println("Summation is : "+iRet);

    }
}