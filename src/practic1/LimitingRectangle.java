package practic1;

public class LimitingRectangle {
    int points[][];

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {
        int minx = points[0][0];
        int maxx = points[0][0];
        for (int[] point : points) {
            if (minx > point[0]) {
                minx = point[0];
            }
            if (maxx < point[0]) {
                maxx = point[0];
            }
        }

        return maxx - minx;
    }

    public int getHeight() {
        int miny = points[0][1];
        int maxy = points[0][1];
        for (int[] point : points) {
            if (miny > point[1]) {
                miny = point[1];
            }
            if (maxy < point[1]) {
                maxy = point[1];
            }
        }

        return maxy - miny;
    }

    public String getBorders() {
        int minx = points[0][0];
        int maxx = points[0][0];
        int miny = points[0][1];
        int maxy = points[0][1];
        for (int[] point : points) {
            if (minx > point[0]) {
                minx = point[0];
            }
            if (maxx < point[0]) {
                maxx = point[0];
            }
            if (miny > point[1]) {
                miny = point[1];
            }
            if (maxy < point[1]) {
                maxy = point[1];
            }

        }
        return miny + " " + maxy  + " " + minx + " " + maxx;

    }

}
