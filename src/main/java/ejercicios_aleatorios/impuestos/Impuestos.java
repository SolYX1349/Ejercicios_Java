package ejercicios_aleatorios.impuestos;

public class Impuestos {

    private static final Double DEFAULT_IVA = 16.0;

    public static String createFacture(String nombre, Double[] preciosProductos) {
        String message = "Error";
        if (!nombre.isEmpty()) {
            Double total = calcularTotalSinImpuestos(preciosProductos);
            Double impuesto = calcularImpuesto(total);
            message = formatoFactura(nombre, total, impuesto, calcularTotalMasImpuestos(total, impuesto));
        }

        return message;
    }

    private static Double calcularTotalMasImpuestos(Double total, Double impuesto) {
        return total + impuesto;
    }

    private static Double calcularImpuesto(Double montoTotal) {
        return (montoTotal * DEFAULT_IVA) / 100;
    }

    //Se encarga de calcular el total de los precios
    private static Double calcularTotalSinImpuestos(Double[] precios) {
        Double total = 0.0;
        for (Double price : precios) {
            total += price;
        }
        return total;
    }

    //Esta seccion se encarga de regresar el formato de la factura
    private static String formatoFactura(String nombre, Double totalSinImpuestos, Double impuesto, Double montoTotalMasImpuestos) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre factura: ").append(nombre);
        sb.append("\nTotal = ").append(totalSinImpuestos);
        sb.append("\nImpuesto: ").append(impuesto);
        sb.append("\nTotal mas impuesto: ").append(montoTotalMasImpuestos);
        return sb.toString();
    }
}
