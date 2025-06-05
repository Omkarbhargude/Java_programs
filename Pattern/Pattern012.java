import java.io.*;

class Pattern
{
    public void Display(int iNo, char ch)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++) //2N
        {
            System.out.print(ch+ "\t"); 
        }
        System.out.println();
    }
}
class pattern012
{
    public static void main(String A[])throws IOException
    {
        int iValue  = 0;
        char cValue = '\0';
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Frequency : ");
        iValue = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Character : ");
        cValue = (char)bobj.read();

        Pattern pobj = new Pattern();

        pobj.Display(iValue,cValue);
    }

}