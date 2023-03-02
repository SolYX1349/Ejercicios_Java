package parte_2.programas_poo.evaluacion;
import com.mis_ejercicios.parte_2.programas_poo.evaluacion.dominio.MetodosImp;

public class Main {
    public static void main(String[] args) {
        MetodosImp metodos = new MetodosImp();
        metodos.declararCantidadPreguntas(6);
       metodos.crearPreguntasYRespuestas("La luna es mas grande que la tierra?" , false);
       metodos.crearPreguntasYRespuestas("Hay 439 dias en un anio?" , false);
       metodos.crearPreguntasYRespuestas("los dias duran 23 horas?" , false);
       metodos.crearPreguntasYRespuestas("El fuego es caliente?" , true);
       metodos.crearPreguntasYRespuestas("Se conocen todos los numeros?" , false);
       metodos.crearPreguntasYRespuestas("Se conoce el fin de el espacio?" , false);
       metodos.hacerPregunta();
       metodos.imprimirResultado();
    }
}
