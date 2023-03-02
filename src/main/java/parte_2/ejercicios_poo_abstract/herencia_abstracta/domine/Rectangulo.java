package parte_2.ejercicios_poo_abstract.herencia_abstracta.domine;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    @Override
    public void dibujar() {
        System.out.println("Imprimiendo un " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append('}');
        return sb.toString();
    }
}
