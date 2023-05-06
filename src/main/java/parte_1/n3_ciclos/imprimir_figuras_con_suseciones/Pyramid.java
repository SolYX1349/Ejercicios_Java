package parte_1.n3_ciclos.imprimir_figuras_con_suseciones;

public class Pyramid {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        int rango = 9, cantidadEspacios = 0, cantidadNumeros = 1;
        cantidadEspacios = rango;
        for (int i = 0; i <= rango; i++) {
            for (int j = 0; j < cantidadEspacios; j++) {
                System.out.print(" ");
            }
            cantidadEspacios -= 1;
            for (int j = 0; j < cantidadNumeros; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            ++cantidadNumeros;
        }
    }

    //Codigo dirigido al test
    public static String pyramid() {
        StringBuilder sb = new StringBuilder();

        int rango = 9, cantidadNumeros = 1;
        int cantidadEspacios = rango;
        for (int i = 0; i <= rango; i++) {

            sb.append(" ".repeat(Math.max(0, cantidadEspacios)));

            for (int j = 0; j < cantidadNumeros; j++) {
                sb.append(i).append(" ");
            }
            if (i != rango) sb.append("\n");

            cantidadEspacios -= 1;
            ++cantidadNumeros;
        }

        return String.valueOf(sb);
    }
}
