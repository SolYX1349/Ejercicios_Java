package parte_2.opciones_de_sistema.opciones_de_runetime;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process proceso;

        if (System.getProperty("os.name").startsWith("Windows")){
            try {
                proceso = runtime.exec("notepad");
                proceso.waitFor();
            }catch (IOException ioE){
                System.err.println("Error al querer encontrar el programa. " + ioE.getMessage());
                System.exit(1);
            } catch (InterruptedException e) {
                System.err.println("Error al querer ejecutar el programa. " + e.getMessage());
                System.exit(1);
            }
        }else {
            System.err.println("Tienes otro sistema operativo no compatible con el codigo.");
            System.exit(1);
        }
        System.out.println("Closed");
        System.exit(0);
    }
}
