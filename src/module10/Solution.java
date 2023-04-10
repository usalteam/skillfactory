package module10;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public class Solution {
    public static String getReceipt() throws IOException {
        Scanner in = new Scanner(new FileInputStream("src/module10/Receipt.txt"));
        double sumR = 0;

        while (in.hasNextLine()) {
            String[] productInfo = in.nextLine().split(";");
            sumR += Integer.parseInt(productInfo[1]) * Double.parseDouble(productInfo[2]);
        }

        return Double.toString(sumR);
    }
}
