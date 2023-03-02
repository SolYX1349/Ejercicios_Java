package parte_1.n5_ejercicios_arreglos.suma_coincidente;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {2,5,5,11};
        int [] n = twoSum(numeros , 10);
        for (int i = 0; i < n.length ; i++) {
            System.out.println(i +" = " + n[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] indexValid = new int[2];
        if (nums.length >= 1) {
            for (int i = 0; i < nums.length -1; i++) {
                for (int j = nums.length -1 ; j >= 1; j--) {
                    if (j != i){
                        if (nums [i] + nums [j] == target){
                            indexValid [0] = i;
                            indexValid [1] = j;
                            break;
                        }
                    }
                }
            }
        }
        return indexValid;
    }
}
