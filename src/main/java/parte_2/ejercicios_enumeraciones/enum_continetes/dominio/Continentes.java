package parte_2.ejercicios_enumeraciones.enum_continetes.dominio;

public enum Continentes {
    AFRICA(54,true),
    AMERICA(35,true),
    ASIA(48,true),
    OCEANIA(14,true),
    EUROPA(44,true),
    ANTARTIDA(0,false);
    private final int PAISES;
    private final boolean HABITABLE;
    Continentes(int PAISES, boolean ACTIVOS){
        this.PAISES = PAISES;
        this.HABITABLE = ACTIVOS;
    }
    public int getPAISES() {
        return PAISES;
    }
    public boolean isHABITABLE() {
        return HABITABLE;
    }
}
