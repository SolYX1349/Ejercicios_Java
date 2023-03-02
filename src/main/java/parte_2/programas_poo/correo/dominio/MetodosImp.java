package parte_2.programas_poo.correo.dominio;

public class MetodosImp {
    static Email e_mail;
    static Password password ;
    public MetodosImp(){
        e_mail = new Email();
        password = new Password();
    }
    public boolean agregarDatos(String mail , String pass){
        if (mail != null && pass != null){
            e_mail.setCorreo(mail);
            password.setPassword(pass);
            System.out.println("Muy bien ahora verifiquemos tus datos.");
            return true;
        }
        return false;
    }
    public void verificarInformacion(String mail , String pass){
       String getMail = e_mail.getCorreo();
        String getPassword = password.getPassword();
        if (getMail.equals(mail) && getPassword.equals(pass)){
            System.out.println("Acceso completado");
        }else {
            System.out.println("Acceso denegado comprueba tus datos.");
        }
    }
}
