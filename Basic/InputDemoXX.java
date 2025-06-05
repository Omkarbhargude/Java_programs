import java.io.*;

class InputDemoXX
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name :");
        String name = bobj.readLine();

        System.out.println("Welcome"+name);

    }
}