import java.util.*;

class Display
{
    public void DisplayClass(float fPerc)
    {
        if((fPerc < 0.0f) || (fPerc > 100.f))
        {
            System.out.println("Invalid input please try again");
            return;
        }
        if((fPerc >= 0.0f) && (fPerc < 35.0f ))
        {
            System.out.println("Your are fail");
        }
        else if((fPerc >= 35.0f) && (fPerc < 50.0f))
        {
            System.out.println("Pass Class");
        }
        else if((fPerc >= 50.0f) && (fPerc < 60.0f))
        {
            System.out.println("Second class");
        }
        else if((fPerc >= 60.0f) && (fPerc < 70.0f))
        {
            System.out.println("First class");
        }
        else if((fPerc >= 70.0f) && (fPerc < 100.0f))
        {
            System.out.println("First class with distinction");
        }
    }
}
class program2
{
    public static void main(String A[])
    {
        float fPercentage = 0.0f;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your percentage :");
        fPercentage = sobj.nextFloat();

        Display dobj = new Display();

        dobj.DisplayClass(fPercentage);


    }
}