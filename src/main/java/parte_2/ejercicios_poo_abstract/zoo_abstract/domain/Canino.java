package parte_2.ejercicios_poo_abstract.zoo_abstract.domain;

public abstract class Canino extends Mamifero{
    protected String color;
    protected double tamanoColmillos;
    public Canino(double tamanoColmillos, String color, String abitad, double altura, double largo, double peso) {
        super(abitad, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Canino{color='").append(color).append('\'');
        sb.append(", tamanoColmillos=").append(tamanoColmillos);
        sb.append('}');
        return sb.toString();
    }
}
