/**
 * Representa un libro con titulo, autor y catrgoria.
 * 
 * @author Angel Villorina
 */
public class Libro {
    private String titulo;
    private String autor;
    private Categoria categoria;


    /**
     * Constructor para crear un nuevo libro.
     * 
     * @param titulo     el título del libro.
     * @param autor      el autor del libro.
     * @param categoria  la categoria del libro.
     */
    public Libro(String titulo, String autor, Categoria categoria){
            this.titulo = titulo;
            this.autor = autor;
            this.categoria = categoria;
    }

    /**
     * Devuelve el título del libro.
     * 
     * @return el título del libro.
     */
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Devuelve el autor del libro.
     * 
     * @return el autor del libro.
     */
    public String getAutor(){
        return autor;
    
    }
    /**
     * Establece el autor del libro.
     * 
     * @param autor el autor del libro.
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Devuelve la categoria del libro.
     * 
     * @return la categoria del libro.
     */
    public Categoria getCategoria(){
        return categoria;
    }

    /**
     * Establece la categoria del libro.
     * 
     * @param categoria la categoria del libro.
     */
    public void setCategorias(Categoria categoria){
        this.categoria = categoria;
    }

    /**
     * Devuelve una representación en cadena del libro.
     * 
     * @return una representación en cadena del libro.
     */
    @Override
    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nCategoria: " + categoria;
    }
}