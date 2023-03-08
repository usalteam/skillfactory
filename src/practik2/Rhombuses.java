package practik2;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha;
    double beta;
    public Rhombuses (int a,  double alpha,  double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return Math.pow(super.a, 2) * Math.sin(Math.toRadians(this.alpha));
    }

    @Override
    public double perimeter() {
        return 4*super.a;
    }

    @Override
    double getLargeDiagonal() {
        if (this.beta > this.alpha) {
            return (2 * super.a * Math.sin(Math.toRadians(this.beta / 2)));
        }
        return (2 * super.a * Math.sin(Math.toRadians(this.alpha / 2)));
    }

    @Override
    double getHeight() {
        return area() / super.a;
    }

    @Override
    String getColor() {
        return super.color;
    }
}
