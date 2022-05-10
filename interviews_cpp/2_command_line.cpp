#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(int argc, char** argv) {
   printf("%d\n",argc);
   printf("%s\n",argv[argc-1]);
   return 0;
}