
class Demo extends Thread
{
    public void run()
    {
        int iCnt = 0;
        for(iCnt =1; iCnt < 10; iCnt++)
        {
            System.out.println("Inside Thread :"+Thread.currentThread().getName()+" :"+iCnt);

        }
    }
}

class ThreadDemo5
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.setName("first");
        obj2.setName("second");

        obj1.start();
        obj2.start();

        System.out.println("End of main thread");



        
        
    }
}