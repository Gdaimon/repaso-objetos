package repasoobjetos;

import datos.Usuario;

public class RepasoObjetos {

       
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.username = "Spiderman";
        // usuario.password = "999999";
        //usuario.setPassword("999999");
        
        System.out.println(usuario.username);
        // System.out.println(usuario.password);
        System.out.println(usuario.getPassword());
        System.out.println(usuario);
        usuario.saludar();
        
        Usuario batman = new Usuario("Batman");
        System.out.println(batman.username);
        System.out.println(batman.getPassword());
        System.out.println(batman);
        
        usuario = batman;
        usuario.username = batman.username;
        System.out.println("Variable usuario: " + usuario.username);
        batman.username="Bruce Wayne";
        System.out.println("Variable batman: " + batman.username);
        System.out.println(batman);
        System.out.println("Variable usuario: " + usuario.username);
        System.out.println(usuario);
        
        
    }
    
}
