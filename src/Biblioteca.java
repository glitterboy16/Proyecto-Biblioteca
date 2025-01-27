import java.util.Scanner;
public class Biblioteca {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        int opcion;
            do{
                System.out.println(menu());
                opcion = sc.nextInt();
                switch(opcion){
                    case 1 -> System.out.println("Iniciar como Usuario");
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


}

