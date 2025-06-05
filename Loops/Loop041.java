import java.io.*;

class Display
{
    public boolean CheckDivisible(int iNo)
    {
        boolean bFlag = false;

        if((iNo % 5) == 0)
        {
            bFlag = true;
        }
        return bFlag;
    }
}
class program041
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0;
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckDivisible(iValue);

        if(bRet == true)
        {
            System.out.println("It is divisible by 5 ");
        }
        else
        {
            System.out.println("It is not divisible by 5 ");
        }

    }
}