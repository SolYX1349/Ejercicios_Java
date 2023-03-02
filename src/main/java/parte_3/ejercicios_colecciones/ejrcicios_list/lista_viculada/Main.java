package parte_3.ejercicios_colecciones.ejrcicios_list.lista_viculada;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(4);
        addTwoNumbers(list1,list2).forEach(System.out::print);
    }
    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        StringBuilder cadena1 = new StringBuilder();
        for (int i = l1.size()-1; i >= 0 ; i--) {
            cadena1.append(l1.get(i));
        }
        StringBuilder cadena2 = new StringBuilder();
        for (int i = l2.size()-1; i >= 0; i--) {
            cadena2.append(l2.get(i));
        }
        int suma = Integer.parseInt(cadena1.toString()) + Integer.parseInt(cadena2.toString());
        char [] array = String.valueOf(suma).toCharArray();
        List<Integer> listResultado = new ArrayList<>();
        for (int i = array.length-1; i >= 0 ; i--) {
            listResultado.add(Integer.parseInt(String.valueOf(array[i])));
        }
        return listResultado;
    }
}
