package parte_2.programas_poo.datos_protegidos.dominio;

public class OcultarInformacion {
    public OcultarInformacion(){}
    public void convertirdatos (String nombre , String mail , String password , String numberCard , String numberPhone){
        System.out.println("Tus datos estan protegidos \nNombre : " + nombre);
        System.out.print("Mail : ");
        ocultarCorreos(mail);
        System.out.print("\nPI : ");
        ocultarPassword(password);
        System.out.print("\nNum Card : ");
        ocultarDatos(numberCard);
        System.out.print("\nNum telefono : ");
        ocultarDatos(numberPhone);
    }
    public static void ocultarDatos(String arg1){
        for (int i = 0; i < arg1.length() ; i++) {
            if (i == 4 ){
                String sub_cadena = arg1.substring(4,8);
                System.out.print(sub_cadena);
            }else if (i < 4){
                System.out.print("*");
            }
        }
    }
    public static void ocultarPassword(String arg1){
        for (int i = 0; i <arg1.length(); i++) {
            System.out.print("*");
        }
    }
    public static void ocultarCorreos(String arg1){
        int longitud_cadena = arg1.length() - 10;
        for (int i = 0; i <= longitud_cadena ; i++) {
            if (i == longitud_cadena){
                System.out.print("@gmail.com");
            }else {
                System.out.print("*");
            }
        }
    }
}
