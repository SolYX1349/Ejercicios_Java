package parte_2.instancias.instancias_de_clase;

import parte_2.instancias.instancias_de_clase.clases.*;

public class Main {
    public static void main(String[] args) {

        Mercedes carro1 = new Mercedes();
        Lamborghini carro2 = new Lamborghini();
        Tesla carro3 = new Tesla();

        System.out.println(verInstanciaCarro(carro1));
        System.out.println(verInstanciaCarro(carro2));
        System.out.println(verInstanciaCarro(carro3));
    }
    private static Boolean verInstanciaCarro (Object obj){
        if (obj != null){
            if (obj instanceof Carro){
                System.out.println(obj.getClass().getSimpleName() + " Si es instancia de Carro");
                return true;
            }else {
                System.out.println(obj.getClass().getSimpleName() + " No es instancia de Carro");
                return false;
            }
        }
        System.out.println("Error es null");
        return false;
    }
}
