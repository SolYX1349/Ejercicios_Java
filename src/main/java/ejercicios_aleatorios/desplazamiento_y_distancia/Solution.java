package ejercicios_aleatorios.desplazamiento_y_distancia;

public class Solution {
    public static void main(String[] args){
        int[] arrayPosition = {2, 7, 11, 15};
        for (int item : twoSum(arrayPosition, 9)) {
            System.out.println(item);
        }
    }

    public static int[] twoSum(int[] arrayNumbers, int expectedSum) throws Exception {
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
