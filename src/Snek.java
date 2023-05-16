import java.util.ArrayList;
import java.util.List;

public class Snek {
    // Attributes
    int head;
    List<Integer> body;
    int length;

    // Unused, due to lack of time (pun intended).
    String direction;


    //Constructor
    public Snek (){
        this.head = 1;
        this.length = 1;
        this.body = new ArrayList<Integer>();
    }

    // Methods
    public void updateBody(Apple apple, int SIDE){

        // if the snake's head crashes into its own body the game ends.
        // If it survives, the head's location is added to the body.
            // (wall collisions don't update head location, killing it on the next call of the method)
        if (this.body.contains(this.head)){System.exit(0);}
        this.body.add(this.head);

        // Checks if the apple overlaps with the heads location. if yes: eats it and grows longer.
        if(this.head == apple.getLocation())
        {
            length++;
            apple.moveApple(this.body, SIDE);
        }

        // unnecessarily elaborate system of determining the length of the snake.
        if (body.size() > length) {body.remove(0);}
        for(Integer i : body){
            System.out.println(i);
        }
        System.out.println("Length = " + length);
    }


    // G/Set
    public int getHead()
    { return head; }
    public void updHead(int i){this.head = this.head + i;}
    public List<Integer> getBody()
    { return body; }
    public int getLength()
    { return length; }
    public String getDirection()
    { return direction;}
}
