import java.io.*;

class Display
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'A'; iCnt <= iNo; iCnt++,ch++)
        {
            System.out.print(ch+"\t");
        } 
        System.out.println();
    }
}
class pattern040
{
    public static void main(String A[])throws IOException
    {
        int iValue = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number : ");
        iValue = Integer.parseInt(bobj.readLine());

        Display dobj = new Display();

        dobj.Display(iValue);
    }
}