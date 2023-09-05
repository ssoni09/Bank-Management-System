package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener {

    JLabel title,cardNo,pin;
    JButton clear, login, signup;
    JTextField cardNoTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("Automatic Teller Machine");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(70, 10, 100, 100);
        add(label1);


        title = new JLabel("Welcome to ATM");
        title.setFont(new Font("Osward", Font.BOLD, 38));
        title.setForeground(Color.BLACK);
        title.setBounds(200, 40, 400, 40);
        add(title);


        cardNo = new JLabel("Card No :");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 38));
        cardNo.setBounds(120, 150, 400, 40);
        add(cardNo);


        cardNoTextField = new JTextField();
        cardNoTextField.setBounds(300, 150, 250, 30);
        add(cardNoTextField);


        pin = new JLabel("Pin :");
        pin.setFont(new Font("Raleway", Font.BOLD, 38));
        pin.setBounds(120, 220, 400, 40);
        add(pin);


        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);


        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.BLACK);
        login.addActionListener(this);
        add(login);


        clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);


        signup = new JButton("Sign up");
        signup.setBounds(300, 350, 230, 30);
        signup.setForeground(Color.WHITE);
        signup.setBackground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);

    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardNoTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
             Conn conn=new Conn();
             String cardNumber = cardNoTextField.getText();
             String pinNumber = pinTextField.getText();
             String query = "select * from login where cardnumber= '"+cardNumber+"'and pin= '"+pinNumber+"'";
            
             try{
                 ResultSet rs= conn.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     new Transaction(pinNumber).setVisible(true);
                 }else{
                     JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
             } catch(Exception e){
                 System.out.println(e);
             }
             
             
             
             
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignUp1().setVisible(true);
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


    public static void main(String[] args) {
        new Login();
    }

}