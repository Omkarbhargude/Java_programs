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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    
}
class ObjectDemo2
{
    public static void main(String A[]) throws Exception
    {
        Student sobj = new Student("Sagar", 11, 89);
        Student sobjX = (Student)sobj.clone();

        System.out.println(sobj.Name+" "+sobj.Rno+" "+sobj.Marks);
        System.out.println(sobjX.Name+" "+sobjX.Rno+" "+sobjX.Marks);

        System.out.println(sobj.hashCode());
        System.out.println(sobjX.hashCode());

        System.out.println(sobj.getClass());
        System.out.println(sobj.getClass());

    }
}