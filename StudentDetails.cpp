#include <stdio.h>

#define MAX 100

struct Student {
    int id;
    char name[50];
};

int main() {
    struct Student s[MAX];
    int count = 0;
    int choice, i, id, found;

    while(1) {
        printf("\n=== Student Management ===\n");
        printf("1.Insert\n2.Delete\n3.Display\n4.Exit\nEnter choice: ");
        scanf("%d", &choice);

        switch(choice) {

            case 1:
                if(count >= MAX) {
                    printf("List is full\n");
                } else {
                    printf("Enter ID: ");
                    scanf("%d", &s[count].id);
                    printf("Enter Name: ");
                    scanf("%s", s[count].name);
                    count++;
                    printf("Student added\n");
                }
                break;

            case 2:
                if(count == 0) {
                    printf("No students\n");
                    break;
                }
                printf("Enter ID to delete: ");
                scanf("%d", &id);
                found = 0;

                for(i = 0; i < count; i++) {
                    if(s[i].id == id) {
                        for(int j = i; j < count - 1; j++) {
                            s[j] = s[j + 1];
                        }
                        count--;
                        found = 1;
                        printf("Student deleted\n");
                        break;
                    }
                }

                if(!found) {
                    printf("Student not found\n");
                }
                break;

            case 3:
                if(count == 0) {
                    printf("No students\n");
                } else {
                    printf("\nID\tName\n");
                    for(i = 0; i < count; i++) {
                        printf("%d\t%s\n", s[i].id, s[i].name);
                    }
                }
                break;

            case 4:
                return 0;

            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}
