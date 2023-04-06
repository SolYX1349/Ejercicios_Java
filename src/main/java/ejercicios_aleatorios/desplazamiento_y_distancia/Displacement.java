package ejercicios_aleatorios.desplazamiento_y_distancia;

public class Displacement {
    public static int[] twoSum(int[] arrayNumbers, int expectedSum) {
        int[] indexValid = new int[2];
        if (arrayNumbers.length >= 1) {
            for (int i = 0; i < arrayNumbers.length - 1; i++) {
                for (int j = arrayNumbers.length - 1; j >= 1; j--) {
                    if (j != i) {
                        if (arrayNumbers[i] + arrayNumbers[j] == expectedSum) {
                            indexValid[0] = i;
                            indexValid[1] = j;
                            break;
                        }
                    }
                }
            }
        }
        return indexValid;
    }
}
