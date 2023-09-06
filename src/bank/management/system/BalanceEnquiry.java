package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton back;
    JLabel text;
    String pinNumber;
    public BalanceEnquiry(String pinNumber) {
        
        this.pinNumber=pinNumber;
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        back= new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        l2.add(back);
        
        
        Conn conn = new Conn();
        int balance =0;
            try {
                 ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
                 
                 while(rs.next()){
                     if(rs.getString("type").equals("Deposit")){
                         balance += Integer.parseInt(rs.getString("amount"));
                     }else{
                         balance -= Integer.parseInt(rs.getString("amount"));
                     }
                 }
            }catch (Exception e){
                System.out.println(e);
            }
        
        text = new JLabel("Your Current Account Balance is Rs "+balance);
        text.setForeground(Color.white);
        text.setBounds(170,300,400,30);
        l2.add(text);
         
         
        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
         setVisible(false);
        new Transaction(pinNumber).setVisible(true);
    }
    
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
