import javax.swing.*;
import java.awt.*;

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
        Game game = new Game();
        game.setBorder(BorderFactory.createLineBorder((Color.BLACK), 10));
        LayoutManager layout = new GridLayout(SIDE, SIDE);
        game.setLayout(layout);

        // The panels necessary to fill the grid (can be moved into Game?)
        Panel[] panels = new Panel[900];
        for (int i = 0; i < (SIDE*SIDE); i++){
            panels[i] = new Panel();
            panels[i].setBorder(BorderFactory.createLineBorder((Color.green),3));
            game.add(panels[i]);
        }
        game.inject(panels);


        // Finishing (important) touches
        frame.add(game);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    // Methods
    // G/Set
}
