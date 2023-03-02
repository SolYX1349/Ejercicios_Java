package parte_2.exepciones.null_exeption;

public class Main {
    public static void main(String[] args) {
        String persona = null;
        printToString(persona);
    }
    private static void printToString(Object obj){
        try {
            System.out.println(obj.toString());
        }catch (NullPointerException ex){
            System.err.println("El objeto es null");
        }
    }
}
