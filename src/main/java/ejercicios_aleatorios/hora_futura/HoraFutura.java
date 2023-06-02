package ejercicios_aleatorios.hora_futura;


public class HoraFutura {
    public static String tiempoFuturo (int horaActual , int cantidadHoras ){
        for (int i = 0; i < cantidadHoras ; i++) {
            ++ horaActual ;
            if (horaActual == 12){
                horaActual = 0;
            }
        }
        int dias = getCantidadDias(cantidadHoras);
        if (horaActual == 0 ){horaActual = 12;}
        return "Horas: " + horaActual + " hrs, Dias: " + dias;
    }

    private static int getCantidadDias(int cantidadHoras) {
        return cantidadHoras / 24;
    }
}
