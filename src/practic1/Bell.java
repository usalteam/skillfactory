package practic1;

public class Bell {
    static int count = 0;

    public void sound() {
        count ++;
        if (count % 2 == 1) {
            System.out.println("ding");
        }
        else {
            System.out.println("dong");
        }
    }

}
