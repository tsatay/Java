import java.util.Scanner;

public class Main {
    /*
        * Implement a user playing Halo and visiting their character history page.
        * When the user goes to the page, a menu opens, their character is displayed, and multiple scores are displayed.
        * Create a method called displayCharacter that takes a username and returns the username along with the text " is being displayed."
        * Create another method called getCharacterHighScores that returns the string "Highest kills: 10000"
        * Create another method called openCharacterHistory that invokes the other two methods and prints their values.
        * Invoke openCharacterHistory.
    **/

    public static void main(String[] args) {
        //Create a Scanner instance
        Scanner input = new Scanner(System.in);
        //Let the user to input a Username
        System.out.println("Enter the Username.");
        //Store a Username to variable called usernameInput in a lowerCase
        String usernameInput = input.nextLine().toLowerCase();
        //Calling a method to check a user input and display a result
        System.out.println(openCharacterHistory(usernameInput));


    }
    private static String displayCharacter(String username){
        //Storing a user input along with a text message 
        return username + " is being displayed";
    }
    private static String getCharacterHighScores(){
        //Creating an int variable
        int score = 10000;
        //Storing the value of the variable along with text
        return "Highest kills: "+ score;
    }
    private static String openCharacterHistory(String name){
        //Creating a string variable to hold a result 
        String output;
        //Invoking the methods and assign their values to a variable  
        output = displayCharacter(name)+ "\n"+ getCharacterHighScores();
        //Storing the value of string variable 
        return output;
    }
}