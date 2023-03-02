package parte_2.ejercicios_poo_abstract.zoo_abstract.domain.animales;
import parte_2.ejercicios_poo_abstract.zoo_abstract.domain.Felino;
public class Leon extends Felino {
    private Integer numManada;
    public Leon(String abitad, double altura, double largo, double peso, Integer velocidad, Integer numManada) {
        super(abitad, altura, largo, peso, velocidad);
        this.numManada = numManada;
    }
    @Override
    public String comer() {
        return "El leon normal mente come animales de su abitad.";
    }
    @Override
    public String dormir() {
        return "El leon normal mente duerme con su manada.";
    }
    @Override
    public String correr() {
        return "El leon corre mucho apesar de las altas temperaturas.";
    }
    @Override
    public String comunicarse() {
        return "El leon normal mente se comunica con sus rugidos.";
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Leon{numManada=").append(numManada);
        sb.append('}');
        return sb.toString();
    }
}
