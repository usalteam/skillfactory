package Chess;

public class Horse extends ChessPiece{
    public Horse(String color) {
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
        //Ход не Г
        if (toLine>7 || toLine < 0 || toColumn > 7 || toColumn < 0
                || (line == toLine && column == toColumn)
                || (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor()))
                || !(Math.abs(line - toLine) == 2 && Math.abs(column - toColumn) == 1
                || Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 2)) {
            return false;
        }

        //перепрыгивает препятствия
        return true;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

}
