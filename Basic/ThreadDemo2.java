
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run");
    }
}

class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Demo dobj = new Demo();
        dobj.start();

        System.out.println("End of main thread");

        
        
    }
}