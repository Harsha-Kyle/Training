#include <stdio.h>
int seats = 10;   
int choice, n;
int main() {
    while(1) {
        printf("\n=== Train Booking ===\n");
        printf("1.Book Ticket\n2.Cancel Ticket\n3.Available Seats\n4.Exit\n");
        scanf("%d", &choice);
        switch(choice) {
            case 1: 
                printf("Enter number of seats: ");
                scanf("%d", &n);
                if(n <= seats) {
                    seats -= n;
                    printf("Booked successfully\n");
                } else {
                    printf("Not enough seats\n");
                }
                break;
            case 2: 
                printf("Enter number of seats to cancel: ");
                scanf("%d", &n);
                seats += n;
                printf("Cancelled successfully\n");
                break;
            case 3:
                printf("Available seats: %d\n", seats);
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}
