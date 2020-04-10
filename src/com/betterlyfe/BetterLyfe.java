package com.betterlyfe;
import java.util.Scanner;

//Main Class
public class BetterLyfe {

    //This is where we'll initiate a user. Eventually we'll need to pull data from the database here.
    public class User {
        private String name;
        public String setName(String arg) {
            name = arg;
            return name;
        }
        public String getName() {
            return name;
        }
    }

    //Initiation Class. Run the initiation here instead of in main.
    public class Init {
        public void init(BetterLyfe instance, Algorithm algorithm) {
            System.out.print("Input a name: ");

            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            BetterLyfe.User user = instance.new User();
            user.setName(name);

            System.out.print("What up, " + user.getName());
        }
    }

    //Main method. Create object instances here.
    public static void main(String[] args) {
        BetterLyfe instance = new BetterLyfe();
        BetterLyfe.Init init = instance.new Init();
        Algorithm algorithm = new Algorithm();
        init.init(instance, algorithm);
    }
}
