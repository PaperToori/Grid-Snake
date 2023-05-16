import java.util.List;

public class Apple {
    //Attributes
    private int location;

    // Constructor
    public Apple(int SIDE){
        location = ((SIDE*SIDE)/2);
    }

    // Methods
    public int getLocation() { return location; }
    public void moveApple(List<Integer> body, int SIDE){ // Called when the snake has found the apple, moves the apple to an unoccupied spot of the board.
        while(true){
            location = (int)(Math.random()*(SIDE*SIDE));
            if (!body.contains(location)){break;}
        }
    }
}
