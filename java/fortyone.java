import javax.swing.*;

import myPack.info;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class fortyone extends JFrame implements MouseListener {
  private JTextArea textArea;

  public fortyone() {
    info.intro();

    textArea = new JTextArea();
    textArea.addMouseListener(this);

    add(new JScrollPane(textArea));
    setTitle("Mouse Event Demo");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    textArea.append("Mouse Clicked: " + e.getPoint() + "\n");
  }

  @Override
  public void mousePressed(MouseEvent e) {
    textArea.append("Mouse Pressed: " + e.getPoint() + "\n");
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    textArea.append("Mouse Released: " + e.getPoint() + "\n");
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    textArea.append("Mouse Entered: " + e.getPoint() + "\n");
  }

  @Override
  public void mouseExited(MouseEvent e) {
    textArea.append("Mouse Exited: " + e.getPoint() + "\n");
  }

  public static void main(String[] args) {
    new fortyone();
  }
}
