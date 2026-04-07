import java.math.BigInteger; 
import java.util.Scanner;
 public class RSAProgram { public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter p: ");
 BigInteger p = sc.nextBigInteger();
 System.out.print("Enter q: "); 
BigInteger q = sc.nextBigInteger(); 
BigInteger n = p.multiply(q); 
BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
   System.out.print("Enter e: "); 
BigInteger e = sc.nextBigInteger();
 BigInteger d = e.modInverse(phi); 
System.out.println("Public Key (e, n): (" + e + ", " + n + ")");
 System.out.println("Private Key (d, n): (" + d + ", " + n + ")");
 System.out.print("Enter message: "); 
BigInteger m = sc.nextBigInteger(); 
BigInteger c = m.modPow(e, n);
 System.out.println("Encrypted: " + c);
 BigInteger decrypted = c.modPow(d, n);
 System.out.println("Decrypted: " + decrypted);
 }
}
