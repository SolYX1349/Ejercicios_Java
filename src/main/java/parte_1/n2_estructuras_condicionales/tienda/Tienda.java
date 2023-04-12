package parte_1.n2_estructuras_condicionales.tienda;

public class Tienda {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        int ventasAprovadas = 0;
        short limiteRandom = 3000;

        double ventas[] = new double[30];
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (short) (Math.random() * limiteRandom);
            if (ventas[i] >= 2000) {
                System.out.println("Venta N# " + (i + 1) + " fue de: $" + ventas[i]);
                ventasAprovadas++;
            }
        }
        System.out.println("\nTotal de Ventas aprobadas = " + ventasAprovadas);
    }

    //Codigo dirigido al testing
    public static String salesLimitCounter(double[] arraySales, int budgetLimit) {
        int approvedSales = 0;
        String message = "Error";
        if (arraySales != null) {
            if (budgetLimit >= 1) {
                for (double element : arraySales) {
                    if (element >= budgetLimit) {
                        approvedSales++;
                    }
                }
            }
            message = "Total Approved Sales = " + approvedSales;
        }
        return message;
    }

    private static double[] salesSimulator(int budgetLimit, int saleSimulationLimit) {
        double[] arraySales = new double[saleSimulationLimit];
        for (int i = 0; i < saleSimulationLimit; i++) {
            arraySales[i] = (Math.random() * budgetLimit);
        }
        return arraySales;
    }
}

