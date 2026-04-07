import javax.crypto.Cipher; 
import javax.crypto.KeyGenerator; 
import javax.crypto.SecretKey;
import java.util.Base64; 
import java.util.Scanner;
public class DES { 
public static void main(String[] args) throws Exception {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter plain text: ");
 String plaintext = sc.nextLine(); // Generate DES Key 
KeyGenerator keyGen = KeyGenerator.getInstance("DES"); 
SecretKey key = keyGen.generateKey();
// Encryption 
Cipher cipher = Cipher.getInstance("DES");
 cipher.init(Cipher.ENCRYPT_MODE, key); 
byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
 String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes); 
  System.out.println("Encrypted Text: " + encryptedText);
 // Decryption
 cipher.init(Cipher.DECRYPT_MODE, key);
 byte[] decryptedBytes = cipher.doFinal(encryptedBytes); 
String decryptedText = new String(decryptedBytes); 
System.out.println("Decrypted Text: " + decryptedText);
  sc.close();
}
} 
