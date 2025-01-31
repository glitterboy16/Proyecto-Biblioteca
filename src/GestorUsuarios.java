import java.util.Arrays;

public class GestorUsuarios {
    private static Usuarios [] usuarios;
    private static final int tam = 100;
    private static int lleno;
    
    public GestorUsuarios(){
        usuarios = new Usuarios[tam];
        lleno = 0;
    }

    public void usuarioNuevo(Usuarios us){
        if (lleno<tam) {
            usuarios[lleno] = us;
            System.out.println("Se ha añadidido user"+ usuarios[lleno].getNombreUsuario());
            lleno++;
        }
    }

    public int buscarIndiceUsuarios(String nombre) {
        int buscar = -1;
        for (int i = 0; i < lleno && buscar == -1; i++) {
            if (usuarios[i].getNombreUsuario().equals(nombre)) {
                buscar = i;
            }
        }
        return buscar;
    }
    public Usuarios buscarNombreUsuario(String nombre) {
        Usuarios buscar = null;
        int indice = buscarIndiceUsuarios(nombre);
        if (indice != -1) {
            buscar = usuarios[indice];
        }
        return buscar;
    }
    public Usuarios[] buscarPorTipo(TipoUsuario tipo) {
        Usuarios[] result = new Usuarios[tam];
        int tamTipo = 0;
        for (int i = 0; i < lleno; i++) {
            if (usuarios[i].getTipoUsuario().equals(tipo)) {
                result[tamTipo] = usuarios[i];
                tamTipo++;
            }
        }
        return Arrays.copyOf(result, tamTipo);
    }
    public Usuarios inicioSesionUsuarios(String nombreUsuario, String contrasena){
        Usuarios usuario = buscarNombreUsuario(nombreUsuario);
        if(usuario != null && usuario.getContrasena().equals(contrasena)){
            return usuario;
        }
        return null;
    }

    public static String toString(Usuarios[] arrayUsuarios) {
        String stringUsuarios = "";
        for (Usuarios usuario : arrayUsuarios) {
            // Concatenar solo la información que deseas mostrar
            stringUsuarios += "Nombre: " + usuario.getNombreUsuario() + 
                              ", Tipo: " + usuario.getTipoUsuario() + "\n";
        }
        return stringUsuarios;
    }

    @Override
    public String toString() {
        String stringUsuarios = "";
        for (int i = 0; i < lleno; i++) {
            stringUsuarios += usuarios[i].toString() + "\n";
        }
        return stringUsuarios;
    }

    public Usuarios[] getUsuariosArray() {
        return Arrays.copyOf(usuarios, lleno); 
    }

    public void masPrestamosUsu(Usuarios[] usuarios){
        for (int i = 0; i < usuarios.length; i++) {
            for (int j = 0; j < usuarios.length-i; j++) {
                if (usuarios[j].getNumeroDePrestamos() < usuarios[j+1].getNumeroDePrestamos()) {
                    Usuarios aux = usuarios[j];
                    usuarios[j] = usuarios[j+1];
                    usuarios[j+1] = aux;
                }
            }
        }
    }


}