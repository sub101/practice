import javax.swing.*;
import java.awt.*;

public class Info extends JFrame{
	
	public static JPanel contentPane;
	
	public Info() {
		
		setTitle("My Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =getContentPane();
		c.setLayout(null);
        
       /* JButton home = new JButton("Home");
        home.setBounds(500,20,100,40);
        c.add(home);
        
        JButton logout = new JButton("Logout");
        logout.setBounds(630,20,100,40);
        c.add(logout);*/
        
        JLabel utime =new JLabel("Usage Time : ");
        utime.setBounds(200,30,200,100);
        c.add(utime);
        
        
        JLabel id = new JLabel("ID");
        id.setBounds(110,100,150,100);
        c.add(id);
        JTextField Id = new JTextField(20);
        Id.setBounds(180,120,500,50);
        c.add(Id);
        
        JLabel pw = new JLabel("Password");
        pw.setBounds(85,200,150,100);
        c.add(pw);
        JTextField Pw = new JTextField(20);
        Pw.setBounds(180,220,500,50);
        c.add(Pw);
        
        JLabel cpw = new JLabel("Confirm Password");
        cpw.setBounds(60,300,150,100);
        c.add(cpw);
        JTextField Cpw = new JTextField(20);
        Cpw.setBounds(180,320,500,50);
        c.add(Cpw);
        
        JLabel n = new JLabel("Name");
        n.setBounds(90,400,150,100);
        c.add(n);
        JTextField N = new JTextField(20);
        N.setBounds(180,420,500,50);
        c.add(N);
        
        JLabel tn = new JLabel("Telephone Number");
        tn.setBounds(60,500,150,100);
        c.add(tn);
        JTextField Tn = new JTextField(20);
        Tn.setBounds(180,520,500,50);
        c.add(Tn);
        
        JLabel em =new JLabel("Email");
        em.setBounds(90,600,150,100);
        c.add(em);
        JTextField Em = new JTextField(20);
        Em.setBounds(180,620,500,50);
        c.add(Em);
        
        
        JButton confirm = new JButton("Confirm");
        confirm.setBounds(300,700,100,50);
        c.add(confirm);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(430,700,100,50);
        c.add(cancel);
        
        setSize(800,800);
		setVisible(true);
		
		
		
	}
		
	   public static void main(String[] args) {
	   new Info();
	   
	   
   }

	}

