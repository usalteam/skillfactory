package practik2;

public class Rectangle extends Quadrangle implements Figure{
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return super.a*super.b;
    }

    @Override
    public double perimeter() {
        return 2*super.a + 2*super.b;
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(super.a, 2) + Math.pow(super.b, 2));
    }

    @Override
    double getHeight() {
        if (super.a<super.b) {
            return super.a;
        }
        return super.b;
    }

    @Override
    String getColor() {
        return super.color;
    }
}
