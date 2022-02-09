import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - Vaccine Management System");
            setIconImage(Toolkit.getDefaultToolkit().getImage(""));
            setBackground(new Color(100, 149, 237));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Boster Dose");
            l3.setForeground(Color.WHITE);
            l3.setFont(new Font("Optima", Font.BOLD | Font.ITALIC, 20));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Vaccination");
            l4.setForeground(Color.WHITE);
            l4.setFont(new Font("Optima", Font.BOLD | Font.ITALIC, 24));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("System");
            l5.setForeground(Color.WHITE);
            l5.setFont(new Font("Optima", Font.BOLD, 20));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Md. Ashikur Rahman");
            l6.setFont(new Font("Optima", Font.BOLD, 16));
            l6.setBounds(70, 198, 600, 35);
            l6.setForeground(Color.BLACK);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : razzashik@gmail.com");
            l7.setFont(new Font("Optima", Font.BOLD, 16));
            l7.setBounds(70, 260, 600, 34);
            l7.setForeground(Color.BLACK);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Subscribe us on Youtube : Gaming Gang");
            l8.setFont(new Font("Optima", Font.BOLD, 16));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Follow us on Instagram : Gaming Gang");
            l9.setFont(new Font("Optima", Font.BOLD , 16));
            l9.setBounds(70, 320, 600, 34);
            l9.setForeground(Color.BLACK);
            contentPane.add(l9);


            JLabel l10 = new JLabel("**If you want us to make Java Project for you, drop a mail**");
            l10.setForeground(Color.BLACK);
            l10.setFont(new Font("Optima", Font.BOLD | Font.ITALIC, 14));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(new Color(100,149,237));
	}
        

}

