/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid;
import java.awt.*;     // Using ANT container and component classes
import java.awt.event.*; // Using AMR event classes and listener interface:
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author m1801087
 */
public class Grid extends Frame implements ActionListener {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
        private Label lblInput;  // Declare input Label
        private Label lblOutput; // Declare output Label
        private TextField tfInput; // Declare input TextField 
        private TextField tfOutput; // Declare output textrield 
        private int sum = 0; // Accumulated sun. init to 0    
        public void addComponentsToPane(Container pane){
        if (RIGHT_TO_LEFT){
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }  
    JButton button;
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    if (shouldFill){
    c.fill = GridBagConstraints.HORIZONTAL;
    }
    
    button = new JButton("Button 1");
    if (shouldWeightX){
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(button, c);
    
    button = new JButton("Button 2");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 0;
    pane.add(button, c);
    
    button = new JButton("Button 3");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 2;
    c.gridy = 0;
    pane.add(button, c);
    
    button = new JButton("Long-Named Button 4");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 40;
    c.weightx = 0.0;
    c.gridwidth = 3;
    c.gridx = 0;
    c.gridy = 1;
    pane.add(button, c);
    
    button = new JButton("5");
    AWTC();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 0;
    c.weightx = 1.0;
    c.anchor = GridBagConstraints.PAGE_END;
    c.insets = new Insets(10,0,0,0);
    c.gridx = 0;
    c.gridy = 1;
    c.gridy = 2;
    pane.add(button, c);
    }

        public void AWTC(){
     setLayout(new FlowLayout());
        // 'super' Frame (container) sets layout to Flowtayout, which arranges
        // the component: from left-to-right, and flow to next naa frost top-to-bottom.

     lblInput = new Label("Enter an Integer: ");// Construct Lobel
     add(lblInput);             // 'super' Prone container adds Label component

     tfInput = new TextField(10); // Construct Infield 
     add(tfInput);              // 'super" franc add: TextField

     tfInput.addActionListener(this);
        // "tfInput- is the source object that fires an Actiontvent upon entered.
        // The source add 'this' instance as an ActionEvent listener, which provides 
        // an Actlo,,Event handler called actionPerformed().
        // Hitting 'enter" on tflnput invokes actioneerfonmed().

     lblOutput = new Label(""+ "Accumulated Sum is: "); // allocate Label 
     add(lblOutput);            // "super' franc add: Label

     tfOutput = new TextField(10); // allocate Textrield
     tfOutput.setEditable(false); // read-only
     add(tfOutput);             //         Fran. ands TextField

     setTitle("AWT Accumulator"); // "super' Franc set: title 
     setSize(350, 120); // "super" Crate sets initial window size 
     setVisible(true);  // "super" frame shows
   }
    private void createAndShowGUI(){
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //javax.swing.SwingUtilities.invokeLater(new Runnable() {
         ///   public void run() {
          ///      Grid();
          ///  }
       // });
        new createAndShowGUI();
    }
    @Override
    public void actionPerformed(ActionEvent evt) {
        // Get the String entered into the TextField tfInput, convert to int 
        int numberIn = Integer.parseInt(tfInput.getText());
        sum += numberIn;   // Accumulate nunberS entered into
        tfInput.setText(""); // Clear input TextField
        tfOutput.setText(sum + ""); // Display sun on the output TextField
    }                            // convert int to String
}
