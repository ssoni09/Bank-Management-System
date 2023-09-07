
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {
 
    JLabel text;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pinNumber;
    Transaction(String pinNumber){
        this.pinNumber=pinNumber;
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        text = new JLabel("Please Select Your Transaction");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(210,300,700,35);
        l2.add(text);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(170,415,150,30);
        l2.add(b1);
        
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(355,415,150,30);
        l2.add(b2);
        
        b3 = new JButton("FAST CASH");
        b3.setBounds(170,450,150,30);
        l2.add(b3);
        
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(355,450,150,30);
        l2.add(b4);
        
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(170,485,150,30);
        l2.add(b5);
        
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(355,485,150,30);
        l2.add(b6);
        
        b7 = new JButton("EXIT");
        b7.setBounds(355,520,150,30);
        l2.add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        }else if(ae.getSource()==b2){
            setVisible(false);
            new Withdrawal(pinNumber).setVisible(true);
        }else if(ae.getSource()==b3){
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }else if(ae.getSource()==b4){
            new MiniStatement(pinNumber).setVisible(true);
        }else if(ae.getSource()==b5){
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        }else if(ae.getSource()==b6){
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        }else if(ae.getSource()==b7){
            System.exit(0);
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        new Transaction("");
    }
}
