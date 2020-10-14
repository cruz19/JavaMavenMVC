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
    }
    
    /**
     * Se encarga de obtener los valores de los text field y pasarlos al modelo usuario
     */
    private void guardarUsuario(){
        // Actualiza los atributos del modelo con los valores de las entradas de la vista
        usuario.setNombre(usuarioView.getNombreTextField().getText().trim());
        usuario.setApellido(usuarioView.getApellidoTextField().getText().trim());
        usuario.setNick(usuarioView.getNickTextField().getText().trim());
        usuario.setCorreo(usuarioView.getCorreoTextField().getText().trim());
        
        // Imprimir modelo y mostrar mensaje de guardado
        System.out.println(usuario);
        JOptionPane.showMessageDialog(null, "Usuario guardado!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
        // Limpiar
        usuarioView.limpiarTextFields();
    }
}
