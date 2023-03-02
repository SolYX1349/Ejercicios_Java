package parte_3.ejercicios_colecciones.ejrcicios_list.agregar_objetos.test;

import parte_3.ejercicios_colecciones.ejrcicios_list.agregar_objetos.domine.Persona;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List <Persona> personas = new ArrayList<>();
        personas.add(new Persona("Hector","Salamanca",56));
        personas.add(new Persona("Pablo","Martinez",45));
        personas.add(new Persona("Javier","Herrera",23));
        personas.add(new Persona("Chucho","Guzman",45));
        personas.add(new Persona("Fran","Malta",76));
        personas.add(new Persona("Cristian","Heinz",19));
        showList(personas);
    }
    private static void showList(List<Persona> personas){
        personas.forEach(persona -> System.out.println(persona));
    }
}
