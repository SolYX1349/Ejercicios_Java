package parte_2.ejercicios_poo_abstract.zoo_abstract.domain;

public abstract class Felino extends Mamifero{
    private int velocidad;
    public Felino(){}
    public Felino(String abitad, double altura, double largo, double peso, int velocidad) {
        super(abitad,altura,largo,peso);
        this.velocidad = velocidad;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Felino{");
        sb.append("velocidad=").append(velocidad);
        sb.append('}');
        return sb.toString();
    }
}
