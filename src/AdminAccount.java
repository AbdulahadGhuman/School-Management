
import java.util.Scanner;

public class AdminAccount extends Account {
    private static final Scanner Keyboard = new Scanner (System.in);
    public static void createNewAccount () {
        CreateAccount.CreateAccount();
    }
    public static void main (String [] args) {
        if (VerifyAccount.VerifyAccount().equals("Account Type: Administrator")) {
            System.out.println("Select option the following numbers\n1: Create New Account");
            if (Keyboard.nextLine().equals("1")) {
                createNewAccount();
            }
        }
    }
}
