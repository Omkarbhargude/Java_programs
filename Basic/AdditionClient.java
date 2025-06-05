import java.net.*; //socket
import java.io.*;
import java.util.*;

class AdditionClient 
{
    public static void main(String A[]) throws Exception
    {


        Socket sobj = new Socket("localhost",2100);

        DataInputStream diobj = new DataInputStream(sobj.getInputStream()); //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); //mouth


    }
}