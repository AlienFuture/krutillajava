package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Utils.Logger;
import java.security.MessageDigest;

public class GeneralService {
    public String encryptPassword(String password) {
        String encryptedpassword = null;
        try {
            /* MessageDigest instance for MD5. */
            MessageDigest m = MessageDigest.getInstance("MD5");

            /* Add plain-text password bytes to digest using MD5 update() method. */
            m.update(password.getBytes());

            /* Convert the hash value into bytes */
            byte[] bytes = m.digest();

            /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            /* Complete hashed password in hexadecimal format */
            encryptedpassword = s.toString();
        } catch (Exception e) {
             Logger.log("Could not encrypt password because of " + e.getMessage(), LogType.INFO);
        }

        return encryptedpassword;
    }
}
