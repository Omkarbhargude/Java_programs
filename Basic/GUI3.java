import javax.swing.*;


class GUI3
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous Infosystems");

        JButton bobj = new JButton("submit");

        bobj.setBounds(100,100,150,50);

        fobj.add(bobj);
        fobj.setSize(400,300);
        fobj.setLayout(null);
        
        fobj.setSize(400,300);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}