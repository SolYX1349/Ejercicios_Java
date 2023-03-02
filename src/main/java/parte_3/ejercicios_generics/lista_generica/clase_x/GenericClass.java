package parte_3.ejercicios_generics.lista_generica.clase_x;

import java.util.*;

public class GenericClass<T> {
    public GenericClass() {
    }

    public List<T> agregarDatos(T dato1, T dato2, T dato3) {
        List<T> list = new ArrayList<>();
        list.add(dato1);
        list.add(dato2);
        list.add(dato3);
        return list;
    }
}
