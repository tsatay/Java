import java.util.Scanner;

public class Main {
    /*
        * Create a method for allowing a user to log into a website.
        * The method should contain two parameters - username and password.
        * In the method, if the username equals "neo" and the password equals "followthewhiterabbit" print, "Welcome, Neo".
        * Otherwise, print "Invalid username or password".
        * Invoke the method.
    **/
    
    public static void main(String[] args) {
        //Create a Scanner instance
        Scanner input = new Scanner(System.in);
        //Let the user to input a Username
        System.out.println("Enter the Username.");
        //Store a Username to variable called usernameInput in a lowerCase
        String usernameInput = input.nextLine().toLowerCase();
        //Let the user to input a Password
        System.out.println("Enter the Password.");
        //Store a Password to a variable called passwordInput in a lowerCase
        String passwordInput = input.nextLine().toLowerCase();
        //Calling a method to check a user input and display a result
        System.out.println(userLogin(usernameInput, passwordInput));
    }


    private static String userLogin(String username, String password){
        //a variable to hold the result value
        String loginValidation;
        //checking a user input and assign a Sting value to the variable loginValidation
        loginValidation = username.equals("neo") && password.equals("followthewhiterabbit")
                            ?"Welcome, Neo"
                            :"Invalid Username and Password";


        return loginValidation;
    }
}