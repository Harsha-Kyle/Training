#include <stdio.h>

int main() {
    int c, d;
    int b = 0;

    while(1) {
        printf("\n==== SBI ===\n");
        printf("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit\nEnter choice: ");
        scanf("%d", &c);

        switch(c) {
            case 1:
                printf("Enter amount to deposit: ");
                scanf("%d", &d);
                b = b + d;
                printf("Current balance = %d\n", b);
                break;

            case 2:
                printf("Enter amount to withdraw: ");
                scanf("%d", &d);
                if(b - d < 0) {
                    printf("Not enough balance\n");
                } else {
                    b = b - d;
                    printf("Withdrawn amount: %d\n", d);
                    printf("Current balance = %d\n", b);
                }
                break;

            case 3:
                printf("Current balance = %d\n", b);
                break;

            case 4:
                printf("Thank you!\n");
                return 0;

            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}
