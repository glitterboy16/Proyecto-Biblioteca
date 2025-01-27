public class GestorUsuarios {
    private Usuarios [] usuarios;
    private TipoUsuario tipoUsuario;
    private Usuarios nuevo = new Usuarios();


    public void usuarioNuevo(){
        if(this.tipoUsuario==TipoUsuario.ADMIN){
            System.out.println(nuevo);
            for (int i = 0; i < usuarios.length; i++) {
                usuarios[i] = nuevo;
            }
        }else{
            System.out.println("No tienes permiso para crear un usuario.");
        }
    }

    public static void consultaUsuarios(){
        
    }

}
