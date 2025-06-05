import java.io.*;

class Display
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum =  iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program029
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        boolean bRet = false;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+ " is a perfect number");
        }
        else
        {
            System.out.println(iValue+ " is not perfect number");
        }

    }
}