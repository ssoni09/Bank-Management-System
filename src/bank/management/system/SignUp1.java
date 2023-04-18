package BankManagementSystem;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUp1 extends JFrame {

    SignUp1(){

        setTitle("NEW ACCOUNT APPLICATION FORM");
        setLayout(null);

        Random ran = new Random();
        long random= Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formNo=new JLabel("APPLICATION FORM NO. "+ random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140,20,600,40);
        add(formNo);

        JLabel detail=new JLabel("Page:1 Personal Details");
        detail.setFont(new Font("Raleway", Font.BOLD, 22));
        detail.setBounds(290,80,300,30);
        add(detail);

        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        JTextField nameTextField= new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField fnameTextField= new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,290,200,30);
        add(dob);

        JDateChooser dateChooser= new JDateChooser();
        dateChooser.setBounds(300,290,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
                
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,240,200,30);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,240,60,30);
        male.setBackground(Color.white);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,240,100,30);
        female.setBackground(Color.white);
        add(female);
        

        ButtonGroup gendergroup= new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);

        JTextField emailTextField= new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);

                
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(600,390,60,30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalgroup= new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        JTextField addressTextField= new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        JTextField cityTextField= new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel pincode=new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,540,200,30);
        add(pincode);

        JTextField pinTextField= new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300,540,400,30);
        add(pinTextField);

        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,590,200,30);
        add(state);

        JTextField stateTextField= new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300,590,400,30);
        add(stateTextField);
        
        JButton next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(600,660,80,30);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setVisible(true);
        setLocation(350, 10);
    }

    public static void main(String[] args) {
        new SignUp1();
    }
}
