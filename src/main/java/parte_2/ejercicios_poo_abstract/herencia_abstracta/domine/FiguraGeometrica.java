package parte_2.ejercicios_poo_abstract.herencia_abstracta.domine;

import java.util.Objects;

public abstract class FiguraGeometrica {
    private String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FiguraGeometrica{");
        sb.append("tipoFigura='").append(tipoFigura).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FiguraGeometrica)) return false;
        FiguraGeometrica that = (FiguraGeometrica) o;
        return Objects.equals(getTipoFigura(), that.getTipoFigura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoFigura());
    }
}
