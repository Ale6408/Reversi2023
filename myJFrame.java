/*
  * @author     Alejandro Alonso Piza
  * @id         alejnadro.alonso@betheluniversity.edu
  * @course     CSIS 321:  Programming 3
  * @assignment Reversi Project
  * @related    none
 */
import javax.swing.*;
import java.awt.*;

public class myJFrame{
    //field variables
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button;
    
    //Constructor
    public myJFrame(){
        initialize();
    }
    
    private void initialize(){
        //Creates the frame for the game
        frame = new JFrame();
        frame.setTitle("Reversi Game");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        //Creates a panel for the reversi game
        panel1 = new JPanel(new GridLayout(8, 8, 10, 10));
        //panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel1.setBackground(Color.RED);
        
        //Creates a second panel to keep track of the game    --------------------    **NEED TO WORK ON WHAT TO PUT HERE**
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 100));
        panel2.setBackground(Color.BLUE);
        
        //Creates a button on panel 1
        for (int i = 1; i <= 64; i++){
            button = createButton(i);
            panel1.add(button);
        }
        
        //Adds the panels to the frame
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);
        
        //Allows to see everything in the JFrame
        this.frame.setVisible(true);
    }
    
    private JButton createButton(int num){
        JButton myButton = new JButton(Integer.toString(num));
        //button.setFocusable(false);
        //button.addActionListener(new ActionLIstener(){    --------------------    **THIS METHOD SHOULD HELP MAKE BUTTON DO ACTIONS**
        //**SHOULD LOOK INTO HOW TO MAKE BUTTON INTO SET SIZE**
        return myButton;
    }
}