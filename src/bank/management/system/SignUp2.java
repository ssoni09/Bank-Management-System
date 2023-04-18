package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import netscape.javascript.JSException;

public class SignUp2 extends JFrame {

    SignUp2() {
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE:2");
        setLayout(null);

        JLabel title = new JLabel("PAGE 2 : ADDITIONAL DETAILS");
        title.setFont(new Font("Osward", 15, 15));
        title.setForeground(Color.BLACK);
        title.setBounds(200, 40, 400, 40);
        add(title);


        JLabel religion = new JLabel("Religion");
        religion.setFont(new Font("Osward", 15, 15));
        religion.setBounds(50, 80, 400, 40);
        add(religion);

        JLabel category = new JLabel("Category");
        category.setFont(new Font("Osward", 15, 15));
        category.setBounds(50, 120, 400, 40);
        add(category);

        JLabel income = new JLabel("Income");
        income.setFont(new Font("Osward", 15, 15));
        income.setBounds(50, 160, 400, 40);
        add(income);

        JLabel qualification = new JLabel("Educational Qualification");
        qualification.setFont(new Font("Osward", 15, 15));
        qualification.setBounds(50, 200, 400, 40);
        add(qualification);

        JLabel pan = new JLabel("PAN Number");
        pan.setFont(new Font("Osward", 15, 15));
        pan.setBounds(50, 240, 400, 40);
        add(pan);

        JLabel aadhar = new JLabel("Aadhar Number");
        aadhar.setFont(new Font("Osward", 15, 15));
        aadhar.setBounds(50, 280, 400, 40);
        add(aadhar);

        JLabel seniorCitizen = new JLabel("Senior Citizen");
        seniorCitizen.setFont(new Font("Osward", 15, 15));
        seniorCitizen.setBounds(50, 320, 400, 40);
        add(seniorCitizen);

        JLabel exitingAccount = new JLabel("Existing Account");
        exitingAccount.setFont(new Font("Osward", 15, 15));
        exitingAccount.setBounds(50, 360, 400, 40);
        add(exitingAccount);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);

    }

    public static void main(String[] args) {
        new SignUp2();
    }

}