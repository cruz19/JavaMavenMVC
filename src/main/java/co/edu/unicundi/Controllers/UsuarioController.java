package co.edu.unicundi.Controllers;

import co.edu.unicundi.Models.Usuario;
import co.edu.unicundi.Views.UsuarioView;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Stiven Cruz
 * @version 1.0.0
 * @since 13/10/2020
 */
public class UsuarioController {
    /**
     * Vista a utilizar
     */
    private final UsuarioView usuarioView;
    /**
     * Modelo a utilizar
     */
    private Usuario usuario;

    /**
     * Constructor
     * @param usuarioView 
     * @param usuario
     */
    public UsuarioController(UsuarioView usuarioView, Usuario usuario) {
        this.usuarioView = usuarioView;
        this.usuario = usuario;
        initView();
    }
    
    /**
     * Se encarga de inicializar los TextField de la vista con los valores del modelo
     */
    private void initView(){
        usuarioView.getNombreTextField().setText(usuario.getNombre());
        usuarioView.getApellidoTextField().setText(usuario.getApellido());
        usuarioView.getNickTextField().setText(usuario.getNick());
        usuarioView.getCorreoTextField().setText(usuario.getCorreo());
    }
    
    /**
     * Se encarga de inicializar los eventos necesarios de la vista
     * y asignar el método que ejecutarán
     */
    public void initController(){
        usuarioView.getBtnGuardar().addActionListener((ActionEvent e) -> {
            guardarUsuario();
        });
        usuarioView.getBtnLimpiar().addActionListener((ActionEvent e) -> {
            usuario = new Usuario();
            initView();
        });
    }
    
    /**
     * Se encarga de obtener los valores de los text field y pasarlos al modelo usuario
     */
    private void guardarUsuario(){
        String nombre = usuarioView.getNombreTextField().getText().trim();
        String apellido = usuarioView.getApellidoTextField().getText().trim();
        String nick = usuarioView.getNickTextField().getText().trim();
        String correo = usuarioView.getCorreoTextField().getText().trim();
        
        if (!nombre.equals("") && !apellido.equals("") && !nick.equals("") && !correo.equals("")){
            // Actualiza los atributos del modelo con los valores de las entradas de la vista
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            usuario.setNick(nick);
            usuario.setCorreo(correo);
            
            // Imprimir modelo y mostrar mensaje de guardado
            System.out.println(usuario);
            JOptionPane.showMessageDialog(null, 
                "Nombre: " + usuario.getNombre() + "\n" +
                "Apellido: " + usuario.getApellido() + "\n" +
                "Nick: " + usuario.getNick() + "\n" +
                "Correo: " + usuario.getCorreo(),
                "Guardado!",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
