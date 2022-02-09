import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class AddUser extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTextField t1,t2,t3;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args){
        new AddUser().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
        t1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddUser(){
        super("Add User");
        setBounds(700, 200, 550, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("User_id");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Optima", Font.BOLD, 14));
        l1.setBounds(64, 63, 102, 22);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground((Color.WHITE));
        l2.setFont(new Font("Optima", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("NID Number");
        l3.setForeground((Color.WHITE));
        l3.setFont(new Font("Optima", Font.BOLD, 14));
        l3.setBounds(64, 130, 102, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Vaccine");
        l4.setForeground((Color.WHITE));
        l4.setFont(new Font("Optima", Font.BOLD, 14));
        l4.setBounds(64, 209, 102, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Division");
        l5.setForeground((Color.WHITE));
        l5.setFont(new Font("Optima", Font.BOLD, 14));
        l5.setBounds(64, 242, 102, 22);
        contentPane.add(l5);

        JLabel l6 = new JLabel("District");
        l6.setForeground((Color.WHITE));
        l6.setFont(new Font("Optima", Font.BOLD, 14));
        l6.setBounds(64, 275, 102, 22);
        contentPane.add(l6);

        t1 = new JTextField();
        t1.setEditable(false);
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Optima", Font.BOLD, 14));
        t1.setBounds(174, 66, 156, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Optima", Font.PLAIN, 14));
        t2.setColumns(10);
        t2.setBounds(174, 100, 156, 20);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Optima", Font.PLAIN, 14));
        t3.setColumns(10);
        t3.setBounds(174, 133, 156, 20);
        contentPane.add(t3);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "AstraZeneca", "Johnson & Johnson", "Moderna", "Pfizer-BioNTech", "Sinopharm-BBIBP" }));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setFont(new Font("Optima", Font.PLAIN, 14));
        comboBox.setBounds(176, 211, 154, 20);
        contentPane.add(comboBox);

        comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Barisal", "Chittagong", "Dhaka", "Khulna","Mymensingh","Rajshahi","Rangpur","Sylhet" }));
        comboBox_1.setForeground(new Color(47, 79, 79));
        comboBox_1.setFont(new Font("Optima", Font.PLAIN, 14));
        comboBox_1.setBounds(176, 244, 154, 20);
        contentPane.add(comboBox_1);

        comboBox_2 = new JComboBox();
        comboBox_2.setModel(
                new DefaultComboBoxModel(new String[] { "Barguna", "Barisal", "Bandarban", "Brahmanbaria", "Dhaka", "Kishoreganj", "Khulna", "Kushtia","Mymensingh","Netrokona","Natore","Rajshahi","Dinajpur","Rangpur","Habiganj","Sunamganj" }));
        comboBox_2.setFont(new Font("Optima", Font.PLAIN, 14));
        comboBox_2.setForeground(new Color(47, 79, 79));
        comboBox_2.setBounds(176, 277, 154, 20);
        contentPane.add(comboBox_2);

        b1 = new JButton("ADD");
        b1.addActionListener(this);
        b1.setFont(new Font("Optima", Font.BOLD, 14));
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Optima", Font.BOLD, 14));
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        JLabel l7 = new JLabel("Identity");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Optima", Font.BOLD, 14));
        l7.setBounds(64, 173, 102, 22);
        contentPane.add(l7);

        comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(
                new String[] { "Foreign National", "Bangladeshi Workers", "Bangladeshi Student", "Citizen 25 years & above", "Freedom Fighters", "Civilian Aircraft", "Military and Paramilitary", "University Students", "National Players", "Farmers" }));
        comboBox_3.setForeground(new Color(47, 79, 79));
        comboBox_3.setFont(new Font("Optima", Font.PLAIN, 12));
        comboBox_3.setBounds(176, 176, 154, 20);
        contentPane.add(comboBox_3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-User",
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 358, 348);

        contentPane.setBackground(new Color(100,149,237));
        panel.setBackground(new Color(100,149,237));

        contentPane.add(panel);
        random();

    }
    public void actionPerformed(ActionEvent ae){
        try{

            if(ae.getSource() == b1){
                try{
                    conn con = new conn();
                    String sql = "insert into user(user_id, user_name, nid_number,identity , vaccine_name , division , Zila ) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, t3.getText());
                    st.setString(4, (String) comboBox_3.getSelectedItem());
                    st.setString(5, (String) comboBox.getSelectedItem());
                    st.setString(6, (String) comboBox_1.getSelectedItem());
                    st.setString(7, (String) comboBox_2.getSelectedItem());

                    int i = st.executeUpdate();
                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        this.setVisible(false);
                        new Home().setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }

            if(ae.getSource() == b2){
                this.setVisible(false);
                new Home().setVisible(true);
            }
        }catch(Exception e){

        }
    }

}
