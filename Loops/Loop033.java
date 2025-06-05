import java.io.*;

class Digit
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }

    }
}
class program033
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Digit dobj = new Digit();

        dobj.DisplayDigit(iValue);

    }
}