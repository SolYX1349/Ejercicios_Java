package ejercicios_aleatorios.desplazamiento_y_distancia;

public class PositionTime {
    public static void main(String[] args) {
        Integer[] arrayTime = {0, 1};
        Integer[] arrayPosition = {-2,6,6,0};
        calculateDesAndDist(arrayTime, arrayPosition);
    }

    public static void calculateDesAndDist(Integer[] arrayTime, Integer[] arrayPosition) {
        int desplazamiento = calcularDesplazamiento(arrayPosition , arrayTime);
        int distancia = calcularDistancia(arrayPosition);
        System.out.println("Desplazamiento = " + desplazamiento);
        System.out.println("Distancia = " + distancia);
    }

    private static int calcularDesplazamiento(Integer[] arrayPosition , Integer[] arrayTime) {
        int limiteTime = arrayTime[1];
        int finalPos = 0;
        for (int time = arrayTime[0]; time < limiteTime  ; time++) {
            finalPos = arrayPosition[time];
        }
        return finalPos - arrayPosition[limiteTime];
    }

    private static int calcularDistancia(Integer[] arrayPosition) {
        int resultado = 0;
        for (Integer pos : arrayPosition) {
            resultado += pos;
        }
        return resultado;
    }


}
