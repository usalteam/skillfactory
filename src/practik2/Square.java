package practik2;

public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double area() {
        return Math.pow(super.a, 2);
    }

    @Override
    public double perimeter() {
        return 4*super.a;
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(2*Math.pow(super.a, 2));
    }

    @Override
    double getHeight() {
        return super.a;
    }

    @Override
    String getColor() {
        return super.color;
    }
}
