import java.io.*;

class Display
{
    public int DiffDigit(int iNo)
    {
        int iDigit = 0;
        int iSum1 = 0, iSum2 = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2 ) == 0)
            {
                iSum1 = iSum1 + iDigit;
            }
            else
            {
                iSum2 = iSum2 + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum1 - iSum2;
    }
}
class program079
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        int iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.DiffDigit(iValue);

       System.out.println(iRet);
    }
}