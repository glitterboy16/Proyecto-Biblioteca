
import java.util.Arrays;

/**
 * Clase que gestiona la colecion de libros.
 * 
 * @author Angel Villorina
 */
public class GestorLibros {

    private Libro [] libros;
    private int lleno;
    private static final int capacidad = 100;

    /**
     * Este Constructor que inicializa el gestor con un tamaño máximo predeterminado.
     */
    public GestorLibros(){
        libros = new Libro[capacidad];
        lleno = 0;
    }

        /**
     * Añade un nuevo libro al gestor.
     * 
     * @param l el libro a añadir.
     */
    public void nuevoLibro(Libro l){
        if(lleno < capacidad){
            libros[lleno] = l;
            lleno++;
        }else{
            System.out.println("No se pueden añadir más libros.");
        }
    }

        /**
     * Busca el índice de un libro por título.
     * 
     * @param titulo el título de el libro que se busca.
     * @return el índice de el libro, -1 si no se encuentra.
     */
    private int buscarIndiceLibro(String titulo) {
        int buscar = -1;
        for (int i = 0; i < lleno && buscar == -1; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                buscar = i;
            }
        }
        return buscar;
    }

    /**
     * Busca canciones por categorial.
     * 
     * @param Categoria la categoria de los libros a buscar.
     * @return un array de libros de la categoria.
     */
    public Libro[] buscarPorGenero(Categoria categoria) {
        Libro[] resultado = new Libro[capacidad];
        int categoriaLleno = 0;
        for (int i = 0; i < lleno; i++) {
            if (libros[i].getCategoria().equals(categoria)) {
                resultado[categoriaLleno] = libros[i];
                categoriaLleno++;
            }
        }
        return Arrays.copyOf(resultado, categoriaLleno);
    }

        /**
     * Busca una libro por título.
     * 
     * @param titulo el título de el libro que se busca.
     * @return el libro encontrado, o null si no se encuentra.
     */
    public Libro buscarLibro(String titulo) {
        Libro buscar = null;
        int indice = buscarIndiceLibro(titulo);
        if (indice != -1) {
            buscar = libros[indice];
        }
        return buscar;
    }

        /**
     * Busca libros por autor.
     * 
     * @param autor el autor de los libros a buscar.
     * @return un array de libros del autor.
     */
    public Libro[] buscarPorAutor(String autor) {
        Libro[] resultado = new Libro[capacidad];
        int autorLleno = 0;
        for (int i = 0; i < lleno; i++) {
            if (libros[i].getAutor().equals(autor)) {
                resultado[autorLleno] = libros[i];
                autorLleno++;
            }
        }
        return Arrays.copyOf(resultado, autorLleno);
    }

        /**
     * Elimina un libro por título.
     * 
     * @param titulo el título del libro a eliminar.
     * @return true si el libro se eliminó correctamente, false en caso contrario.
     */
    public boolean eliminarLibro(String titulo) {
        int indice = buscarIndiceLibro(titulo);
        if (indice != -1) {
            for (int i = indice; i < lleno - 1; i++) {
                libros[i] = libros[i + 1];
            }
            libros[--lleno] = null;      
            return true;
        } else {
            return false;
        }
    }

        /**
     * Actualiza un libro ya existente.
     * 
     * @param titulo      el título del libro a actualizar.
     * @param actualizado la nueva información del libro.
     * @return true si el libro se actualizó correctamente, false en caso contrario.
     */
    public boolean actualizarLibro(String titulo, Libro actualizado) {
        int indice = buscarIndiceLibro(titulo);
        if (indice != -1) {
            libros[indice] = actualizado;
            return true;
        } else {
            return false;
        }
    }

        /**
     *  Devuelve un array de libros como string
     */
    public static String toString(Libro[] arrayLibro){
        String stringLibro = "";
        for (Libro libro : arrayLibro) {
            stringLibro += libro.toString() + "\n";
        }
        return stringLibro;
    }

        /**
     *  Devuelve los libros como string
     */
    @Override
    public String toString(){
        String stringLibro = "";
        for (int i = 0; i < lleno; i++) {
            stringLibro += libros[i].toString() + "\n";
        }
        return stringLibro;
    }

    /**
     * Devuelve el array de libros.
     * 
     * @return el array de libros.
     */
    public Libro[] getLibrosArray() {
        return Arrays.copyOf(libros, lleno); // Devuelve una copia del array sin espacios nulos
    }
}
