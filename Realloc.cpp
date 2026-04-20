#include <stdio.h>
#include <stdlib.h>
int main() {

int *ptr, n,new_size;

printf("Enter number of elements: ");
scanf("%d", &n);
ptr=(int*) malloc(n* sizeof(int));

printf("Enter elements : \n"); 
for(int i=0; i<n; i++) { 
scanf("%d", &ptr[i]);
}
printf("Enter new size : \n");
scanf("%d", &new_size);

ptr=(int*) realloc(ptr, new_size * sizeof(int));

printf("Enter elements : \n"); 
for(int i=0; i<new_size; i++) { 
scanf("%d", &ptr[i]);
}
free(ptr);
printf("Memory freed");
return 0;
}
