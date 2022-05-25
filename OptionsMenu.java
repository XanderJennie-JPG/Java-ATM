import java.util.Scanner;

public class OptionsMenu {
    static int cardno;
    static int password;

    public static void main() {
        CreateAccount();
        Login();
    }
// User creates their own Card-number and password combination
    public static void CreateAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account setup");
        System.out.println("Card Number:");
        int cardno = sc.nextInt();//card-number is stored
        System.out.println("Password:");
        int password = sc.nextInt();//password is stored
    }
//User logs in with previous card-number and password combination
    public static void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Log in:");
        System.out.println("Card Number:");
        int fcardno = sc.nextInt();//filled in card-number
        System.out.println("Password:");
        int fpassword = sc.nextInt();//filled in password

        if (fcardno == cardno && fpassword == password) { // checks if filled in card-number && password are the same as the one stored during account creation
            System.out.println("logged in");
        } else {
            System.out.println("Incorrect credentials");
        }
    }
}

