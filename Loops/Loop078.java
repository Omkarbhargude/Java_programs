import java.io.*;

class Display
{
    public int MultDigit(int iNo)
    {
        int iDigit = 0;
        int iMult = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }
        return iMult;
    }
}
class program078
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        int iRet = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        iRet = dobj.MultDigit(iValue);

       System.out.println(iRet);
    }
}