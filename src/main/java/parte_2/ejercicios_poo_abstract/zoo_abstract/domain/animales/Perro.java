package parte_2.ejercicios_poo_abstract.zoo_abstract.domain.animales;
import parte_2.ejercicios_poo_abstract.zoo_abstract.domain.Canino;
public class Perro extends Canino {
    private int fuerzaMordida;
    public Perro(int potenciaMordida, double tamanoColmillos, String color, String habitat, double altura, double largo, double peso) {
        super(tamanoColmillos, color, habitat, altura, largo, peso);
        this.fuerzaMordida = potenciaMordida;
    }
    @Override
    public String comer() {
        return "El perro come comida especial para cada tipo de canino.";
    }
    @Override
    public String dormir() {
        return "El perro duerme en las casas.";
    }
    @Override
    public String correr() {
        return "El perro corre en los parques aledaños.";
    }
    @Override
    public String comunicarse() {
        return "Los perros ladran durante alguna moletia nocturnas.";
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Perro{fuerzaMordida=").append(fuerzaMordida);
        sb.append('}');
        return sb.toString();
    }
}