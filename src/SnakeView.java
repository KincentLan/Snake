import java.awt.*;
import javax.swing.*;

public class SnakeView extends JFrame {
  SnakeView() {
    JPanel snakePanel = new JPanel();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(100, 100);

    GridLayout grid = new GridLayout(5, 5);
    snakePanel.setLayout(grid);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        snakePanel.add(new Square());
      }
    }

    this.add(snakePanel);
  }
}

class Square extends JPanel {
  private int squareW = 20;
  private int squareH = 20;

  protected void paintComponent(Graphics g) {
    super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
    g.setColor(Color.GREEN);
    g.fillRect(0,0,squareW,squareH);
  }
}