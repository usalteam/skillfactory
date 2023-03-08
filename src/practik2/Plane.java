package practik2;

public class Plane extends Transport{
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    boolean canMove(int n) {
        return false;
    }

    @Override
    int getFuelLevel() {
        return super.fuel;
    }

    void fillFuel(int n) {
        super.fuel += n;
    }
}
