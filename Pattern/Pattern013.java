import java.io.*;

class Pattern 
{
    void Display()
    {
        System.out.print("*\t");
        System.out.print("*\t");
        System.out.print("*\t");

        System.out.println();

        System.out.print("*\t");
        System.out.print("*\t");
        System.out.print("*\t");

        System.out.println();

        System.out.print("*\t");
        System.out.print("*\t");
        System.out.print("*\n");
    }
}
class pattern013
{
    public static void main(String A[])throws IOException
    {
        Pattern pobj = new Pattern();

        pobj.Display();
    }
}