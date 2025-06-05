import java.io.*;

class Display
{
    public void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("HELLO");
        }
        else
        {
            System.out.println("DEMO");
        }
    }
}
class program045
{
    public static void main(String A[]) throws IOException
    {
        int iValue = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Display(iValue);

    }
}