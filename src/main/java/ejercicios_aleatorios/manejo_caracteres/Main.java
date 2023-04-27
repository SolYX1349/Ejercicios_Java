package ejercicios_aleatorios.manejo_caracteres;

public class Main {
    public static void main(String[] args) {
        String nombre1 = "Carl";
        String nombre2 = "Lucas";
        String nombre3 = "Santiago";
        System.out.println(imprimir(nombre1).append("_").append(imprimir(nombre2)).append("_").append(imprimir(nombre3)));
    }
    private static StringBuilder imprimir (String arg1){
        StringBuilder str = new StringBuilder();
        String subCadena = arg1.substring(1,2);
        String letraMayus = subCadena.toUpperCase();
        str.append(letraMayus).append(".");
        int longitudCadena = arg1.length();
        subCadena = arg1.substring(longitudCadena-2,longitudCadena);
        String letraMinus = subCadena.toLowerCase();
        str.append(letraMinus);
        return str;
    }
}
