import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JTextField tobj;
    public JPasswordField pobj;
    public JLabel Userlable, Passlabel, Resultlabel;

    public MarvellousLogin(String Title, int Width, int Height)
    {
        fobj = new JFrame();

        Userlable = new JLabel("Username");
        Userlable.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        Passlabel = new JLabel("Password");
        Passlabel.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(150,150,100,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlable);
        fobj.add(Passlabel);
        fobj.add(Resultlabel);
        
        bobj.addActionListener(this);

        fobj.setLayout(null);
        
        fobj.setTitle(Title);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        String uname = tobj.getText();
        String pass = new String(pobj.getPassword());

        if((uname.equals("Marvellous")) && (pass.equals("Marvellous@1121")))
        {
            Resultlabel.setText("Login Succesful"); 
        }
        else
        {
            Resultlabel.setText("Unable to login");
        }
    }
}

class LoginFormX
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Marvellous Login",400,300);
    }
}