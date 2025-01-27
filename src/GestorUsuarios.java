public class GestorUsuarios {
    private Usuarios [] usuarios;
    private TipoUsuario tipoUsuario;
    private static final int tam = 100;
    private int lleno;
    
    public GestorUsuarios(){
        usuarios = new Usuarios[tam];
        lleno = 0;
    }

    public void usuarioNuevo(){
        if(this.tipoUsuario==TipoUsuario.ADMIN){
            System.out.println(usuarios);
            for (int i = 0; i < usuarios.length; i++) {
                
            }
        }else{
            System.out.println("No tienes permiso para crear un usuario.");
        }
    }

    public static void consultaUsuarios(){
        
    }

}
