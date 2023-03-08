package Chess;

public class Pawn extends ChessPiece{
    public Pawn(String color) {
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
        if (toLine>7 || toLine < 0 || toColumn > 7 || toColumn < 0
                || (line == toLine && column == toColumn)
                || (chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor()))) {
            return false;
        }

        //доступные ходы для белых: +1 + 0; +2 + 0 если никого на пути; +1 +1, +1 -1 если на новом месте противник (соратник исключен условием выше)
        if (getColor().equals("White")) {
            return ((toLine - line) == 1 || line == 1 && (toLine - line) == 2) && chessBoard.board[toLine - 1][toColumn] == null
                || (toLine - line) == 1 && Math.abs(toColumn-column) == 1  && chessBoard.board[toLine][toColumn] != null;
        }

        //доступные ходы для черных: -1 + 0 если никого нет на новом месте; -2 + 0 если никого нет на новом месте и на пути; -1 +1, -1 -1 если на новом месте противник (соратник исключен условием выше)
        return ((line - toLine) == 1 || line == 6 && (line - toLine) == 2) && chessBoard.board[toLine + 1][toColumn] == null
                || (line - toLine) == 1 && Math.abs(toColumn-column) == 1  && chessBoard.board[toLine][toColumn] != null;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

}
