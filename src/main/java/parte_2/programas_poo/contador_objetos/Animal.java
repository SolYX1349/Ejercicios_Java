package parte_2.programas_poo.contador_objetos;

public class Animal {
    private int contador;
    private int numeroAnimal;
    private static int contadorObjetos;

    public Animal(int numeroAnimal){
        this.numeroAnimal = numeroAnimal;
        this.contador = ++Animal.contadorObjetos;
    }

    public int getContador() {
        return contador;
    }

    public int getNumeroAnimal() {
        return numeroAnimal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("numeroAnimal=").append(numeroAnimal);
        sb.append('}');
        return sb.toString();
    }
}
