import java.util.ArrayList;
import java.util.List;

public class Snek {
    // Attributes
    int head;
    List<Integer> body;
    int length;
    String direction;
    //Constructor
    public Snek (){
        this.head = 1;
        this.length = 1;
        this.body = new ArrayList<Integer>();
    }

    // Methods
    public void updateBody(){
        if (!this.body.contains(this.head))
        {this.body.add(this.head);}

        if (body.size() > length) {body.remove(0);}
        for(Integer i : body){
            System.out.println(i);
        }
        System.out.println("Length = " + length);
    }

    public void extend(){ this.length++; }

    // G/Set
    public int getHead()
    { return head; }
    public void setHead(int i){this.head = this.head + i;}
    public List<Integer> getBody()
    { return body; }
    public int getLength()
    { return length; }
    public String getDirection()
    { return direction;}
}
