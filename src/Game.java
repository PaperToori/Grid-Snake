import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;


public class Game extends JPanel implements KeyListener {

    // Attributes
    Panel[] panels;
    Snek snek;
    Apple apple;

    int SIDE;

    // Constructors
    public Game(int SIDE){

        // Kept for wall-checks and to update the position of the apple.
        this.SIDE = SIDE;

        // Sets initial snake/apple settings
        snek = new Snek();
        apple = new Apple(SIDE);

        // The panels necessary to fill the grid
        panels = new Panel[(SIDE*SIDE)];
        for (int i = 0; i < (SIDE*SIDE); i++){
            panels[i] = new Panel((i+1));

            // The border helps visualise panels to test if the grid is working as it should
            // panels[i].setBorder(BorderFactory.createLineBorder((Color.green),1));

            this.add(panels[i]);
        }

    }

    // Methods
    private void spotEntities(){ // checks if the snake has collided with a wall, found the apple, and then updates the GUI to match the relevant positions.

        snek.updateBody(apple, SIDE);

        for(Panel p : panels){
            if (snek.getBody().contains(p.id) || p.id == snek.getHead()){p.stain(1);}
            else if (p.id == apple.getLocation()) { p.stain(2); }
            else {p.stain(0);}
        }

    }
    /* This class isn't being used. It is used in-case time is implemented to automatically update snake-position.

    private void updateSnek(){
        switch (snek.getDirection()) {
            case "Left"
                    -> snek.setHead(-1);  // Left
            case "Right"
                    -> snek.setHead(1);  // Right
            case "Up"
                    -> snek.setHead(-25); // Up
            case "Down"
                    -> snek.setHead(25); // Down
        }
    }
    */

    // G/Set
    // Overrides
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        spotEntities();

    }

    @Override
    public void keyTyped(KeyEvent e) { // Checks if the snake's head is at one of the walls: if not, it moves to a location
        switch (e.getKeyChar()) {
            case 'a': // Left
                if (snek.getHead() % (SIDE) != 1){snek.updHead(-1);}
                break;
            case 'd': // Right
                if (snek.getHead() % SIDE != 0){snek.updHead(1);}
                break;
            case 'w': // Up
                if (snek.getHead() > SIDE){snek.updHead(-25);}
                break;
            case 's': // Down
                if (snek.getHead() < ((SIDE*SIDE)-SIDE)){snek.updHead(25);}
                break;
        }
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {  }
    @Override
    public void keyReleased(KeyEvent e) {  }
}
