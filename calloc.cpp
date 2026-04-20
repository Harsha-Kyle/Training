#include <stdio.h>
#include <stdlib.h>

int main() {
int *ptr; int n = 3;
ptr=(int*)calloc(n, sizeof(int));
for(int i=0; i<n; i++) {
printf("%d", ptr[i]); 
}
free(ptr); return 0;
}
