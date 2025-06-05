import java.io.*;

class Display
{
    public boolean CheckVowel(char ch)
    {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program050
{
    public static void main(String A[]) throws IOException
    {
        char cValue = '\0';
        boolean bRet = false;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number : ");
        cValue = (char)bobj.read();

        Display dobj = new Display();

        bRet = dobj.CheckVowel(cValue);

        if(bRet == true)
        {
            System.out.println("It is a vowel ");
        }
        else
        {
            System.out.println("It is not vowel");
        }
    }
        
}