import java.io.*;

class Display
{
    public boolean CheckZero(int iNo)
    {
        int iDigit = 0;
        boolean bFlag = false;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                bFlag = true;
                break;
            }
            iNo = iNo / 10;
        }
        return bFlag;
    }
}
class program071
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        boolean bRet = false;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckZero(iValue);

        if(bRet == true)
        {
            System.out.println("It contains Zero");
        }
        else
        {
            System.out.println("There is no Zero");
        }

    }
}