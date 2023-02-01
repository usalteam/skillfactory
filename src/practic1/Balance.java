package practic1;

public class Balance {
    static int right = 0;
    static int left = 0;

    public void addRight(int n) {
        right += n;
    }

    public void addLeft(int n) {
        left += n;
    }

    public char getSituation() {
        if (left == right) {
            return '=';
        }
        else if (left > right) {
            return 'L';
        }

        else {
            return 'R';
        }
    }
}
