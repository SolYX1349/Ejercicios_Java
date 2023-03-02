package parte_2.programas_poo.lista_personas;
import com.mis_ejercicios.parte_2.programas_poo.lista_personas.domain.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona [] = new Persona[5];
            persona [0] = new Persona("luis" , "smith" , "castilla");
            persona [1] = new Persona("carl" , "medina" , "caballero");
            persona [2] = new Persona("paul" , "perez" , "sthepen");
            persona [3] = new Persona("criz" , "guzman" , "millar");
            persona [4] = new Persona("corey" , "phillips" , "muller");

        for (int i = 0; i < persona.length ; i++) {
            System.out.println("Persona #" + i + " "+ persona [i].getNombre() + " "+ persona[i].getPrimer_apellido() +" "+ persona[i].getSegundo_apellido());
        }
    }
}
// En este programa se crea un array limitado, donde se almacenan los datos de varias personas.