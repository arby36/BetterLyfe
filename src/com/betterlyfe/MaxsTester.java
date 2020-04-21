import java.util.*;
    public class MaxsTester{
        public static void main(String[] args) {
            UserDatabase maxData = new UserDatabase();
            
            User max = new User("Max", true, maxData);
            User alex = new User("Alex", true, maxData);
            System.out.println(max.toString());
            System.out.println(max.toString());
            max.setName("Max West");
            System.out.println(alex.toString());

        }
    }