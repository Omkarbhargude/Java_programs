import java.io.*;

class Display
{
    public void Show(int iNo)
    {
        int iCnt = 0;

        for(iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+ "\t");
        }
        System.out.println();
    }

}

class program058
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Frequency : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Show(iValue);
    }
}