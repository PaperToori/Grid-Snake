import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.*;


public class Game extends JPanel implements KeyListener {

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

    // Overrides
    @Override
    public void keyTyped(KeyEvent e) {

        // System.out.println(e.getKeyChar());

        switch (e.getKeyChar()) {
            case 'a' ->  // Left
                    System.out.println("Left");
            case 'd' -> // Right
                    System.out.println("Right");
            case 'w' ->    // Up
                    System.out.println("Up");
            case 's' -> // Down
                    System.out.println("Down");
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {    }
    @Override
    public void keyReleased(KeyEvent e) {    }
}
