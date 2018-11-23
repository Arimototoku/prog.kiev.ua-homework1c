package ua.i.sonne;

public class Vector3dTest {
    public static void main(String[] args) {
        Vector3d vectorOne = new Vector3d(1,3,7);
        Vector3d vectorTwo = new Vector3d(3,1,2);

        System.out.println("Вектор один : ");
        System.out.println(vectorOne);

        System.out.println("\nВектор два : ");
        System.out.println(vectorTwo);

        Vector3d vectorThree = Vector3d.vectorAddition(vectorOne,vectorTwo);
        System.out.println("\nРезультат сложения векторов: ");
        System.out.println(vectorThree);

        System.out.println("\nСкалярное произведение векторов один и два = " + Vector3d.scalarMultiplication(vectorOne,vectorTwo));

        Vector3d vectorFour = Vector3d.vectorMultiplication(vectorOne,vectorTwo);
        System.out.println("\nВекторное произведение векторов один и два \n" + vectorFour);

    }
}
