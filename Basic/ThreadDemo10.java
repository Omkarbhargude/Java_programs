

class Demo extends Thread
{
    public void run()
    {

    }
}


class ThreadDemo10
{
    public static void main(String A[])
    {
        Demo obj = new Demo();

        System.out.println("Current priority is :"+obj.getPriority());
        setPriority(10);
        System.out.println("Current priority is :"+obj.getPriority());


    }
}