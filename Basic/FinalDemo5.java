/* As we have create a final class which means it cannot inherite to derived class any other class
so to use the characteristics and behaviour of final class 
we have to create the object of that final in derived class as a member
after creating object as member of derived class we can use the final class member as well as behaviours 
*/


final class Demo
{
    public int i = 11;
    public void fun()
    {   System.out.println("Inside Demo fun");  }

}

class Hello 
{
    public Demo dobj;
    public int j = 21;
    Hello()
    {
        dobj = new Demo();
    }


}

class FinalDemo5
{
    public static void main(String A[])
    {
       Hello hobj = new Hello();
       System.out.println(hobj.j);
       System.out.println(hobj.dobj.i);
       hobj.dobj.fun();
       
    }
}