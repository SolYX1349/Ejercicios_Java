package parte_1.n2_estructuras_condicionales.forestal;

public class Main {

    //Codigo base del ejercicio:
    public static void main(String[] args) {
        calcularCrecimiento(0.11, 1);
    }

    private static void calcularCrecimiento(double medidaActual, double medidaAAlcanzar) {
        double crecimientoStandard = 0.23;
        for (int cantAnios = 1; cantAnios < 100; cantAnios++) {
            double medida = medidaActual + (crecimientoStandard * cantAnios);
            if (medida >= medidaAAlcanzar) {
                System.out.println("El arbor tardara aproximadamente -" + cantAnios + "- años en llegar a los " + +medida + " metros.");
                break;
            }
        }
    }

    //Codigo dirigido al testing
    private static final double STANDARD_TREE_GROWTH = 0.23;

    public static String treeGrowthCalculator(double currentMeasurement, double measureToReach) {
        String outMessage = "Error to calculate";
        if (currentMeasurement >= 0 && measureToReach >= 0) {
            if (measureToReach >= 1) {
                for (int cantAnios = 1; cantAnios < 500; cantAnios++) {
                    double medida = currentMeasurement + (Main.STANDARD_TREE_GROWTH * cantAnios);
                    if (medida >= measureToReach) {
                        outMessage = "El arbor tardara aproximadamente " + cantAnios + " años en llegar a los " + +medida + " metros.";
                        break;
                    }
                }
            } else {
                outMessage = "Error the argument are zero";
            }
        }
        return outMessage;
    }
}