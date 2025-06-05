//Iteration
import java.io.*;

class Display
{
    public boolean CheckDivisible(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program013
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        boolean bRet = false;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        bRet = dobj.CheckDivisible(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Divisible by 5 ");
        }
        else
        {
            System.out.println(iValue+" is not Divisible by 5");
        }

    }
}
