import java.net.*; //socket
import java.io.*;
import java.util.*;

class AdditionServerX
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client arrives and connected successfully");
        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); //mouth

        int no = diobj.readInt();
        System.out.println("Data received from client is :"+no);
        no++;
        doobj.writeInt(no);
    }
}