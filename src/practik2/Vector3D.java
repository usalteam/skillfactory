package practik2;

public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    double getLength() {
        String cords = getVectorCords();
        return Math.sqrt(Math.pow(Integer.parseInt(cords.split(" ")[0]), 2)
                + Math.pow(Integer.parseInt(cords.split(" ")[1]), 2)
                + Math.pow(Integer.parseInt(cords.split(" ")[2]), 2));
    }

    @Override
    String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1) + " " + (z2 - z1);
    }

    double getScalarProduct(Vector3D vector3D) {
        String cords = getVectorCords();
        String cords2 = vector3D.getVectorCords();
        return Integer.parseInt(cords.split(" ")[0])*Integer.parseInt(cords2.split(" ")[0]) +
                Integer.parseInt(cords.split(" ")[1])*Integer.parseInt(cords2.split(" ")[1]) +
                Integer.parseInt(cords.split(" ")[2])*Integer.parseInt(cords2.split(" ")[2]);
    }
}
