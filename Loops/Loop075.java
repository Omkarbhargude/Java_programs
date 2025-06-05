import java.io.*;

class Display
{
    public int CountEven(int iNo)
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
            if((iDigit % 2) == 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}
class program075
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        int iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.CountEven(iValue);

       System.out.println(iRet);
    }
}