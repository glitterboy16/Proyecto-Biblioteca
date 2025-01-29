import java.util.Scanner;
public class Biblioteca {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.usuarioNuevo(new Usuarios("Angel", "1234", TipoUsuario.ADMIN));
        gestor.usuarioNuevo(new Usuarios("Pablo", "1234", TipoUsuario.ADMIN));
        gestor.usuarioNuevo(new Usuarios("Jose", "1234", TipoUsuario.USER));
        gestor.usuarioNuevo(new Usuarios("Marta", "rodasbichogrande", TipoUsuario.USER));
    
        menuPrincipal(gestor);
    }

    public static void menuPrincipal(GestorUsuarios gestor){
        int opcion;
            do{
                System.out.println(menu());
                opcion = sc.nextInt();
                switch(opcion){
                    case 1 -> menuInicioSesion(gestor);
                    case 2 -> System.out.println("Saliendo del programa..."+
                    "\nGracias por confiar en Byte & Books");
                    default -> System.out.println("Opcion no valida");
                }
            }while(opcion !=2);     
    }

    public static String menu(){
        String tVerde = "\u001B[32m";
        String fBlanco = "\u001B[32;40m";
        String reset = "\u001B[0m";
        String menu= tVerde +"-----------------------------------\n"
                + "|                                 |\n"
                + "|    "+fBlanco+"Bienvenido a Byte & book" + reset + tVerde+"     |\n"
                + "|                                 |\n"
                + "|---------------------------------|\n"
                + "|      1. Iniciar sesión          |\n" 
                + "|      2. Salir                   |\n"
                + "-----------------------------------\n"
                + "Elija una opción:\n" + reset;
        return menu;
    }
    
    public static void menuInicioSesion(GestorUsuarios gestor){
        sc.nextLine();
        System.out.println("Dame tu nombre de usuario");
        String nombreini = sc.nextLine();
        System.out.println("Dime tu contraseña");
        String contrasenaini = sc.nextLine();
        Usuarios usuinisesion = gestor.inicioSesionUsuarios(nombreini, contrasenaini);
        if (usuinisesion!=null) {
            if (usuinisesion.getTipoUsuario()==TipoUsuario.ADMIN) {
                System.out.println("menu admin");//poner el menu admin (otra funcion)
            }else{
                System.out.println("menu user");//poner menu de user (otra funcion)
            }
        }else{
            System.out.println("ta mal");
        }
    }

    public static String menuUser(){
        String tVerde = "\u001B[32m";
        String fBlanco = "\u001B[32;40m";
        String reset = "\u001B[0m";
        String menu= tVerde +"-----------------------------------\n"
                + "|                                 |\n"
                + "|    "+fBlanco+"Bienvenido a tus posibilidades" + reset + tVerde+"     |\n"
                + "|                                 |\n"
                + "|---------------------------------|\n"
                + "|      1. Iniciar sesión          |\n" 
                + "|      2. Salir                   |\n"
                + "-----------------------------------\n"
                + "Elija una opción:\n" + reset;
        return menu;
    }

}

