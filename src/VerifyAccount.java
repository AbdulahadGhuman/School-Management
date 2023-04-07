import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class VerifyAccount {
    private static final File AccountsFile = new File("Accounts.txt");
    private static Scanner AccountReader;
    private static String UsernameInput;
    private static String PasswordInput;
    private static String AccountType;
    private static final Scanner Keyboard = new Scanner (System.in);
    public static String VerifyAccount () {
        try {
            System.out.println("Enter a Username: ");
            UsernameInput = Keyboard.nextLine();
            System.out.println("Enter a Password: ");
            PasswordInput = Hash.hashPassword(Keyboard.nextLine()).toString();
            AccountReader = new Scanner (AccountsFile);
            while (AccountReader.hasNextLine()) {
                String accountData = AccountReader.nextLine();
                if (accountData.startsWith("Username: " + UsernameInput + ", Password: " + PasswordInput)) {
                    return accountData.substring(accountData.indexOf("Account Type: "));
                } 
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }
}
