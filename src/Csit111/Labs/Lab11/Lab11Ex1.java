package Csit111.Labs.Lab11;

public class Lab11Ex1 {

    public static void main(String[] args) {
        squareArray(5);
        squareArray(3);
    }

    public static void squareArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            int square = i * i;
            arr[i] = square;
        }

    }
}
