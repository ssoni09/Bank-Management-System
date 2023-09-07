package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{


    JLabel bank,card,mini,tBalance;
    
    public MiniStatement(String pinNumber) {
        setTitle("MINI STATEMENT");
        
        bank= new JLabel("INDIAN BANK");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        card = new JLabel();
        card.setBounds(20,60,300,20);
        add(card);
             
        mini= new JLabel();
        add(mini);
        
        tBalance = new JLabel();
        tBalance.setBounds(20,400,300,20);
        add(tBalance);
        
        try {
            Conn conn = new Conn();
            ResultSet rs=conn.s.executeQuery("SELECT * FROM login where pin = '"+pinNumber+"'");
            
             while(rs.next()){
                 card.setText("Card Number : XXXXXXXXXXXX"+rs.getString("cardnumber").substring(12));
             }
         
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        try {
            int balance = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pinNumber+"'");
            
             while(rs.next()){
                 mini.setText(mini.getText()+ "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
       
                 if(rs.getString("type").equals("Deposit")){
                         balance += Integer.parseInt(rs.getString("amount"));
                 }else{
                         balance -= Integer.parseInt(rs.getString("amount"));
                 }
             }
             tBalance.setText("Your current account balance is RS "+balance);
         
        } catch (Exception e) {
            System.out.println(e);
        }
        
        mini.setBounds(20, 100, 400, 200);
        
  
        setSize(400,600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
