import java.io.*;

class Digit
{
    public int CountEvenDigit(int iNo)
    {
        int iDigit = 0, iCnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;

    }
}
class program036
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0, iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Digit dobj = new Digit();

        iRet = dobj.CountEvenDigit(iValue);

        System.out.println("Even digits are : "+iRet);

    }
}