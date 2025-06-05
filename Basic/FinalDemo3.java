// Overriding allowed because we have created object of hello class 
// we cant use method which is already final before inherating 

class Demo
{
   public void Fun()
   {
    System.out.println("Inside Demo Fun");
   }

   public final void Gun()
   {
      System.out.println("Inside Demo Gun");
   }
}

class Hello extends Demo
{
   public void Fun() // Overriding allowed
   {
    System.out.println("Inside Hello Fun");
   }

   /*public void Gun() Not Allowed 
   {
    System.out.println("Inside Hello Gun");
   }
   */


}



class FinalDemo3
{
    public static void main(String A[])
    {
      Hello hobj = new Hello();
      hobj.Gun();  // demo gun
      hobj.Fun();  // hello fun
       
    }
}