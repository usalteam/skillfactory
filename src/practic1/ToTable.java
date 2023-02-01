package practic1;

public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] array, int x, int y) {
        this.data = array;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] result = new int[x][y];
        int ix = 0;
        int iy = 0;
        for (int element: data) {
            result[ix][iy] = element;
            iy ++;
            if (iy == y) {
                ix ++;
                iy = 0;
            }
            if (ix == x) {
                break;
            }

        }
        return result;
    }
}