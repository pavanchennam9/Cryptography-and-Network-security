import java.util.Scanner; 
class Cipher { 
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter text (uppercase only): "); 
String text = sc.nextLine(); String caesar = ""; 
for(char ch : text.toCharArray()) {
 if(Character.isLetter(ch)) 
caesar += (char)((ch - 'A' + 3) % 26 + 'A');
 else caesar += ch; 
 System.out.println("Caesar: " + caesar); 
String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
String c = "QWERTYUIOPASDFGHJKLZXCVBNM"; 
String sub = ""; 
for(char ch : text.toCharArray()) { 
if(Character.isLetter(ch))
  sub += c.charAt(p.indexOf(ch)); 
else sub += ch;
} 
System.out.println("Substitution: " + sub);
 int[][] key = { {3, 3}, {2, 5} };
 text = text.replaceAll(" ", ""); 
if(text.length() % 2 != 0) text += "X";
 String hill = ""; 
for(int i = 0; i < text.length(); i += 2) {
int a = text.charAt(i) - 'A'; 
int b = text.charAt(i+1) - 'A';
 int c1 = (key[0][0]*a + key[0][1]*b) % 26;
 int c2 = (key[1][0]*a + key[1][1]*b) % 26; 
hill += (char)(c1 + 'A'); 
  hill += (char)(c2 + 'A'); } 
System.out.println("Hill: " + hill);
 sc.close(); 
} 
}
