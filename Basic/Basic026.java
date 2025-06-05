import java.io.*;

class Percentage
{
    public int iTotal, iObtained;

    public Percentage(int A, int B)
    {
        this.iTotal = A;
        this.iObtained = B;
    }

    public float CalculatePercentage()
    {
        float fPerc = 0.0f;
        fPerc = ((float)iObtained / (float)iTotal) * 100;
        return fPerc;
    }
}
class program026
{
    public static void main(String A[]) throws IOException
    {
        int Total = 0, Obtained = 0;
        float fPercentage = 0.0f;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your total marks : ");
        Total = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your Obtained marks : ");
        Obtained = Integer.parseInt(bobj.readLine());

        Percentage pobj = new Percentage(Total,Obtained);

        fPercentage = pobj.CalculatePercentage();

        System.out.println("Percentage is %"+fPercentage);

    }
}