
package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Transaction extends JFrame {
 
    Transaction(){
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
      
        
        
        setSize(900,900);
        setLocation(300, 0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Transaction();
    }
}
