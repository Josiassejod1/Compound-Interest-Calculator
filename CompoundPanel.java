//*************************************************************************
//
// CompoundPanel.java   Author: Dalvin Josias Sejour
//
//
// Demonstrate basic components of a GUI (components, events, and listers)
//**************************************************************************



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CompoundPanel extends JPanel{

private JLabel Title;

private JLabel label1, label2, label3, label4,label5,label6;

private JButton Calculate;

private JTextField Principal, Interest, Period, CMP_Period, Total, InterestTotal;

   
   public CompoundPanel ()
{



//Title for the Calculator
   Title = new JLabel("Compound Interest Calculator");
   Title.setHorizontalTextPosition(SwingConstants.CENTER);
   Title.setFont(new Font("Times New Roman",Font.PLAIN,18));
   
  
   //Listener class needed for each of these 
     
    Principal = new JTextField(5);
    label1 = new JLabel("Principal amount: ");
    Principal.addActionListener(new TextListen());
    
    Interest = new JTextField(5);
    label2 = new JLabel("Interest rate: ");
    Interest.addActionListener(new TextListen());
    
    Period = new JTextField(5);
    label3 = new JLabel ("Total period: ");
    Period.addActionListener(new TextListen());
    
    CMP_Period = new JTextField(5);
    label4 = new JLabel ("Compound period: ");
    CMP_Period.addActionListener(new TextListen());
    
    Calculate = new JButton("Calculate");
    Calculate.setHorizontalTextPosition(SwingConstants.CENTER);
    Calculate.addActionListener(new TextListen());
    
    Total = new JTextField(5);
    label5 = new JLabel ("Total Amount: ");
    Total.addActionListener(new TextListen());
    
    InterestTotal = new JTextField(5);
    label6 = new JLabel("Interest Amount: ");
    InterestTotal.addActionListener(new TextListen ());
    
    
    
    
    
    
    
    add(Title);
    
    
    add(label1);
    add(Principal);
     
     add(label2);
    add(Interest);
   
    add(label3);
    add(Period);
    
    add(label4);
    add(CMP_Period);
    
    
    add(Calculate);
    
    add(label5);
    add(Total);
    
    add(label6);
    add(InterestTotal);
    
   

   


   setPreferredSize(new Dimension(250,600));
   setBackground(Color.yellow);
}
   private class TextListen implements ActionListener
   {
   
   public void actionPerformed(ActionEvent event)
   {
   
   double P,r,t,n ;
   double Total_Amount,Interest_Amount;
   
   
   String Input1 = Principal.getText();
   String Input2 = Interest.getText();
   String Input3 = Period.getText();
   String Input4 = CMP_Period.getText();
   
   
  P = Double.parseDouble(Input1);
  r = Double.parseDouble(Input2);
  t = Double.parseDouble(Input3);
  n = Double.parseDouble(Input4);
   
  
   double rate = (r / n);
   
    
  Total_Amount = P*Math.pow(1+rate,n*t);
   Interest_Amount = (Total_Amount*n);
   
   Total.setText(Double.toString(Total_Amount));
   InterestTotal.setText(Double.toString(Interest_Amount));
   
  
   
   
   }





   }
}





                              
                              
                              
                              
                              
                              
                              
                             