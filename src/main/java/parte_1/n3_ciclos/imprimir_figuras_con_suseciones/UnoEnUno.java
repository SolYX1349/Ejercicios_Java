package parte_1.n3_ciclos.imprimir_figuras_con_suseciones;

public class UnoEnUno {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        int rango = 99 , salto = 10;
        for (int i = 0; i <= rango ; i++) {
            if (i == salto){
                System.out.println();
                salto += 10;
            }
            System.out.print(i + " ");
        }
    }

    //Codigo dirigido al testing
    public static String unoEnUno(){
        StringBuilder sb = new StringBuilder();
        int rango = 99 , salto = 10;
        for (int i = 0; i <= rango ; i++) {
            if (i == salto){
                sb.append("\n");
                salto += 10;
            }
            sb.append(i).append(" ");
        }
        return String.valueOf(sb);
    }
}
