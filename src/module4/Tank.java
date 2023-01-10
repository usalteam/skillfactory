package module4;

public class Tank {
    int position;

    public Tank() {
        position = 0;
    }

    public static void main(String[] args) {

    }

    void goForward(int a) {
        position += a;
    }
    void goBackward(int a) {
        position -= a;
    }
    void printPosition() {
        String string = String.format("The Tank is at %d now.", position);
        System.out.println(string);
    }
}
