class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        String name = Thread.currentThread().getName();
        System.out.println("Name of current thread is :"+name);
        
    }
}