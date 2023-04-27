package parte_1.n4_arreglos.arreglos_unidimencionales.crear_una_contrasenia;

public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 14 ; i++) {
            System.out.println("Your password is = " + passwordGenerator());
        }
    }
    private static StringBuilder passwordGenerator()throws ArrayIndexOutOfBoundsException{
        String [] letrasMinusculas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};
        String [] numeros = {"1","2","3","4","5","6","7","8","9","0"};
        String [] caracteresEspeciales = {"?","!","@","#","$","%","/","&","*","_","+"};
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < 3 ; i++) {
            int number;
            if (i % 2 == 0){
                number = (int) (Math.random() * 24);
                cadena.append(letrasMinusculas [number]);
                number = (int) (Math.random() * 24);
                cadena.append(letrasMinusculas [number].toUpperCase());
                number = (int) (Math.random() * 9);
                cadena.append(numeros[number]);
                number = (int) (Math.random() * 10);
                cadena.append(caracteresEspeciales [number]);
            }else {
                number = (int) (Math.random() * 10);
                cadena.append(caracteresEspeciales [number]);
                number = (int) (Math.random() * 24);
                cadena.append(letrasMinusculas [number].toUpperCase());
                number = (int) (Math.random() * 9);
                cadena.append(numeros[number]);
                number = (int) (Math.random() * 24);
                cadena.append(letrasMinusculas [number]);
            }
        }
        return cadena;
    }
}