import java.io.*;

class Display
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 2; iCnt <= (iNo / 2)  ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                break;
            }
        }
        return (iCnt > (iNo /2));
     }
}

class program031
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        boolean bRet = false;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckPrime(iValue);

        if(bRet == false)
        {
            System.out.println(iValue+ " is not prime number");
        }
        else
        {
            System.out.println(iValue+ " is prime number");
        }

    }
}