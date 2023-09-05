
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


public class SignUp3 extends JFrame implements ActionListener{

    JLabel formNo1,formNo2;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup accGroup;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    public SignUp3(String formno) {
        
        this.formno = formno;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(150,0, 100, 100);
        add(label1);
        
        JLabel l1=new JLabel("Page:3 Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22)); 
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type :");
        type.setFont(new Font("Raleway",Font.BOLD,18));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,180,200,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,220,200,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        accGroup = new ButtonGroup();
        accGroup.add(r1);
        accGroup.add(r2);
        accGroup.add(r3);
        accGroup.add(r4);
        
        JLabel cardNo=new JLabel("Card Number :");
        cardNo.setFont(new Font("Raleway",Font.BOLD,18));
        cardNo.setBounds(100,300,200,30);
        add(cardNo);
        
        JLabel cardDetails=new JLabel("Your 16-digit Card number");
        cardDetails.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetails.setBounds(100,330,300,20);
        add(cardDetails);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,18));
        number.setBounds(330,300,250,30);
        add(number);
        
        JLabel pin=new JLabel(" Pin :");
        pin.setFont(new Font("Raleway",Font.BOLD,18));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,18));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel cardPin = new JLabel("Your 4 digit Pin");
        cardPin.setFont(new Font("Raleway",Font.BOLD,12));
        cardPin.setBounds(100,400,250,20);
        add(cardPin);
        
        JLabel service = new JLabel("Services Required :");
        service.setFont(new Font("Raleway",Font.BOLD,18));
        service.setBounds(100,450,250,30);
        add(service);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I here by declares that the above enter details "
                + "are correct to the best of my knowledge",true);
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(220,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        formNo1 = new JLabel("Form No:");
        formNo1.setFont(new Font("Raleway", Font.BOLD, 14));
        formNo1.setBounds(700,10,70,30);
        add(formNo1);
        
        
        formNo2 = new JLabel(formno);
        formNo2.setFont(new Font("Raleway", Font.BOLD, 14));
        formNo2.setBounds(770,10,40,30);
        add(formNo2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accontType=null;
            if(r1.isSelected()){
                accontType = "Saving Account";
            } else if(r2.isSelected()){
                accontType = "Fixed Deposit Account";
            } else if(r3.isSelected()){
                accontType = "Current Account";
            } else if(r4.isSelected()){
                accontType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardNumber= "" + Math.abs((random.nextLong()%900000000L)+5040936000000000L);
             
            String pinNumber = "" + Math.abs((random.nextLong()%9000L)+1000L);
            
            String facility = "";
            if(c1.isSelected()){ 
               facility = facility + " ATM Card";
             }
            if(c2.isSelected()){ 
              facility = facility + " Internet Banking";
            }
            if(c3.isSelected()){ 
              facility = facility + " Mobile Banking";
            }
            if(c4.isSelected()){ 
             facility = facility + " EMAIL & SMS Alerts";
            }
            if(c5.isSelected()){ 
              facility = facility + " Cheque Book";
            }
            if(c6.isSelected()){ 
              facility = facility + " E-Statement";
            }
            
            try{

                if(accontType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+accontType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin:"+ pinNumber);
                    
//                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
        
            }catch(Exception e){
                System.out.println(e);
            }
        }else if( ae.getSource()==cancel){
            
        }
    }
    
    public static void main(String[] args) {
        new SignUp3("");
    }
}
