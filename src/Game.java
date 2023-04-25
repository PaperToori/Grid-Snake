import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.*;


public class Game extends JPanel implements KeyListener {

    // Attributes

    Panel[] panels;
    int snekHead;
    List<Integer> snek;
    // Constructors
    public Game(int SIDE){

        // Places snek in the top left corner
        snekHead = 1;

        // The panels necessary to fill the grid
        panels = new Panel[(SIDE*SIDE)];
        for (int i = 0; i < (SIDE*SIDE); i++){
            panels[i] = new Panel((i+1));

            // The border helps test if the grid is working as it should
            panels[i].setBorder(BorderFactory.createLineBorder((Color.green),3));

            this.add(panels[i]);

        }

    }

    // Methods



    // G/Set

    // Overrides
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (Panel p: panels)
        {
            if (p.id == snekHead){p.setState(1);}
            else {p.setState(0);}
            p.stain();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'a' ->  // Left
                    snekHead -=1;
            // System.out.println("Left");
            case 'd' -> // Right
                    snekHead +=1;
            // System.out.println("Right");
            case 'w' ->    // Up
                    snekHead -=25;
            //System.out.println("Up");
            case 's' -> // Down
                    snekHead +=25;
            //System.out.println("Down");
        }

        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {    }
    @Override
    public void keyReleased(KeyEvent e) {    }
}
