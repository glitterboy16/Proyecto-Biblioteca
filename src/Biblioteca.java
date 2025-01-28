import java.util.Scanner;
public class Biblioteca {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        GestorLibros gestor = new GestorLibros();

        gestor.nuevoLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien", Categoria.FANTASIA));
        gestor.nuevoLibro(new Libro("El código Da Vinci", "Dan Brown", Categoria.THRILLER));
        gestor.nuevoLibro(new Libro("El principito", "Antoine de Saint-Exupéry", Categoria.INFANTIL));
        gestor.nuevoLibro(new Libro("El alquimista", "Paulo Coelho", Categoria.AUTOAYUDA));
        gestor.nuevoLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", Categoria.FICCION));
        gestor.nuevoLibro(new Libro("La sombra del viento", "Carlos Ruiz Zafón", Categoria.MISTERIO));
        gestor.nuevoLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", Categoria.FANTASIA));
        gestor.nuevoLibro(new Libro("El nombre del viento", "Patrick Rothfuss", Categoria.FANTASIA));
        gestor.nuevoLibro(new Libro("1984", "George Orwell", Categoria.CIENCIA_FICCION));
        gestor.nuevoLibro(new Libro("La ladrona de libros", "Markus Zusak", Categoria.HISTORICO));
        gestor.nuevoLibro(new Libro("El retrato de Dorian Gray", "Oscar Wilde", Categoria.TERROR));
        gestor.nuevoLibro(new Libro("La insoportable levedad del ser", "Milan Kundera", Categoria.DRAMA));
        gestor.nuevoLibro(new Libro("meditaciones", "Marco Aurelio", Categoria.FILOSOFIA));
        gestor.nuevoLibro(new Libro("El arte de la guerra", "Sun Tzu", Categoria.NEGOCIOS));
        gestor.nuevoLibro(new Libro("El perfume", "Patrick Süskind", Categoria.TERROR));

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

