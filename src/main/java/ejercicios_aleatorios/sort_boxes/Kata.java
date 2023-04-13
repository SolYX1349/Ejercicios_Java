package ejercicios_aleatorios.sort_boxes;

public class Kata {
    public static int[] flip(char dir, int[] arr) {
        if (String.valueOf(dir).equals("R")) {
            arr = rightOption(arr);
        } else {
            arr = leftOption(arr);
        }
        return arr;
    }

    private static int[] rightOption(int[] arr) {
        int auxiliar;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    if (arr[i] < arr[j]) {
                        auxiliar = arr[j];
                        arr[j] = arr[i];
                        arr[i] = auxiliar;
                    }
                }
            }
        }
        return arr;
    }

    private static int[] leftOption(int[] arr) {
        int auxiliar;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    if (arr[i] > arr[j]) {
                        auxiliar = arr[j];
                        arr[j] = arr[i];
                        arr[i] = auxiliar;
                    }
                }
            }
        }
        return arr;
    }
}