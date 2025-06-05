import java.io.*;

class Display
{
    public boolean CheckEven(int iNo)
    {
        boolean bFlag = false;

        if((iNo % 2) == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}
class program047
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+ " is Even ");
        }
        else
        {
            System.out.println(iValue+ " is Odd");
        }

    }
}