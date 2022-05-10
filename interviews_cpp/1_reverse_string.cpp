#include <stdio.h>
#include <string.h>

void swap(char* a, char * b){
   char c = *a;
   *a = *b;
   *b = c;
   return;
}

void reverseString(char* s)
{  
  int n = strlen(s);
  for(int i = 0;i<n/2; i++)
  {
    swap(s+i,s+n-i-1);
  }
  return;
}

int main() {
   char greeting[] = "Hello";
   reverseString(greeting);
   printf("%s",greeting);
   return 0;
}