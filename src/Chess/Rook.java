package Chess;

public class Rook extends ChessPiece{
    public Rook(String color) {
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
        //Ход не по линии
        if (toLine>7 || toLine < 0 || toColumn > 7 || toColumn < 0
                || (line == toLine && column == toColumn)
                || (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor()))
                || (line != toLine && column != toColumn)) {
            return false;
        }

        //Направление движения
        int i1 = Integer.compare(toLine, line);
        int i2 = Integer.compare(toColumn, column);

        //Нет препятствия
        for (int i = 1; i < Math.abs(line - toLine) + Math.abs(column - toColumn); i++) {
            if (chessBoard.board[line+i*i1][column+i*i2] != null) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

}
