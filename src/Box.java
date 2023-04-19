import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Box {
    // Attributes
    final int WIDTH = 900;
    final int HEIGHT = 920;
    final int SIDE = 25;
    // Constructors
    public Box(){
        // Normal JFrame stuff
        JFrame frame = new JFrame();
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(WIDTH, HEIGHT));

        // Creates the large panel that will hold the grid
        Game game = new Game(SIDE);
        game.setBorder(BorderFactory.createLineBorder((Color.BLACK), 10));
        LayoutManager layout = new GridLayout(SIDE, SIDE);
        game.setLayout(layout);

        // KeyListener stuff
        game.addKeyListener(game);
        game.setFocusable(true);

        // Finishing (important) touches
        frame.add(game);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // Methods
    // G/Set


}
