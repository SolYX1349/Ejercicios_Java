package ejercicios_aleatorios.upper_and_lower;

public class UpperAndLower {
    public static void main(String[] args) {
        convercion("hola mundo" , "minus");
    }
    private static void convercion (String texto , String tipoLetra){
        String tipo = tipoLetra.toLowerCase();
        String cadena;
        switch (tipo){
            case "mayus":
                cadena = texto.toUpperCase();
                break;
            case  "minus":
                cadena = texto.toLowerCase();
                break;
            default:
                cadena = "No se encontro ninguna opcion = " + tipoLetra;
        }
        System.out.println(cadena);
    }
}
