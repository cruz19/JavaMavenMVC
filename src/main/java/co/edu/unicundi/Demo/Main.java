package co.edu.unicundi.Demo;

import co.edu.unicundi.Controllers.UsuarioController;
import co.edu.unicundi.Models.Usuario;
import co.edu.unicundi.Views.UsuarioView;

/**
 * Main
 * @author Stiven Cruz
 * @version 1.0.0
 * @since 13/10/2020
 */
public class Main {
    public static void main(String[] args) {
        // Crear modelo
        Usuario usuario = new Usuario("Stiven", "Cruz", "cruz19", "cruzyhon6@gmail.com");
        // Crear vista
        UsuarioView usuarioView = new UsuarioView("MVC");
        usuarioView.setLocationRelativeTo(null);
        usuarioView.setVisible(true);
        // El controlador recibe los eventos de entrada de la vista y actua sobre el modelo
        UsuarioController controller = new UsuarioController(usuarioView, usuario);
        controller.initController();
    }
}
