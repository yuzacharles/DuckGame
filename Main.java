import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("Duck Story");
    frame.setSize(500, 500);
    frame.setLayout(null);

    // create a Button and a Label
    JButton helloButton = new JButton("Duck 1");
    JLabel outputLabel = new JLabel();
    JButton helloButton2 = new JButton("Duck 2");
    JLabel outputLabel2 = new JLabel();
     JButton helloButton3 = new JButton("Duck 3");
    JLabel outputLabel3 = new JLabel();

    // place and size for components
    // setBounds(x position, y position, width, height)
    helloButton.setBounds(100, 100, 100, 50);
    outputLabel.setBounds(50,200,200,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    outputLabel.setForeground(Color.BLUE);
    helloButton2.setBounds(200, 100, 100, 50);
    outputLabel2.setBounds(50,150,200,50);
    outputLabel2.setFont(new Font("Arial", Font.PLAIN, 20));
    outputLabel2.setForeground(Color.BLUE);
    helloButton3.setBounds(300, 100, 100, 50);
    outputLabel3.setBounds(50,100,200,50);
    outputLabel3.setFont(new Font("Arial", Font.PLAIN, 20));
    outputLabel3.setForeground(Color.ORANGE);

  
    // add components to JFrame f
    frame.add(helloButton);
    frame.add(outputLabel);
    frame.add(helloButton2);
    frame.add(outputLabel2);
    frame.add(helloButton3);
    frame.add(outputLabel3);

    
    // add event listener for button click
    helloButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("A Duck that jumps");
      }    });
    
    // make the frame visible
    frame.setVisible(true);

    helloButton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("A Duck that steals");
      }    });
    
    // make the frame visible
    frame.setVisible(true);

      helloButton3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("A Duck in a pond");
      }    });
    // make the frame visible
  }
}
