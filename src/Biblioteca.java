import java.lang.reflect.GenericSignatureFormatError;
import java.util.Scanner;
public class Biblioteca {
    public static final Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
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
=======
    GestorUsuarios gestor = new GestorUsuarios();
    GestorLibros gestorLibros = new GestorLibros();
    public Biblioteca(GestorUsuarios gestor, GestorLibros gestorLibros) {
        this.gestor = gestor;
        this.gestorLibros = gestorLibros;
    }
    public GestorUsuarios getGestor() {
        return gestor;
    }
    public void setGestor(GestorUsuarios gestor) {
        this.gestor = gestor;
    }
    public GestorLibros getGestorLibros() {
        return gestorLibros;
    }
    public void setGestorLibros(GestorLibros gestorLibros) {
        this.gestorLibros = gestorLibros;
>>>>>>> RamaIntermedia-Rodas
    }

    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca(new GestorUsuarios(), new GestorLibros());
        biblioteca.menuPrincipal(biblioteca.gestor);
        
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El senor de los anillos", "J.R.R. Tolkien", Categoria.FANTASIA));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El hobbit", "J.R.R. Tolkien", Categoria.FANTASIA));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El codigo da vinci", "Dan Brown", Categoria.TERROR));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El alquimista", "Paulo Coelho", Categoria.AUTOAYUDA));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El principito", "Antoine de Saint-Exupery", Categoria.INFANTIL));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", Categoria.FICCION));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Categoria.HISTORIA));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("La sombra del viento", "Carlos Ruiz Zafon", Categoria.MISTERIO));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El nombre del viento", "Patrick Rothfuss", Categoria.FANTASIA));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("La ladrona de libros", "Markus Zusak", Categoria.HISTORIA));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Angel", "1234", TipoUsuario.ADMIN));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Pablo", "1234", TipoUsuario.ADMIN));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Jose", "1234", TipoUsuario.USER));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Marta", "rodasbichogrande", TipoUsuario.USER));
    }

    public void menuPrincipal(GestorUsuarios gestor){
        int opcion;
<<<<<<< HEAD
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
=======
        do{
            System.out.println(menu());
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> menuInicioSesion(gestor);
                case 2 -> System.out.println("Saliendo del programa..."+
                "\nGracias por confiar en Byte & Books");
                default -> System.out.println("Opcion no valida");
            }
        }while(opcion !=2);     
>>>>>>> RamaIntermedia-Rodas
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
<<<<<<< HEAD
    
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
=======
    public static String ImprimirMenuAdmin(){
>>>>>>> RamaIntermedia-Rodas
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
<<<<<<< HEAD

    public static String menuUser(){
=======
    public static String ImprimirMenuUser(){
>>>>>>> RamaIntermedia-Rodas
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
    
    public static void menuInicioSesion(GestorUsuarios gestor){
        System.out.println("Dame tu nombre de usuario");
        String nombreini = sc.nextLine();
        System.out.println("Dime tu contraseña");
        String contrasenaini = sc.nextLine();
        Usuarios usuinisesion = gestor.inicioSesionUsuarios(nombreini, contrasenaini);
        if (usuinisesion!=null) {
            if (usuinisesion.getTipoUsuario()==TipoUsuario.ADMIN) {
                System.out.println(ImprimirMenuAdmin());
            }else{
                System.out.println(ImprimirMenuUser());
            }
        }else{
            System.out.println("ta mal");
        }
    }



    public static void menuAdmin(){
        int opcion;
        do{
            System.out.println(menu());
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> System.out.println();
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> System.out.println();
                case 5 -> System.out.println();
                case 6 -> System.out.println();
                case 7 -> System.out.println();
                case 8 -> System.out.println();
                case 9 -> System.out.println();
                case 10 -> System.out.println();
                case 11 -> System.out.println("Saliendo del programa..."+
                "\nGracias por confiar en Byte & Books");
                default -> System.out.println("Opcion no valida");
            }
        }while(opcion !=11); 
    }

    public static String ImprimirBuscarLibros(){
        String tVerde = "\u001B[32m";
        String fBlanco = "\u001B[32;40m";
        String reset = "\u001B[0m";
        String menu= tVerde +"--------------------------------------------------\n"
                            + "|                                                |\n"
                            + "|  "+fBlanco+"Como quiere encontrar su libro" + reset + tVerde+"   |\n"
                            + "|                                                |\n"
                            + "|------------------------------------------------|\n"
                            + "|      1. Por Título                             |\n" 
                            + "|      2. Por Autor                              |\n"
                            + "|      3. Por categoria                          |\n"
                            + "|      5. Salir a menu                           |\n"
                            + "--------------------------------------------------\n"
                            + "Elija una opción:\n" + reset;
        return menu;
    }
/* 
    public static void menuBuscarLibros(){
        int opcion;
        do{
            String busqueda;
            Libro menubusquedalibros = gestorLibros.buscarLibro(busqueda);
        
            System.out.println(ImprimirBuscarLibros());
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> {System.out.println("Dime el titulo");
                    busquedas = sc.nextLine();
                    GestorLibros.buscarLibro(busqueda);}
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> System.out.println();
                default -> System.out.println("Opcion no valida");
            }
        }while(opcion !=5); 
    }
        */
}
