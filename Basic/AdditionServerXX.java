import java.net.*; //socket
import java.io.*;
import java.util.*;

class AdditionServerXX
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client arrives and connected successfully");
        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); //mouth





       int value1 = 0, value2 = 0, sum = 0;

       value1 = diobj.readInt();
       value2 = diobj.readInt();
       sum = value1 + value2;
       doobj.writeInt(sum);


       System.out.println("End of client application");
    }
}