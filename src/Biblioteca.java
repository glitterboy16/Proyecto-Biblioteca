import java.util.Scanner;
public class Biblioteca {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        GestorUsuarios gestorU = new GestorUsuarios();
        gestorU.usuarioNuevo(new Usuarios("Angel", "1234", TipoUsuario.ADMIN));
        gestorU.usuarioNuevo(new Usuarios("Pablo", "1234", TipoUsuario.ADMIN));
        gestorU.usuarioNuevo(new Usuarios("Jose", "1234", TipoUsuario.USER));
        gestorU.usuarioNuevo(new Usuarios("Marta", "rodasbichogrande", TipoUsuario.USER));

        //
        GestorLibros gestorL = new GestorLibros();
        gestorL.nuevoLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien", Categoria.FANTASIA));
        gestorL.nuevoLibro(new Libro("El hobbit", "J.R.R. Tolkien", Categoria.FANTASIA));
        gestorL.nuevoLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", Categoria.FANTASIA));
        gestorL.nuevoLibro(new Libro("Harry Potter y la camara secreta", "J.K. Rowling", Categoria.FANTASIA));
        gestorL.nuevoLibro(new Libro("Harry Potter y el prisionero de Azkaban", "J.K. Rowling", Categoria.FANTASIA));
        gestorL.nuevoLibro(new Libro("Harry Potter y el caliz de fuego", "J.K. Rowling", Categoria.FANTASIA));
        gestorL.nuevoLibro(new Libro("Meditaciones", "Marco Aurelio", Categoria.FILOSOFIA));
        gestorL.nuevoLibro(new Libro("La republica", "Platon", Categoria.FILOSOFIA));
        gestorL.nuevoLibro(new Libro("Critica de la razon pura", "Immanuel Kant", Categoria.FILOSOFIA));
        gestorL.nuevoLibro(new Libro("El arte de la guerra", "Sun Tzu", Categoria.FILOSOFIA));
        gestorL.nuevoLibro(new Libro("La divina comedia", "Dante Alighieri", Categoria.POESIA));
        gestorL.nuevoLibro(new Libro("Rimas y leyendas", "Gustavo Adolfo Becquer", Categoria.POESIA));
        gestorL.nuevoLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", Categoria.TERROR));
        
        menuPrincipal(gestorU);
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
                System.out.println(menuAdmin());
            }else{
                System.out.println(menuUser());
            }
        }else{
            System.out.println("ta mal");
        }
    }

    public static String menuAdmin(){
        String tVerde = "\u001B[32m";
        String fBlanco = "\u001B[32;40m";
        String reset = "\u001B[0m";
        String menu= tVerde +"-----------------------------------------------------------------\n"
                            + "|                                                              |\n"
                            + "|      "+fBlanco+"Bienvenido a tus posibilidades como Admin" + reset + tVerde+"               |\n"
                            + "|                                                              |\n"
                            + "|--------------------------------------------------------------|\n"
                            + "|      1. Buscar libros                                        |\n" 
                            + "|      2. Mostrar los libros disponibles                       |\n"
                            + "|      3. Realizar prestamo de libro                           |\n"
                            + "|      4. Agregar libro                                        |\n"
                            + "|      5. Eliminar libro                                       |\n"
                            + "|      6. Registrar nuevos usuarios                            |\n"
                            + "|      7. Mostrar libros prestados                             |\n"
                            + "|      8. Mostrar numero de prestamos totales y activos        |\n"
                            + "|      9. Lista de libros mas prestados                        |\n"
                            + "|      10. Mostrar que usuario tiene mas prestamos activos     |\n"
                            + "|      11. Salir                                               |\n"
                            + "----------------------------------------------------------------\n"
                            + "Elija una opción:\n" + reset;
        return menu;
    }

    public static String menuUser(){
        String tVerde = "\u001B[32m";
        String fBlanco = "\u001B[32;40m";
        String reset = "\u001B[0m";
        String menu= tVerde +"--------------------------------------------------\n"
                            + "|                                                |\n"
                            + "|  "+fBlanco+"Bienvenido a tus posibilidades como Usuario" + reset + tVerde+"   |\n"
                            + "|                                                |\n"
                            + "|------------------------------------------------|\n"
                            + "|      1. Buscar libros                          |\n" 
                            + "|      2. Mostrar los libros disponibles         |\n"
                            + "|      3. Realizar prestamo de libro             |\n"
                            + "|      4. Devolver libro prestado                |\n"
                            + "|      5. Salir                                  |\n"
                            + "--------------------------------------------------\n"
                            + "Elija una opción:\n" + reset;
        return menu;
    }

}
