package parte_1.n4_patrones_comunes.nombre_correcto;

public class Main {
    public static void main(String[] args) {
        Main.validacionNombre("Carlos 2lorem morxio");
        Main.validacionNombre("pedro c@valera hernandez");
        Main.validacionNombre("Antonio daniel espinoza");
    }
    private static boolean validacionNombre(String nombreCompleto) {
        // ¿es en blanco?
        if (!nombreCompleto.isBlank()){
            // ¿contiene espacios?
            if (nombreCompleto.contains(" ")){
                // contiene numeros?
                for (int j = 0; j <= 9 ; j++) {
                    String strNumero = String.valueOf(j);
                    if (nombreCompleto.contains(strNumero)){
                        System.out.println("No puede contener numeros.");
                        return false;
                    }
                }
                // ¿contiene caracteres especiales?
                String mensajeErrorCaracterE = "No puede contener caracteres especiales.";
                for (int j = 63; j <= 255 ; j++) {
                    char caracter = (char) j;
                    String caracterString = String.valueOf(caracter);
                    if (j <= 64 || j >= 238){
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    }else if (j >= 91 && j <= 96) {
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    }else if (j >= 123 && j <= 127) {
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    }else if (j >= 166 && j <= 180) {
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    }else if (j >= 184 && j <= 197) {
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    } else if (j >= 200 && j <= 209) {
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    }else if (j >= 217 && j <= 223) {
                        if (nombreCompleto.contains(caracterString)){
                            System.out.println(mensajeErrorCaracterE);
                            return false;
                        }
                    }
                }
                System.out.println("Ingresado correctamente.");
                return true;
            }else {
                System.out.println("Debe ser separado por espacios.");
                return false;
            }
        }else {
            System.out.println("No puede ser blanco");
            return false;
        }
    }
}
