package parte_1.n5_ejercicios_arreglos.primero_y_ultimo;
public class Main {
    public static void main(String[] args) {
        Integer [] numeros = {1,2,3,4,5,6,7,8,9,10};
        ordenPrimeroYUltimo(numeros);
        System.gc();
    }
    protected static void ordenPrimeroYUltimo(Object [] arg){
        Object [] newAr = new Object [arg.length];
        int a = 1;
        int decrementado = arg.length -1;

        newAr [0] = arg [0];
        for (int i = 0; i < arg.length/2 ; i++) {
            newAr [a] = arg [decrementado -i];
            a += 1;
            if (i < arg.length /2 -1){
                newAr [a] = arg [i + 1];
                a += 1;
            }
        }
        for (Object numbers:newAr) {
            System.out.println("["+numbers+"]");
        }
    }
}
