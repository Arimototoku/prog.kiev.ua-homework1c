package ua.i.sonne;

public class Vector3d {

    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * This method do addition of two vectors
     * @param vectorOne
     * @param vectorTwo
     * @return new vector - result of vector addition of the two vectors
     */
    public static Vector3d vectorAddition(Vector3d vectorOne, Vector3d vectorTwo){

        return new Vector3d(vectorOne.x + vectorTwo.x, vectorOne.y + vectorTwo.y,vectorOne.z + vectorTwo.z);
    }

    /**
     * This method do scalar multiplication of two vectors
     * @param vectorOne
     * @param vectorTwo
     * @return double - result of the scalar multiplication of two vectors
     */
    public static double scalarMultiplication(Vector3d vectorOne, Vector3d vectorTwo){
        return vectorOne.x * vectorTwo.x + vectorOne.y * vectorTwo.y + vectorOne.z * vectorTwo.z;
    }

    /**
     * This method do vector multiplication of two vectors
     * a × b = {aybz - azby; azbx - axbz; axby - aybx}
     * @param vectorOne
     * @param vectorTwo
     * @return new vector result of the vector multiplication of two vectors
     */
    public static Vector3d vectorMultiplication(Vector3d vectorOne, Vector3d vectorTwo){
        return new Vector3d(vectorOne.y * vectorTwo.z - vectorOne.z * vectorTwo.y,
                            vectorOne.z * vectorTwo.x - vectorOne.x * vectorTwo.z,
                            vectorOne.x * vectorTwo.y - vectorOne.y * vectorTwo.x);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
