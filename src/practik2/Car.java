package practik2;

public class Car extends Transport {
    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    boolean canMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        }
        return false;
    }

    @Override
    int getFuelLevel() {
        return fuel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
/*    String carModel;
    public Car(String carModel) {
        this.carModel = carModel;
    }

    static class Engine {
        Boolean isWorking = false;
        Integer horsepower;

        public Engine(Integer horsepower) {
            this.horsepower = horsepower;
        }

        String startStopEngine() {
            isWorking = !isWorking;
            if (isWorking) {
                return "engine was started";
            }
            else {
                return "engine was stopped";
            }
        }
    }
}*/
