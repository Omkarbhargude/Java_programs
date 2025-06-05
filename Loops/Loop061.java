import java.io.*;

class Display
{
    public void Number(int iNo)
    {
        if(iNo <= 50)
        {
            System.out.println("--SMALL--");
        }
        else if((iNo > 50) && (iNo <= 100))
        {
            System.out.println("--MEDIUM--");
        }
        else if(iNo > 100)
        {
            System.out.println("--LARGE--");
        }
    }
}

class program061
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Number(iValue);
    }
}