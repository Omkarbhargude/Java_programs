import java.io.*;

class FileIO1
{
    public static void main(String A[])throws Exception
    {
        File fobj = new File("Marvellous.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File is Succesfully created ");
            FileWriter fwobj = new FileWriter("Marvellous.txt");
            int ret = fwobj.write("Pre Placement Activity Batch 52 ");
            System.out.println(ret);
        }
    }
}