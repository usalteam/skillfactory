package module8;
public class Player extends Human {
    public Backpack backpack = new Backpack();

    public Player(String n) {
        super(n);
    }

    public void take(String n) {
        this.backpack.add(n);
    }

    class Backpack {
        String[] backpack = new String[10];
        int i = 0;

        public void add(String n) {
            this.backpack[i] = n;
            this.i++;
        }

        public String toString() {

            if (i == 0) {
                return "the backpack is empty";
            } else {
                String result = "";
                boolean isFirst = true;
                for (int z = 0; z < i; z++) {
                    if (isFirst) {
                        isFirst = false;
                    } else {
                        result = result + ",";
                    }
                    result = result + backpack[z];
                }
                return result;
            }
        }
    }
}
