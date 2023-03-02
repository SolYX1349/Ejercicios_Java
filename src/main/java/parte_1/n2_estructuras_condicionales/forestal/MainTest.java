package parte_1.n2_estructuras_condicionales.forestal;

public class MainTest {
    public static void main(String[] args) {
        calcularCrecimiento(0.11,1);
    }
    private static void calcularCrecimiento(double medidaActual , double medidaAAlcanzar){
        double crecimientoStandard = 0.23;
        for (int cantAnios = 1; cantAnios < 100 ; cantAnios++) {
            double medida = medidaActual + (crecimientoStandard * cantAnios);
            if (medida >= medidaAAlcanzar){
                System.out.println("El arbor tardara aproximadamente -" + cantAnios + "- años en llegar a los " + + medida + " metros.");
                break;
            }
        }
    }
}