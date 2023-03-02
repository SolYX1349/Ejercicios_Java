package parte_2.programas_poo.almacen_y_verduleria;
import parte_2.programas_poo.almacen_y_verduleria.domain.*;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("calabaza",13.00);
        Lacteo lacteo = new Lacteo("leche de calabaza",13.00,2,1500);
        Fruta fruta = new Fruta("leche de calabaza",13.00,2,"Naranja");
        Limpieza limpieza = new Limpieza("Cloro",45.00,"Cloro y Oxigeno",1.00);
        NoPerecibles perecibles = new NoPerecibles("Yogurd",12.00,1,450);
        print(producto);
        print(lacteo);
        print(fruta);
        print(limpieza);
        print(perecibles);
    }
    private static void print (Object obj){
        System.out.println(obj.toString());
    }
}
