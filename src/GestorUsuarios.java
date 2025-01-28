public class GestorUsuarios {
    private Usuarios [] usuarios;
    private TipoUsuario tipoUsuario;
    private static final int tam = 100;
    private int lleno;
    
    public GestorUsuarios(){
        usuarios = new Usuarios[tam];
        lleno = 0;
    }

    public void usuarioNuevo(Usuarios us){
        if(this.tipoUsuario==TipoUsuario.ADMIN){
            if (lleno<tam) {
                usuarios[lleno] = us;
                lleno++;
            }
        }else{
            System.out.println("No tienes permiso para crear un usuario.");
        }
    }

    private int buscarIndiceUsuarios(String nombre) {
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

    public static String toString(Usuarios[] arrayUsuarios){
        String stringUsuarios = "";
        for (Usuarios usuarios : arrayUsuarios) {
            stringUsuarios += usuarios.toString() + "\n";
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

}