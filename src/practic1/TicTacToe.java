package practic1;

public class TicTacToe {
    char[][] game = new char[][]{{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    private boolean isFinish = false;
    private char gamer = 'X';


    public TicTacToe() {
        newGame();
    }
    void newGame() {
        this.isFinish = false;
        this.gamer = 'X';
        this.game = new char[][]{{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
    }
    public char[][] getField() {
        return game;
    }

    String checkGame () {
        if (game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X'
                || game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X'
                || game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X'
                || game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X'
                || game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X'
                || game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X'
                || game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X'
                || game[2][0] == 'X' && game[1][1] == 'X' && game[0][2] == 'X') {
            this.isFinish = true;
            return "X";
        }
        else if (game[0][0] == '0' && game[1][0] == '0' && game[2][0] == '0'
                || game[0][1] == '0' && game[1][1] == '0' && game[2][1] == '0'
                || game[0][2] == '0' && game[1][2] == '0' && game[2][2] == '0'
                || game[0][0] == '0' && game[0][1] == '0' && game[0][2] == '0'
                || game[1][0] == '0' && game[1][1] == '0' && game[1][2] == '0'
                || game[2][0] == '0' && game[2][1] == '0' && game[2][2] == '0'
                || game[0][0] == '0' && game[1][1] == '0' && game[2][2] == '0'
                || game[2][0] == '0' && game[1][1] == '0' && game[0][2] == '0') {
            this.isFinish = true;
            return "0";
        }
        else {
            for (char line[]: game) {
                for (char cell: line) {
                    if (cell == '-') {
                        return null;
                    }
                }
            }
            this.isFinish = true;
            return "D";
        }
    }

    public String makeMove(int x, int y) {
        x--;
        y--;
        if (isFinish) {
            return "Game was ended";
        }
        else if (game[x][y] != '-') {
            return "Cell x, y is already occupied";
        }
        else {
            game[x][y] = gamer;
            gamer = gamer == 'X' ? '0': 'X';
            String checkGame = this.checkGame();
            if (checkGame == null) {
                return "Move completed";
            }
            else if (checkGame.equals("D")) {
                return "Draw";
            }
            else if (checkGame.equals("X")) {
                return "Player X won";
            }
            else {
                return "Player 0 won";
            }
        }
    }


}


