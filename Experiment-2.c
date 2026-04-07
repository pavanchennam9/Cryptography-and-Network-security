#include<stdio.h>
 int main()
 { char text[100]; int key = 127;
 printf("Enter a string: "); 
  scanf("%99[^\n]", text); printf("\nChar\tASCII\tAND\tOR\tXOR\n"); 
printf("----------------------------------------\n"); 
for(int i = 0; text[i] != '\0'; i++) {
 int ascii = text[i];
 int andRes = ascii & key; 
int orRes = ascii | key;
 int xorRes = ascii ^ key;
 printf("%c\t%d\t%d\t%d\t%d\n", text[i], ascii, andRes, orRes, xorRes); }
 return 0;
 }
