import javax.swing.*;
import java.awt.*;

public class Box {
    // Attributes
    final int WIDTH = 500;
    final int HEIGHT = 520;
    final int ROWS = 30;
    final int COLS = 30;
    // Constructors
    public Box(){
        // Normal JFrame stuff
        JFrame frame = new JFrame();
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(WIDTH, HEIGHT));

        // 2 Panels in grid
        JPanel mix = new JPanel();
        mix.setBorder(BorderFactory.createLineBorder((Color.BLACK), 10));
        LayoutManager layout = new GridLayout(ROWS,COLS);
        mix.setLayout(layout);

        // Finishing (important) touches
        frame.add(dual);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    // Methods
    // G/Set
}
