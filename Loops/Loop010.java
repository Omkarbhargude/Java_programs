//Iteration
import java.io.*;

class Display
{
    public boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program010
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        boolean bRet = false;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Even ");
        }
        else
        {
            System.out.println(iValue+" is not Even");
        }

    }
}
