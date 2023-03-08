package Chess;
public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        //Вышел за поле
        //Остался на месте
        //Игрок ходит на клетку, где уже есть фигура того же цвета
        //Ход дальше чем на клетку
        if (toLine>7 || toLine < 0 || toColumn > 7 || toColumn < 0
                || (line == toLine && column == toColumn)
                || (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor()))
                || Math.abs(line - toLine) > 1 || Math.abs(column - toColumn) > 1){
            return false;
        }

        //Нет препятствий
        return true;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null && !getColor().equals(board.board[i][j].getColor()) && board.board[i][j].canMoveToPosition(board, i, j, line, column))  {
                    return true;
                }
            }

        }
        return false;
    }
}

