//*************************************************************************
//
// CompoundPanel.java   Author: Dalvin Josias Sejour
//
//
// Demonstrate basic components of a GUI (components, events, and listers)
//**************************************************************************
import javax.swing.*;

public class Compound {

public static void main(String [] args){



JFrame frame = new JFrame("Compound Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

CompoundPanel panel = new CompoundPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


frame.getContentPane().add(panel);
frame.pack();
frame.setVisible(true);






   }
}