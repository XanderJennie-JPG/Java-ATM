import java.util.Scanner;

public class OptionsMenu {
    static int cardno;
    static int password;

    public static void main() {
        CreateAccount();
        Login();
    }

    public static void CreateAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Account setup");
        System.out.println("Card Number:");
        int cardno = sc.nextInt();
        System.out.println("Password:");
        int password = sc.nextInt();
    }

    public static void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Log in:");
        System.out.println("Card Number:");
        int fcardno = sc.nextInt();
        System.out.println("Password:");
        int fpassword = sc.nextInt();

        if (fcardno == cardno && fpassword == password) {
            System.out.println("logged in");
        } else {
            System.out.println("Incorrect credentials");
        }
    }
}

