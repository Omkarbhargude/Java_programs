
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

class ThreadDemo6 
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.setName("first");
        obj2.setName("second");

        obj1.start();
        obj2.start();
        
        obj1.join(); // calls the main thread
        obj2.join();

        System.out.println("End of main thread");



        
        
    }
}