package practic1;

public class ToLine {
    int[][] data;


    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] result = new int[data.length * data[0].length];
        int i = 0;
        for (int[] element: data) {
            for (int element1: element) {
                result[i] = element1;
                i++;
            }


        }
        return result;
    }
}
