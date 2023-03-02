package parte_2.exepciones.aritmetical_exeption;

public class Main {
    public static void main(String[] args) {
        divicion(10,0);
    }
    private static void divicion(int a , int b){
        int div = 0;
        try {
            div = a / b;
        }catch (ArithmeticException arithmeticException){
            String message = arithmeticException.getMessage();
            String cause = String.valueOf(arithmeticException.getCause());
            String stack = String.valueOf(arithmeticException.getStackTrace());
            System.err.println("Mensaje = " + message +
                                "\nCausa = " + cause +
                                   "\nStack = " + stack);
        }finally {
            System.out.println(a + "/" + b + " = " + div);
        }
    }
}
