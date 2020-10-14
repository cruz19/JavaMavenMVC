package co.edu.unicundi.Models;

/**
 * @author Steven Cruz
 * @version 1.0.0
 * since 13/10/2020
 */
public class Usuario {
    /**
     * Nombre del usuario
     */
    private String nombre;
    /**
     * Apellido del usuario
     */
    private String apellido;
    /**
     * Nick del usuario
     */
    private String nick;
    /**
     * Correo electrónico del usuario
     */
    private String correo;

    /**
     * Constructor
     * @param nombre
     * @param apellido
     * @param nick
     * @param correo
     */
    public Usuario(String nombre, String apellido, String nick, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.correo = correo;
    }
    
    /**
     * Constructor vacío (requisito de un Java Bean)
     */
    public Usuario(){
    }

    /**
     * Se encarga de retornar el nombre del usuario
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Se encarga de modificar el nombre del usuario
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Se encarga de retornar el apellido del usuairo
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Se encarga de modificar el apellido del usuario
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Se encarga de retornar el nick del usuario
     * @return 
     */
    public String getNick() {
        return nick;
    }

    /**
     * Se encarga de modificar el nick del usuario
     * @param nick 
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Se encarga de retornar el correo del usuario
     * @return 
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Se encarga de modificar el correo del usuario
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", correo=" + correo + '}';
    }
}
