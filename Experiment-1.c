#include<stdio.h>
int main()
{
 char str[100];
 printf("Enter a string: "); 
scanf("%99[^\n]", str); 
for(int i = 0; str[i] != '\0'; i++) 
str[i] ^= 0; 
printf("String after XOR with 0: %s\n", str); 
return 0; 
}
