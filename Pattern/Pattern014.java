import java.io.*;

class Pattern 
{
    void Display()
    {
        int j = 0;

        for(j= 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        System.out.println();

        for(j= 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        System.out.println();

        for(j= 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
}
class pattern014
{
    public static void main(String A[])throws IOException
    {
        Pattern pobj = new Pattern();

        pobj.Display();
    }
}