import java.lang.reflect.GenericSignatureFormatError;
import java.util.Scanner;
public class Biblioteca {
    public static final Scanner sc = new Scanner(System.in);
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
    }

    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca(new GestorUsuarios(), new GestorLibros());

        
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El senor de los anillos", "J.R.R. Tolkien", Categoria.FANTASIA, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El hobbit", "J.R.R. Tolkien", Categoria.FANTASIA, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El codigo da vinci", "Dan Brown", Categoria.TERROR, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El alquimista", "Paulo Coelho", Categoria.AUTOAYUDA, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El principito", "Antoine de Saint-Exupery", Categoria.INFANTIL, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", Categoria.FICCION, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Categoria.HISTORIA, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("La sombra del viento", "Carlos Ruiz Zafon", Categoria.MISTERIO, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("El nombre del viento", "Patrick Rothfuss", Categoria.FANTASIA, EstadoLibro.DISPONIBLE));
        biblioteca.getGestorLibros().nuevoLibro(new Libro("La ladrona de libros", "Markus Zusak", Categoria.HISTORIA, EstadoLibro.DISPONIBLE));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Angel", "1234", TipoUsuario.ADMIN));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Pablo", "1234", TipoUsuario.ADMIN));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Jose", "1234", TipoUsuario.USER));
        biblioteca.getGestor().usuarioNuevo(new Usuarios("Marta", "rodasbichogrande", TipoUsuario.USER));

        biblioteca.menuPrincipal(biblioteca.getGestor());
    }

    public void menuPrincipal(GestorUsuarios gestor){
        int opcion;
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
    public static String ImprimirMenuAdmin(){
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
                            + "|      4. Agregar libro                                        |\n"//hecho
                            + "|      5. Eliminar libro                                       |\n"
                            + "|      6. Registrar nuevos usuarios                            |\n"//hecho
                            + "|      7. Mostrar libros prestados                             |\n"
                            + "|      8. Mostrar numero de prestamos totales y activos        |\n"
                            + "|      9. Lista de libros mas prestados                        |\n"
                            + "|      10. Mostrar que usuario tiene mas prestamos activos     |\n"
                            + "|      11. Salir                                               |\n"
                            + "----------------------------------------------------------------\n"
                            + "Elija una opción:\n" + reset;
        return menu;
    }
    public static String ImprimirMenuUser(){
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
            
            Biblioteca biblioteca = new Biblioteca(gestor, new GestorLibros());
            
            menuAdmin(biblioteca, null);
            }else{
                System.out.println(ImprimirMenuUser());
            }
        }else{
            System.out.println("ta mal");
        }
    }
    public static void menuAdmin(Biblioteca biblioteca, Libro libro){
        int opcion;
        do{
            System.out.println(ImprimirMenuAdmin());
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> System.out.println();
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> {agregarLibro(biblioteca);}
                case 5 -> {eliminarLibro(biblioteca);}
                case 6 -> {
                    System.out.println("Dime el nombre de usuario");
                    String nombre = sc.nextLine();
                    System.out.println("Dime la contraseña");
                    String contrasena = sc.nextLine();
                    System.out.println("Dime el tipo de usuario");
                    String tipo = sc.nextLine();
                    if (tipo.equals("ADMIN")) {
                        biblioteca.getGestor().usuarioNuevo(new Usuarios(nombre, contrasena, TipoUsuario.ADMIN));
                    }else if (tipo.equals("USER")) {
                        biblioteca.getGestor().usuarioNuevo(new Usuarios(nombre, contrasena, TipoUsuario.USER));
                    }
                }
                case 7 -> System.out.println();
                case 8 -> System.out.println();
                case 9 -> System.out.println();
                case 10 -> System.out.println();
                case 11 -> System.out.println("Saliendo al menu principal...");
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
                            + "|  "+fBlanco+"Como quiere encontrar su libro" + reset + tVerde+"                |\n"
                            + "|                                                |\n"
                            + "|------------------------------------------------|\n"
                            + "|      1. Por Título                             |\n" 
                            + "|      2. Por Autor                              |\n"
                            + "|      3. Por categoria                          |\n"
                            + "|      4. Salir a menu                           |\n"
                            + "--------------------------------------------------\n"
                            + "Elija una opción:\n" + reset;
        return menu;
    }
    public void menuBuscarLibros(GestorLibros gestorLibros, Biblioteca biblioteca){
        int opcion;
        do{
            String busqueda = "";
            Libro menubusquedatitulo = gestorLibros.buscarLibro(busqueda);
            System.out.println(ImprimirBuscarLibros());
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> {
                    System.out.println("Dime el titulo");
                    busqueda = sc.nextLine();
                    System.out.println(busqueda);
                    if (menubusquedatitulo!=null) {
                        System.out.println(busqueda);
                    }else{
                        System.out.println("No se encontro el libro");
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();
                    Libro libro = biblioteca.getGestorLibros().buscarLibro(titulo);

                    if (libro != null) {
                        System.out.println("\nLibro encontrado:");
                        System.out.println("Título: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("Categoría: " + libro.getCategoria());
                    } else {
                        System.out.println("\nNo se encontró el libro.");
                    }
                }
                case 3 -> {
                    System.out.println("Dime el titulo");
                    busqueda = sc.nextLine();
                    gestorLibros.buscarLibro(busqueda);
                    if (gestorLibros.buscarLibro(busqueda)!=null) {
                        System.out.println();
                    }else{
                        System.out.println("No se encontro el libro");
                    }
                }
                case 4 -> System.out.println();
                default -> System.out.println("Opcion no valida");
            }
        }while(opcion !=4); 
    }

    public void mostrarTodosLibrosDisponibles(GestorLibros gestorLibros){ 
        Libro[] libros = gestorLibros.getLibrosArray(); 
    
        
        if (libros == null || libros.length == 0) {
            System.out.println("No hay libros disponibles en la biblioteca.");
            return;
        }
    
        
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (libro != null && libro.getEstado() == EstadoLibro.DISPONIBLE) {
                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Categoría: " + libro.getCategoria());
            }
        }
    }

    //NOTA: Estas 2 funciones las usaremos para el caso 4 del menu del admin

    //1
private static void agregarLibro(Biblioteca biblioteca) {
    System.out.println("Dime el titulo");
    String titulo = sc.nextLine();
    System.out.println("Dime el autor");
    String autor = sc.nextLine();
    System.out.println("Dime la categoria");
    String categoria = sc.nextLine().toUpperCase(); 

    if (esCategoriaValida(categoria)) {
        Categoria categoriaEnum = Categoria.valueOf(categoria); 
        biblioteca.getGestorLibros().nuevoLibro(new Libro(titulo, autor, categoriaEnum, EstadoLibro.DISPONIBLE));
        System.out.println("Libro agregado correctamente.");
    } else {
        System.out.println("Categoría no válida.");
    }
}

// 2
private static boolean esCategoriaValida(String categoria) {
    for (Categoria c : Categoria.values()) { 
        if (c.name().equals(categoria)) {
            return true; 
        }
    }
    return false; 
}

private static void eliminarLibro(Biblioteca biblioteca) {
    System.out.println("Dime el título del libro que deseas eliminar:");
    String titulo = sc.nextLine(); // Solo obtenemos el título sin hacer modificaciones

    // Llamamos al método del gestor de libros para eliminar el libro
    boolean eliminado = biblioteca.getGestorLibros().eliminarLibro(titulo);

    System.out.println(titulo);

    // Mostramos un mensaje dependiendo del resultado
    if (eliminado) {
        System.out.println("Libro eliminado correctamente.");
    } else {
        System.out.println("No se encontró un libro con ese título.");
    }
}



}//Cierre final
