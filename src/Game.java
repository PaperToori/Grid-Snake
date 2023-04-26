import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;


public class Game extends JPanel implements KeyListener {

    // Attributes
    Panel[] panels;
    int snekHead;
    List<Integer> snek;
    String direction; // use this to make movement dependent on updateSnek() instead of Keylistener.
    int length;

    // Constructors
    public Game(int SIDE){

        // Sets initial snake settings
        snekHead = 1;
        length = 1;
        snek = new ArrayList<Integer>();



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
            if (p.id == snekHead){p.setState(1);}
            else {p.setState(0);}
            p.stain();
        }
    }
    private void spotSnek(){

        if (!snek.contains(snekHead))
        {snek.add(snekHead);}

        if (snek.size() > length) {snek.remove(0);}
        for(Integer i : snek){
            System.out.println(i);
        }
        System.out.println("Length = " + length);

        for(Panel p : panels){
            if (snek.contains(p.id) || p.id== snekHead){p.setState(1);}
            else {p.setState(0);}
            p.stain();
        }

    }
    private void updateSnek(){
        switch (direction) {
            case "Left"
                    -> snekHead -=1;  // Left
            case "Right"
                    -> snekHead += 1;  // Right
            case "Up"
                    -> snekHead -=25; // Up
            case "Down"
                    -> snekHead +=25; // Down
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
            case 'a' -> snekHead -=1;  // Left
            case 'd' -> snekHead +=1;  // Right
            case 'w' -> snekHead -=25; // Up
            case 's' -> snekHead +=25; // Down
            case 'f' -> length += 1;   // Free food
        }
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {    }
    @Override
    public void keyReleased(KeyEvent e) {    }
}
