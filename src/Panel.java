import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    // Attributes
    int state;
    int id;
    /*
    States:
    0 - Empty, White
    1 - Snake, Green
    2 - Apple, Red
    * */

    // Constructors
    public Panel(int id){
        this.state = 0;
        this.id = id;
        stain();
    }

    // Methods
    public void stain(){
        if     (this.state == 0) { this.setBackground(Color.WHITE); }
        else if(this.state == 1) { this.setBackground(Color.GREEN); }
        else                     { this.setBackground(Color.RED); }
    }
    // G/Set
    public void setState(int i){this.state = i;}
}
