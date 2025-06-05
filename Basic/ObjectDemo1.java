class Student
{
    public String Name;
    public int Rno;
    public int Marks;

    public Student(String str, int A, int B);
    {
        System.out.println("Inside constructor");
        this.Name = str;
        this.Rno = A;
        this.Marks = B;
    }

     protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}
class ObjectDemo1
{
    public static void main(String A[])
    {
        Student sobj = new Student("Sagar",11,89);
        // Use of object

        sobj = null;
        System.gc();

    }
}