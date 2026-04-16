#include <stdio.h>

#define RED   "\033[1;31m"
#define GREEN "\033[1;32m"
#define BLUE  "\033[1;34m"
#define YELLOW "\033[1;33m"
#define RESET "\033[0m"

#define PI 3.14

void triangle() {
    float base, height;
    float *b = &base, *h = &height;

    printf("\nEnter base: ");
    scanf("%f", b);
    printf("Enter height: ");
    scanf("%f", h);

    float area = 0.5 * (*b) * (*h);
    printf(GREEN "Area of Triangle = %.2f\n" RESET, area);
}

void square() {
    float side;
    float *s = &side;

    printf("\nEnter side: ");
    scanf("%f", s);

    printf(GREEN "Area = %.2f\n" RESET, (*s) * (*s));
    printf(BLUE "Perimeter = %.2f\n" RESET, 4 * (*s));
}

void rectangle() {
    float l, w;
    float *pl = &l, *pw = &w;

    printf("\nEnter length: ");
    scanf("%f", pl);
    printf("Enter width: ");
    scanf("%f", pw);

    printf(GREEN "Area = %.2f\n" RESET, (*pl) * (*pw));
    printf(BLUE "Perimeter = %.2f\n" RESET, 2 * ((*pl) + (*pw)));
}

void circle() {
    float r;
    float *pr = &r;

    printf("\nEnter radius: ");
    scanf("%f", pr);

    printf(GREEN "Area = %.2f\n" RESET, PI * (*pr) * (*pr));
    printf(YELLOW "Circumference = %.2f\n" RESET, 2 * PI * (*pr));
}

int main() {
    int choice;

    do {
        printf("\nMINI GEOMETRY TOOLKIT\n");
        printf("1. Triangle\n");
        printf("2. Square\n");
        printf("3. Rectangle\n");
        printf("4. Circle\n");
        printf("5. Exit\n");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1: triangle(); break;
            case 2: square(); break;
            case 3: rectangle(); break;
            case 4: circle(); break;
            case 5: printf("Exiting...\n"); break;
            default: printf("Invalid choice\n");
        }

    } while(choice != 5);

    return 0;
}
