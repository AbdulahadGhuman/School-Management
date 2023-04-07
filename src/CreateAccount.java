import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CreateAccount {
    private static final Scanner Keyboard = new Scanner (System.in);
    private static FileWriter AccountWriter;
    public static void CreateAccount () {
        try {
            AccountWriter = new FileWriter ("Accounts.txt", true);
            Account NewAccount = new Account ();
            System.out.println("Enter a Username: ");
            NewAccount.setUsername(Keyboard.nextLine());
            System.out.println("Enter a Password: ");
            NewAccount.setPassword(Hash.hashPassword(Keyboard.nextLine()).toString());
            System.out.println("Enter an Account Type: ");
            NewAccount.setAccountType(Keyboard.nextLine());
            while (!NewAccount.getAccountType().equals("Administrator") && !NewAccount.getAccountType().equals("Teacher") && !NewAccount.getAccountType().equals("Student")) {
                System.out.println("Invalid account type. Enter an Account Type: ");
                NewAccount.setAccountType(Keyboard.nextLine());
            }
            AccountWriter.write("Username: " + NewAccount.getUsername() + ", Password: " + NewAccount.getPassword() + ", Account Type: " + NewAccount.getAccountType() + "\n");
            AccountWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
