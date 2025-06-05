import java.io.*;

class Pattern 
{
    void Display()
    {
        int i = 0, j = 0;

        for(i = 1; i <= 3; i++)
        {
            for(j = 1; j <= 3; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
class pattern015
{
    public static void main(String A[])throws IOException
    {
        Pattern pobj = new Pattern();

        pobj.Display();
    }
}