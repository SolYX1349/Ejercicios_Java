package parte_1.n3_ciclos.imprimir_figuras_con_suseciones;

public class Rectangulos {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        char simbolo = '@';
        int cantidad = 12;
        int cantidad2 = cantidad - 2;
        StringBuilder stringBuilder = new StringBuilder();

        if (cantidad <= 1) {
            System.out.println(simbolo);
        } else {
            stringBuilder.append(String.valueOf(simbolo).repeat(cantidad));
            for (int i = 0; i < cantidad2; i++) {
                stringBuilder.append("\n").append(simbolo);
                stringBuilder.append(" ".repeat(cantidad2));
                stringBuilder.append(simbolo);
            }
            stringBuilder.append("\n");
            stringBuilder.append(String.valueOf(simbolo).repeat(cantidad));
            System.out.println(stringBuilder);
        }
    }

    //Codigo dirigido al testing
    public static String rectangulo() {
        StringBuilder sb = new StringBuilder();

        String simbolo = "@";
        int cantidad = 12;
        int cantidadEspacios = cantidad - 2;

        sb.append(simbolo.repeat(cantidad));
        for (int i = 0; i < cantidadEspacios; i++) {
            sb.append("\n");
            sb.append(simbolo).append(" ".repeat(cantidadEspacios)).append(simbolo);
        }
        sb.append("\n");
        sb.append(simbolo.repeat(cantidad));

        return String.valueOf(sb);
    }
}