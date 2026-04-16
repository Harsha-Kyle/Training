#include <stdio.h>

#define SIZE 3

void display(char (*board)[SIZE]) {
    printf("\n");
    for(int i = 0; i < SIZE; i++) {
        for(int j = 0; j < SIZE; j++) {
            printf(" %c ", *(*(board + i) + j));
            if(j < SIZE - 1) printf("|");
        }
        printf("\n");
        if(i < SIZE - 1) printf("---|---|---\n");
    }
    printf("\n");
}

char checkWinner(char (*board)[SIZE]) {
    for(int i = 0; i < SIZE; i++) {
        if(*(*(board+i)+0) == *(*(board+i)+1) &&
           *(*(board+i)+1) == *(*(board+i)+2))
            return *(*(board+i)+0);

        if(*(*(board+0)+i) == *(*(board+1)+i) &&
           *(*(board+1)+i) == *(*(board+2)+i))
            return *(*(board+0)+i);
    }

    if(*(*(board+0)+0) == *(*(board+1)+1) &&
       *(*(board+1)+1) == *(*(board+2)+2))
        return *(*(board+0)+0);

    if(*(*(board+0)+2) == *(*(board+1)+1) &&
       *(*(board+1)+1) == *(*(board+2)+0))
        return *(*(board+0)+2);

    return ' ';
}

int main() {
    char board[SIZE][SIZE];
    int row, col;
    char player = 'X';

    for(int i = 0; i < SIZE; i++) {
        for(int j = 0; j < SIZE; j++) {
            *(*(board + i) + j) = ' ';
        }
    }

    printf("TIC TAC TOE GAME\n");

    for(int move = 0; move < SIZE * SIZE; move++) {
        display(board);

        printf("Player %c, enter row and column (0-2): ", player);
        scanf("%d %d", &row, &col);

        if(row < 0 || row >= SIZE || col < 0 || col >= SIZE ||
           *(*(board + row) + col) != ' ') {
            printf("Invalid move\n");
            move--;
            continue;
        }

        *(*(board + row) + col) = player;

        char winner = checkWinner(board);
        if(winner != ' ') {
            display(board);
            printf("Player %c wins\n", winner);
            return 0;
        }

        player = (player == 'X') ? 'O' : 'X';
    }

    display(board);
    printf("Draw\n");

    return 0;
}
