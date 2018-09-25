/*Vowel or Consonant or invalid*/


#include <stdio.h>
 
int main()
{
  char ch;
 scanf("%c", &ch);
 
  if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' &&ch <= 'Z')) {
    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  
      printf("Vowel");
    else
      printf("Consonant");
  }
  else
    printf("invalid");
    return 0;
}
