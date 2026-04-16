#include <stdio.h>
int main(){
	int a =5;
	int *p=&a;
	printf("\nvalue of a = %d",a);
	printf("\naddress of a = %d",&a);
	printf("\naddress of a from p = %d",p);
	printf("\nvalue of a from p = %d",*p);

	
}
