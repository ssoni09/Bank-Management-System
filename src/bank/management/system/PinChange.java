package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JLabel text,pinText,rePinText;
    JPasswordField pin,rePin;
    JButton change,back;
    String pinNumber;
    PinChange(String pinNumber){
        this.pinNumber=pinNumber;
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        text = new JLabel("CHANGE YOUR PIN");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(250,280,500,35);
        l2.add(text);
        
        pinText = new JLabel("New PIN :");
        pinText.setFont(new Font("System", Font.BOLD, 16));
        pinText.setForeground(Color.WHITE);
        pinText.setBounds(165,320,180,25);
        l2.add(pinText);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330, 320, 180, 25);
        l2.add(pin);
        
        rePinText = new JLabel("Re-Enter New PIN :");
        rePinText.setFont(new Font("System", Font.BOLD, 16));
        rePinText.setForeground(Color.WHITE);
        rePinText.setBounds(165,360,180,25);
        l2.add(rePinText);
        
        rePin = new JPasswordField();
        rePin.setFont(new Font("Raleway",Font.BOLD,25));
        rePin.setBounds(330, 360, 180, 25);
        l2.add(rePin);
         
        change=new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        l2.add(change);
        
        back=new JButton("BACK");
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
         if(ae.getSource()==change){
             try {
                 String npin = pin.getText();
                 String rpin = rePin.getText();
                 
                 
                 
                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                    return;
                }
             
                if(!npin.equals(rpin)){
                     JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                     return;
                 }
                
                Conn conn = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pinNumber+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pinNumber+"' ";
                String q3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pinNumber+"' ";

                conn.s.executeUpdate(q1);
                conn.s.executeUpdate(q2);
                conn.s.executeUpdate(q3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                
                setVisible(false);
                new Transaction(rpin).setVisible(true);
                
            } catch (Exception e) {   
                  System.out.println(e);
             }
         }else if(ae.getSource()==back){
             setVisible(false);
             new Transaction(pinNumber).setVisible(true);
         }
    }
    
    
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
