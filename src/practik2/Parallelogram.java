package practik2;

public class Parallelogram extends Quadrangle implements Figure{
    double alpha;
    double beta;
    public Parallelogram (int a, int b, double alpha,  double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return a*b* Math.sin(Math.toRadians(alpha));
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }

    @Override
    double getLargeDiagonal() {
        if (this.alpha > this.beta) {
            return Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(Math.toRadians(alpha)));
        }
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(Math.toRadians(beta)));
    }

    @Override
    double getHeight() {
        double h1 = super.a * Math.sin(Math.toRadians(alpha));
        double h2 = super.b * Math.sin(Math.toRadians(alpha));
        return Math.min(h1, h2);
    }

    @Override
    String getColor() {
        return super.color;
    }
}
