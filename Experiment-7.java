import javax.crypto.Cipher; 
import javax.crypto.SecretKey;
 import java.security.KeyStore; 
import java.util.Base64; 
import java.io.FileInputStream;
 import java.util.Scanner;
 public class BlowfishUserInput { public static void main(String[] args) { try 
{ Scanner sc = new Scanner(System.in);
 // 🔹 User Input 
System.out.print("Enter text: "); 
String plaintext = sc.nextLine(); 
// 🔹 Load KeyStore 
KeyStore keyStore = KeyStore.getInstance("JCEKS");
 FileInputStream fis = new FileInputStream("mykeystore.jks"); 
keyStore.load(fis, "password".toCharArray()); 
// replace with your password // 🔹 Get Secret Key
SecretKey key = (SecretKey) keyStore.getKey("myblowfishkey", "password".toCharArray()); // 🔹 Display Key 
String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
 System.out.println("Secret Key: " + encodedKey);
 // 🔹 Encryption Cipher cipher = Cipher.getInstance("Blowfish"); cipher.init(Cipher.ENCRYPT_MODE, key); 
byte[] encrypted = cipher.doFinal(plaintext.getBytes());
 String encryptedText = Base64.getEncoder().encodeToString(encrypted);
 System.out.println("Encrypted Text: " + encryptedText);
 // 🔹 Decryption cipher.init(Cipher.DECRYPT_MODE, key); 
byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
 String decryptedText = new String(decrypted); 
System.out.println("Decrypted Text: " + decryptedText); }
 catch (Exception e) 
   {
 e.printStackTrace();
   } 
  }
}
