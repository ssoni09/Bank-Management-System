package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignUp2 extends JFrame implements ActionListener {

    JTextField aadharTextField,panTextField;
    ButtonGroup sgroup,egroup;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religionDrop,categoryDrop,incomeDrop,educationDrop,occupationDrop;
    JButton next; 
    String formNo;
    SignUp2(String formNo) {
        this.formNo = formNo;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE:2");
        setLayout(null);

        JLabel title = new JLabel("PAGE 2 : ADDITIONAL DETAILS");
        title.setFont(new Font("Raleway", Font.BOLD, 22));
        title.setBounds(290,80,400,30);
        add(title);


        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionDrop = new JComboBox(valreligion);
        religionDrop.setFont(new Font("Raleway", Font.BOLD, 14));
        religionDrop.setBackground(Color.white);
        religionDrop.setBounds(300,140,400,30);
        add(religionDrop);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
        categoryDrop = new JComboBox(valCategory);
        categoryDrop.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryDrop.setBackground(Color.white);
        categoryDrop.setBounds(300,190,400,30);
        add(categoryDrop);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String valIncome[]={"Null","<1.5 LPA","< 2.5 LPA","< 5 LPA","Upto 10 LPA"};
        incomeDrop= new JComboBox(valIncome);
        incomeDrop.setBounds(300,240,400,30);
        incomeDrop.setForeground(new Color(105,105,105));
        incomeDrop.setBackground(Color.white);
        add(incomeDrop);

        
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,290,200,30);
        add(educational);

        JLabel qualification=new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,320,200,30);
        add(qualification);
        
        String valEducation[] = {"10th","12th","Gruduate","Post-graduate","Doctorate","Other"};
        educationDrop= new JComboBox(valEducation);
        educationDrop.setFont(new Font("Raleway", Font.BOLD, 14));
        educationDrop.setBounds(300,320,400,30);
        educationDrop.setBackground(Color.white);
        add(educationDrop);
        
        JLabel occupation = new JLabel("Occupation");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String valOccupation[]={"Salaried","Self-Employed","Business","Retired","Other"};
        occupationDrop=new JComboBox(valOccupation);
        occupationDrop.setBounds(300,390,400,30);
        occupationDrop.setBackground(Color.white);
        occupationDrop.setBackground(Color.white);
        add(occupationDrop);
        
        JLabel pan = new JLabel("PAN Number");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panTextField= new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
        aadharTextField= new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);

        JLabel seniorCitizen = new JLabel("Senior Citizen");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100,540,200,30);
        add(seniorCitizen);
        
        syes=new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 20));
        syes.setBounds(300,540,80,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 20));
        sno.setBounds(450,540,80,30);
        sno.setBackground(Color.white);
        add(sno);
        
        sgroup= new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
       

        
        JLabel exitingAccount = new JLabel("Existing Account");
        exitingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        exitingAccount.setBounds(100,590,200,30);
        add(exitingAccount);
        
        eyes=new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 20));
        eyes.setBounds(300,590,80,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 20));
        eno.setBounds(450,590,80,30);
        eno.setBackground(Color.white);
        add(eno);
        
                
        egroup= new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
        
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(600,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setVisible(true);
        setLocation(350, 10);

    }

     @Override
    public void actionPerformed(ActionEvent ae) {
        String formno= formNo;
        String religion = (String)religionDrop.getSelectedItem();
        String category = (String)categoryDrop.getSelectedItem();
        String income = (String)incomeDrop.getSelectedItem();
        String education = (String)educationDrop.getSelectedItem();
        String occupation = (String)occupationDrop.getSelectedItem();
        String seniorCitizen = null;
        if(syes.isSelected()){
            seniorCitizen = "Yes";
        }else if(sno.isSelected()){
            seniorCitizen = "No";
        }
        String aadhar = aadharTextField.getText();
        String pan = panTextField.getText();
        String existingAccount = null;
        if(eyes.isSelected()){
            existingAccount = "Yes";
        }else if(eno.isSelected()){
            existingAccount = "No";
        }
       
        
        try{
                Conn c1 = new Conn();
                String query = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+seniorCitizen+"','"+existingAccount+"')";
                c1.s.executeUpdate(query);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignUp2("");
    }

}