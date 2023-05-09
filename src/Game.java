import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;


public class Game extends JPanel implements KeyListener {

    // Attributes
    Panel[] panels;
    Snek snek;
    int apple;

    // Constructors
    public Game(int SIDE){

        // Sets initial snake settings
        snek = new Snek();

        // The panels necessary to fill the grid
        panels = new Panel[(SIDE*SIDE)];
        for (int i = 0; i < (SIDE*SIDE); i++){
            panels[i] = new Panel((i+1));

            // The border helps test if the grid is working as it should
            panels[i].setBorder(BorderFactory.createLineBorder((Color.green),1));

            this.add(panels[i]);
        }

    }

    // Methods
    private void spotHead(){
        for (Panel p: panels)
        {
            if (p.id == snek.getHead()){p.setState(1);}
            else {p.setState(0);}
            p.stain();
        }
    }
    private void spotSnek(){

        snek.updateBody();

        for(Panel p : panels){
            if (snek.getBody().contains(p.id) || p.id== snek.getHead()){p.setState(1);}
            else {p.setState(0);}
            p.stain();
        }

    }
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

    // G/Set
    // Overrides
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        spotHead();
        spotSnek();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a' -> snek.setHead(-1);  // Left
            case 'd' -> snek.setHead(1);  // Right
            case 'w' -> snek.setHead(-25); // Up
            case 's' -> snek.setHead(25); // Down
            case 'f' -> snek.extend();   // Free food
        }
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {    }
    @Override
    public void keyReleased(KeyEvent e) {    }
}
