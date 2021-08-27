package datos;

public class Usuario {
    public String username; // Atributos
    private String password;
    
    // Constructores -- Sobrecarga de constructores
    // Constructror por defecto o vacio o nulo
    public Usuario (){
        System.out.println("Creacion de un nuevo objeto");        
    }
    
    // Constructor con parametros
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public Usuario(String username){
        this.username = username;
        this.password = "00000000";
        this.saludar();
    }

    // default
    // public
    // private
    // protected
    
    // Metodos
    public void saludar(){
        System.out.println("Hola, mi username es: "+ this.username);
    }
    
    // Getter Setter
    
    // Setter
    public void setPassword(String pass){
        this.password = pass;
    }
    
    // Getter
    public String getPassword(){
        return this.password;
    }
    

}
