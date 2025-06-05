import java.io.*;

class Display
{
    public void DisplayClass(float fPerc)
    {
        if((fPerc < 0) || (fPerc > 100))
        {
            System.out.println("Unable to proceed as invalid input");
        }

        if((fPerc >= 0.0f) && (fPerc < 35.0f))
        {
            System.out.println("--Your are Fail--");
        }
        else if((fPerc >= 35.0f) && (fPerc < 50.0f))
        {
            System.out.println("--PASS CLASS--");
        }
        else if((fPerc >= 50.0f) && (fPerc < 60.0f))
        {
            System.out.println("--SECOND CLASS--");
        }
        else if((fPerc >= 60.0f) && (fPerc < 70.0f))
        {
            System.out.println("--FIRST CLASS--");
        }
        else if((fPerc >= 70.0f) && (fPerc <= 100.0f))
        {
            System.out.println("--FIRST CLASS WITH DISTINCTION--");
        }

    }
}
class program027
{
    public static void main(String A[])throws IOException
    {
        float fPercentage = 0.0f;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your Percentage : ");
        fPercentage = Float.parseFloat(bobj.readLine());

        Display dobj = new Display();

        dobj.DisplayClass(fPercentage);

    }
}