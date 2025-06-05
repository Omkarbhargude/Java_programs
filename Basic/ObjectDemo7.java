class Student implements Cloneable
{
    public String Name;
    public int Rno;
    public int Marks;

    public Student(String str, int A, int B)
    {
        System.out.println("Inside constructor");
        this.Name = str;
        this.Rno = A;
        this.Marks = B;
    }

    public String toString()
    {
        return this.Name+" "+this.Rno+" "+this.Marks;
    }
    
}
class ObjectDemo7
{
    public static void main(String A[]) 
    {
        Student sobj = new Student("Sagar", 11, 89);

        System.out.println(sobj.toString());
      
    }
}