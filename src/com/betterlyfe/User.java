public class User{
    private int number;
    private String name;
    private boolean gender;

    public User(UserDatabase targetBase){
        number = targetBase.setNumber();
        System.out.println("User Number: " + number);
        

    }
    //Base Constructor for User class
    public User(String name, boolean gender, UserDatabase targetBase){
        number = targetBase.setNumber();
        this.name = name;
        this.gender = gender;
    }


    //The basic sets & gets methods follow
    public int getNumber(){
        return number;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setGender(boolean newGender){
        gender = newGender;
    }
    public char getGender(){
        if (gender){
            return 'M';
        } else {
            return 'F';
        }
    }
    //The saucy toString
    public String toString(){
        return "|" + number + "|" + name + "|" + this.getGender() + "|";
    }
}