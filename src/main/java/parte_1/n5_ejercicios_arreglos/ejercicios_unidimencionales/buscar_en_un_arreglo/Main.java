package parte_1.n5_ejercicios_arreglos.ejercicios_unidimencionales.buscar_en_un_arreglo;

public class Main {
    private static void encontrarPalabra (String [] array , String palabra){
        String mensaje = "No se enconto la palabra : " + palabra;
        for (int i = 0; i < array.length ; i++) {
            if (array[i].contains(palabra)) {
                mensaje = "Palabra --"+ palabra +"-- encontrada en la posicion [" + i + "]";
                break;
            }
        }
        System.out.println(mensaje);
    }
    public static void main(String[] args) {
        String [] objetos = {"lapiz","pluma","espejo","pantalla","ventana","mouse","reloj"};
        encontrarPalabra(objetos,"lapiz");
    }
}
