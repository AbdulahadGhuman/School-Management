import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Hash {
    public static StringBuilder hashPassword (String newPassword) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(newPassword.getBytes(StandardCharsets.UTF_8));
            return toHexadecimal(encodedHash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
            return null;
        }
    }
    private static StringBuilder toHexadecimal (byte [] newByteArray) {
        StringBuilder HexadecimalValue = new StringBuilder ();
        for (int i = 0; i < newByteArray.length; i++) {
            HexadecimalValue.append(String.format("%02X ", newByteArray[i]));
        }
        return HexadecimalValue;
    }
}
