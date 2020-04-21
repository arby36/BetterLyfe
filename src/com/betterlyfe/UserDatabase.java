import java.util.*;
public class UserDatabase{
    ArrayList <String> userNames = new ArrayList<String>();
    ArrayList <Integer> userNums = new ArrayList<Integer>();
    int userCount = 0;
    public int setNumber(){
        int sauce = Math.round((int)(Math.random() * 100));
        userNums.add(userCount,sauce);
        userCount++;
        return sauce;
    }
}