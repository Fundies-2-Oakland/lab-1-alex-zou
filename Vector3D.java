public class Vector3D {
    private double x;
    private double y;
    private double z;


    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(5, 6, 7);
        System.out.println(vector1.getX());
        System.out.println(vector1.getY());
        System.out.println(vector1.getZ());


    }
}