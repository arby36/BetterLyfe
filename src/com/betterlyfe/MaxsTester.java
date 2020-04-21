import java.util.*;
    public class MaxsTester{
        public static void main(String[] args) {
            UserDatabase maxData = new UserDatabase();
            
            User max = new User("Max", true, maxData);
            System.out.println(max.toString());
            max.setName("Alex");
            System.out.println(max.toString());

        }
    }