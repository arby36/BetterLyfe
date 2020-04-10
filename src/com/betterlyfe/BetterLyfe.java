package com.betterlyfe;


public class BetterLyfe {
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
    public class Algorithm {

    }
    public static void main(String[] args) {
        BetterLyfe instance = new BetterLyfe();
        BetterLyfe.User user = instance.new User();
        user.setName("Hubert");
        System.out.print(user.getName());
    }
}
