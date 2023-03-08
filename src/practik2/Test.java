package practik2;

public class Test {
    public static void main(String[] args) {
        boolean check;
        Parallelogram parallelogram = new Parallelogram(1, 2, 60, 120, "Pink");
        Parallelogram parallelogram1 = new Parallelogram(2, 1, 60, 120, "Pink");
        Parallelogram parallelogram2 = new Parallelogram(1, 2, 90, 90, "White");
        Parallelogram parallelogram3 = new Parallelogram(2, 3, 60, 120, "Pink");

        check = parallelogram.getColor().equals("Pink") &&
                parallelogram.getHeight() >= 0.86 && parallelogram.getHeight() <= 0.87 &&
                parallelogram.getLargeDiagonal() >= 2.64 && parallelogram.getLargeDiagonal() <= 2.65 &&
                parallelogram.area() >= 1.73 && parallelogram.area() <= 1.74 &&
                parallelogram.perimeter() == 6 &&

                parallelogram1.getColor().equals("Pink") &&
                parallelogram1.getHeight() >= 0.86 && parallelogram1.getHeight() <= 0.87 &&
                parallelogram1.getLargeDiagonal() >= 2.64 && parallelogram1.getLargeDiagonal() <= 2.65 &&
                parallelogram1.area() >= 1.73 && parallelogram1.area() <= 1.74 &&
                parallelogram1.perimeter() == 6 &&

                parallelogram2.getColor().equals("White") &&
                parallelogram2.getHeight() == 1 &&
                parallelogram2.getLargeDiagonal() >= 2.23 && parallelogram2.getLargeDiagonal() <= 2.24 &&
                parallelogram2.area() == 2 &&
                parallelogram2.perimeter() == 6 &&

                parallelogram3.getColor().equals("Pink") &&
                parallelogram3.getHeight() >= 1.73 && parallelogram3.getHeight() <= 1.74 &&
                parallelogram3.getLargeDiagonal() >= 4.35 && parallelogram3.getLargeDiagonal() <= 4.36 &&
                parallelogram3.area() >= 5.19 && parallelogram3.area() <= 5.20 &&
                parallelogram3.perimeter() == 10;

    }
}
