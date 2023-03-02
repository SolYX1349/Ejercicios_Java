package parte_3.ejercicios_generics.obtener_tipo;

public class ClaseGenerica <T>{
    T objeto;
    public ClaseGenerica(T objeto){
       this.objeto = objeto;
    }
    public String getObjeto() {
        return "El objeto <T> es : " + this.objeto.getClass().getSimpleName();
    }
}
