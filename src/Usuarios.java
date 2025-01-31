public class Usuarios {
    private String nombreUsuario;
    private String contrasena;
    private TipoUsuario tipoUsuario;
    private int numeroDePrestamos;
    

    public Usuarios() {
        nombreUsuario = "Manuel";
        contrasena = "1234";
        tipoUsuario = TipoUsuario.ADMIN;
        this.numeroDePrestamos = 0;
        
    }

    public Usuarios(String nombreUsuario, String contraseña, TipoUsuario tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "{" +
                " Nombre='" + getNombreUsuario() + "'" +
                ", Contraseña='" + getContrasena() + "'" +
                ", TipoUsuario='" + getTipoUsuario() + "'" +
                "}";
    }

    public int getNumeroDePrestamos() {
        return numeroDePrestamos;
    }

    public void incrementarPrestamos() {
        this.numeroDePrestamos++;
    }

    public void decrementarPrestamos() {
        if (this.numeroDePrestamos > 0) {
            this.numeroDePrestamos--;
        }
    }
    
}
