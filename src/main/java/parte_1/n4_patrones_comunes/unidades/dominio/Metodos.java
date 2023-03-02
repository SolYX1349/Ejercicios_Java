package parte_1.n4_patrones_comunes.unidades.dominio;

public class Metodos {
    public Metodos (){}
    public int tomarValor(int arg , int desde , int hasta){
        String convercionStr = String.valueOf(arg);
        String substraccionCadena = convercionStr.substring(desde,hasta);
        return Integer.parseInt(substraccionCadena);
    }
    public String unidades (int arg){
        int unidades;
        if (arg >= 0 && arg <= 9){
            return arg + " Unidades ";
        } else if (arg >= 10 && arg <= 99) {
            unidades = tomarValor(arg,1,2);
            return unidades + " Unidades ";
        } else if (arg >= 100 && arg <= 999) {
            unidades = tomarValor(arg,2,3);
            return unidades + " Unidades ";
        }

        return null;
    }
    public String decenas (int arg){
        int decenas;
        if (arg >= 10 && arg <= 99){
            decenas = tomarValor(arg,0,1);
            return decenas + " Decenas ";
        } else if (arg >= 100 && arg <= 999) {
            decenas = tomarValor(arg,1,2);
            return decenas + " Decenas ";
        }
        return null;
    }
    public String centenas (int arg){
        int centenas;
        if (arg >= 100 && arg <= 999){
            centenas = tomarValor(arg,0,1);
            return centenas + " Centenas ";
        }
        return null;
    }
    public void determinarForma(int arg){
        if (arg >= 0 && arg <= 9){
            System.out.println("Tu numero " + arg + " tiene " + unidades(arg));
        } else if (arg >= 10 && arg <= 99) {
            System.out.println("Tu numero " + arg + " tiene " + decenas(arg) + unidades(arg));
        } else if (arg >= 100 && arg <= 999) {
            System.out.println("Tu numero " + arg + " tiene " + centenas(arg) + decenas(arg) + unidades(arg));
        }else {
            System.out.println("No se pudo generar.");
        }
    }
}
