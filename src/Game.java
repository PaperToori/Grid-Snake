import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Game extends JPanel {
    // Attributes
    Panel[] panels;
    List<Integer> snek;
    // Constructors
    public Game(int SIDE){

        // The panels necessary to fill the grid
        panels = new Panel[(SIDE*SIDE)];
        for (int i = 0; i < (SIDE*SIDE); i++){
            panels[i] = new Panel();

            // The border helps test if the grid is working as it should
            panels[i].setBorder(BorderFactory.createLineBorder((Color.green),3));

            this.add(panels[i]);
        }

    }
    // Methods
    // G/Set
}
