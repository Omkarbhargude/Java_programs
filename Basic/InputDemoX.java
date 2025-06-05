import java.io.*;

class InputDemo
{
    public static void main(String A[]) 
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter your name :");
        String name = bobj.readLine();

        System.out.println("Welcome"+name);

    }
}