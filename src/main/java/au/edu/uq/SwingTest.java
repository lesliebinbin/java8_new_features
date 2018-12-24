package au.edu.uq;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SwingTest {
  private static void actionPerformed(ActionEvent e) {
    System.out.println("Button pressed!");
    System.out.println("Hello world...");
    System.out.println("executed!");
  }

  public void frameDemo01() {
    JFrame jFrame = new JFrame("My JFrame");
    JButton jButton = new JButton("My JButton");
    jButton.addActionListener(SwingTest::actionPerformed);
    jFrame.add(jButton);
    jFrame.pack();
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
