import java.io.*;

class FileIO2
{
    public static void main(String A[])
    {
        try
        {

            FileWriter fwobj = new FileWriter("Marvellous.txtX");
            fwobj.write("Pre Placement Activity Batch 52 ");
            fwobj.write("Logic building with industrail project Development");
            fwobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }
}