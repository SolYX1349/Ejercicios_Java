package parte_2.ejercicios_poo_abstract.zoo_abstract.domain.animales;
import parte_2.ejercicios_poo_abstract.zoo_abstract.domain.Felino;
public class Tigre extends Felino {
    private String especie;
    public Tigre(String abitad, double altura, double largo, double peso, Integer velocidad, String especie) {
        super(abitad, altura, largo, peso, velocidad);
        this.especie = especie;
    }
    @Override
    public String comer() {
        return "El tigre normal mente come animales de su abitad.";
    }
    @Override
    public String dormir() {
        return "El tigre normal mente duerme con su manada.";
    }
    @Override
    public String correr() {

        return "El tigre corre mucho a pesar de las altas temperaturas.";
    }
    @Override
    public String comunicarse() {
        return "El tigre normal mente se comunica con sus rugidos.";
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Tigre{especie='").append(especie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
