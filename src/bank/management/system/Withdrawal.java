
package bank.management.system;

import java.awt.*;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Withdrawal extends JFrame implements ActionListener{
    JLabel text;
    JTextField amt;
    JButton witdraw,back;
    String pinNumber;
    public Withdrawal(String pinNumber)  {
        this.pinNumber=pinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        text = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16)); 
        text.setBounds(170,300,400,20);
        l2.add(text);
        
        amt= new JTextField();
        amt.setFont(new Font("Raleway",Font.BOLD,22));
        amt.setBounds(170,350,320,25);
        l2.add(amt);
        
        witdraw = new JButton("Withdraw");
        witdraw.setBounds(355,485,150,30);
        witdraw.addActionListener(this);
        l2.add(witdraw);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        l2.add(back);
         
        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==witdraw){
            String amount = amt.getText();
            Date date = new Date();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
            }else{
                try {
                      Conn conn =new Conn();
                      String query="insert into bank values('"+pinNumber+"','"+date+"','Withdrawal','"+amount+"')";
                      conn.s.executeUpdate(query);
                      JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawal Successfully");
                      setVisible(false);
                      new Transaction(pinNumber).setVisible(true);
                } catch (Exception e) {
                         System.out.println(e);
                }
            }
        }else if(ae.getSource()==back){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Withdrawal("");
    }
    
}
