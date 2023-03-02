package parte_1.n3_ciclos.suceciones_numericas;

public class Rectangulos {
    public static void main(String[] args) {
        char simbolo = '@';
        int cantidad = 12;
        int cantidad2 = cantidad - 2;
        StringBuilder stringBuilder = new StringBuilder();

        if (cantidad <= 1){
            System.out.println(simbolo);
        }else {
            stringBuilder.append(String.valueOf(simbolo).repeat(cantidad));
            for (int i = 0; i < cantidad2 ; i++) {
                stringBuilder.append("\n").append(simbolo);
                stringBuilder.append(" ".repeat(cantidad2));
                stringBuilder.append(simbolo);
            }
            stringBuilder.append("\n");
            stringBuilder.append(String.valueOf(simbolo).repeat(cantidad));
            System.out.println(stringBuilder);
        }
    }
}