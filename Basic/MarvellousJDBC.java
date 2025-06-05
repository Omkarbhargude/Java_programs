import java.sql.*;

class MarvellousJDBC
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/MarvellousPPA","root","");  

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");

            while(rs.next())
            {
                System.out.println("Roll No :"+rs.getInt("rno"));
                System.out.println("Name :"+rs.getString("rno"));
                System.out.println("City :"+rs.getString("rno"));
                System.out.println("Marks :"+rs.getInt("marks"));
                System.out.println("____________________");
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured :"+e);
        }

    }
}