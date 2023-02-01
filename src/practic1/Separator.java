package practic1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int[] result = new int[99];
        int i =0;
        for (int element: array) {
            if (element%2==0) {
                result[i] = element;
                i++;
            }
        }
        return result;
    }

    public int[] odd() {
        int[] result = new int[99];
        int i =0;
        for (int element: array) {
            if (element%2!=0) {
                result[i] = element;
                i++;
            }
        }
        return result;
    }
}
