public class Main {
    public static void main(String[] args) {
        //Initialize the user's variable
        String firstName = "teddy";
        String lastName= "Satay";
        String username="tsatay";
        String password="satayt";

       //initialize the first instance of User class with a specified values
        User user1 = new User(firstName,lastName,username,password);
        //initialize the second instance of User class with empty values
        User user2 = new User();

    }
}
