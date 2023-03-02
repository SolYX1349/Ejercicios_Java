package parte_2.ejercicios_poo_abstract.zoo_abstract;
import com.mis_ejercicios.parte_2.ejercicios_poo_abstract.zoo_abstract.domain.*;
import com.mis_ejercicios.parte_2.ejercicios_poo_abstract.zoo_abstract.domain.animales.*;
public class MainTest {
    public static void main(String[] args) {
        // Canino
        Mamifero mamifero = new Perro(10,1.1,"Griz","Ciudad",0.50,1,5.86);
        System.out.println(mamifero.toString());
        System.out.println(mamifero.comer());
        System.out.println(mamifero.comunicarse());

        System.out.println("////////////////////////////");

        // Felino
        mamifero = new Leon("Sabana",1,2,20.5,1200,6);
        System.out.println(mamifero.toString());
        System.out.println(mamifero.comer());
        System.out.println(mamifero.comunicarse());
    }
}
