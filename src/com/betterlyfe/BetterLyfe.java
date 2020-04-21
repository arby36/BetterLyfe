import java.util.Scanner;

//Main Class
public class BetterLyfe {
    //Initiation Class. Run the initiation here instead of in main.
    
    public class Init {
        public void init(BetterLyfe instance, Algorithm algorithm) {
            System.out.print("Input a name: ");

            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            User user = instance.new User();
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
