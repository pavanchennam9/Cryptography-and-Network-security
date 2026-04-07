import javax.crypto.*;
import javax.crypto.SecretKeySpec;
 import java.util.*;
 public class Blowfish { public static void main(String[] args) throws Exception
 { 
   Scanner s = new Scanner(System.in); 
System.out.println("Enter key: ");
 byte[] k = s.nextLine().getBytes();
 SecretKey key = new SecretKeySpec(k, "Blowfish"); 
System.out.println("Enter Text: ");
 String msg = s.nextLine();
 Cipher c = Cipher.getInstance("Blowfish");
 c.init(Cipher.ENCRYPT_MODE, key); 
   byte[] enc = c.doFinal(msg.getBytes()); 
  System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(enc)); 
  c.init(Cipher.DECRYPT_MODE, key);
 System.out.println("Decrypted: " + new String(c.doFinal(enc)));
 }
}
