package parte_2.programas_poo.equals_y_hash;
import parte_2.programas_poo.equals_y_hash.domine.Persona;
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos" , 23);
        Persona persona2 = new Persona("Carlos" , 23);
        showDiferencias(persona1,persona2);

        System.out.println("/////////////////////////////");

        Persona persona4= new Persona("Pol" , 63);
        showDiferencias(persona4,persona2);
    }
    private static void showDiferencias(Object obj1 , Object obj2){
        if (obj1 == obj2){
            System.out.println("Tienen la misma referencia en memoria.");
        }else {
            System.out.println("Tienen distinta referencia en memoria.");
        }
        if (obj1.equals(obj2)){
            System.out.println("Tienen el mismo contenido.");
        }else {
            System.out.println("Tienen diferente contenido.");
        }
        if (obj1.hashCode() == obj2.hashCode()) {
            System.out.println("Tienen el mismo contenido Hash. "
            + "\n Obj1 = " + obj1.hashCode()
            + "\n Obj2 = " + obj2.hashCode());
        }else {
            System.out.println("Tienen diferente contenido Hash."
                    + "\n Obj1 = " + obj1.hashCode()
                    + "\n Obj2 = " + obj2.hashCode());
        }
    }
}
