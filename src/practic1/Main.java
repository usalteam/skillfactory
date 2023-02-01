package practic1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Balance balance = new Balance();
//        balance.addLeft(3);
//        balance.addRight(5);
//        System.out.println(balance.getSituation());
//
//        Bell bell = new Bell();
//        bell.sound();
//        bell.sound();
//        bell.sound();
//        bell.sound();
//
//        Payer payer = new Payer("Усов", "Александр", "Москва", "0022");
//        System.out.println(payer.toString());
//
//        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
//        System.out.println(r.getWidth() + " " + r.getHeight());
//        System.out.println(r.getBorders());

//        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
//        int[][] arr = a.resize();
//        System.out.println(Arrays.toString(arr));
//
//        ToLine a1 = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
//        int[] arr1 = a1.resize();
//        System.out.println(Arrays.toString(arr1));

//        Mage mage1 = new Mage("test1", 10, 15, "fire");
//        System.out.println(mage1.getInfo());
//        Mage mage2 = new Mage("test2", 10, 16, "ice");
//        System.out.println(mage2.getInfo());
//        System.out.println(Mage.fight(mage1, mage2));
        TicTacToe board = new TicTacToe();
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.makeMove(1, 1));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(1, 2));
//*Выводим поле в консоль, используя метод getField();
        System.out.println(board.makeMove(2, 1));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(3, 1));
        System.out.println(board.makeMove(2, 2));
//*Выводим поле в консоль, используя метод getField();
    }
}
