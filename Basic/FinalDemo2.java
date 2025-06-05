//use of final as member of characteristic 

class Demo
{
     public int i;
     //public final int j; Error not allowed
     // public final int j = 21; Allowed 
     public final int j; // final characteristics

     Demo() //Demo() : j(20) -> in c++
     {
      i = 10;
      j = 20;
     }
}



class FinalDemo2
{
    public static void main(String A[])
    {
       Demo dobj = new Demo();
       dobj.i++;
       //dobj.j++; Compilation error
       
    }
}