public class Usuarios {
    private String nombreUsuario;
    private String contraseña;
    private TipoUsuario tipoUsuario;
    


    public Usuarios() {
        nombreUsuario = "Manuel";
        contraseña = "123456789";
        tipoUsuario = TipoUsuario.USER;
    }


    public Usuarios(String nombreUsuario, String contraseña, TipoUsuario tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
                " titulo='" + getNombreUsuario() + "'" +
                ", autor='" + getContraseña() + "'" +
                ", generoMusical='" + getTipoUsuario() + "'" +
                "}";
    }
    
}
