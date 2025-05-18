import java.util.*;

class Calculate
{
    public float CalculatePercentage(int iTotalMarks,int iObtainedMarks)
    {
        float fPercentageValue = 0.0f;
        fPercentageValue = ((float)iObtainedMarks / (float)iTotalMarks) * 100;
        return fPercentageValue;
    }
}
class program1
{
    public static void main(String A[])
    {
        int iTotal = 0, iObtained = 0;
        float fPercentage = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the total marks :");
        iTotal = sobj.nextInt();

        System.out.println("Enter the Obtained marks :");
        iObtained = sobj.nextInt();

        Calculate cobj = new Calculate();
        fPercentage = cobj.CalculatePercentage(iTotal,iObtained);

        System.out.println("Percentage is : "+fPercentage);

    }
}