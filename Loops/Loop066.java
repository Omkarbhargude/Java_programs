import java.io.*;

class Display
{
    public int  DollarToINR(int iNo)
    {
        int Dollar = 70;
        int iConv = iNo * Dollar;
        return iConv;
    }
}

class program066
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        int iRet = dobj.DollarToINR(iValue);

        System.out.println("Value in INR is : "+iRet);

    }
}