#include <stdio.h>
int main(){
	int a[3] ={1,2,3};
	int *p=&a[0];
	printf("\nvalue of a[1]",*p);
	printf("\nvalue of a = %d",*(p+1));
	printf("\nvalue of a = %d",*(p+2));
}
