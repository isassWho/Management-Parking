
package Controlador;

import Vista.Login;
import Vista.Pantalla_Principal_Administrador;
import Vista.Pantalla_Principal_Seguridad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Isass
 */
public class Controlador_Login implements ActionListener{
    
    Login vistaLogin;
    
    public Controlador_Login(Login vistaLogin){
    
        this.vistaLogin = vistaLogin;
        
        initComponents();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        
        // LOGIN.BotonIngresar 
        if (o == this.vistaLogin.bIngresar) {
            
            if (this.vistaLogin.campoUsuario.getText().equals("isai") && this.vistaLogin.campoContraseña.getText().equals("123")) {

                this.vistaLogin.dispose();
                Pantalla_Principal_Seguridad p = new Pantalla_Principal_Seguridad();
                Controlador_Principal_Seguridad con_seg = new Controlador_Principal_Seguridad(p);

            } else 
            if (this.vistaLogin.campoUsuario.getText().equals("carreon") && this.vistaLogin.campoContraseña.getText().equals("123")) {

                this.vistaLogin.dispose();
                Pantalla_Principal_Administrador p = new Pantalla_Principal_Administrador();
                Controlador_Principal_Administrador con_admin = new Controlador_Principal_Administrador(p);

            } else {
                JOptionPane.showMessageDialog(this.vistaLogin, "Usuario ó contraseña no válido", "Error de Autenticación", JOptionPane.ERROR_MESSAGE);
            }

            
            System.out.println("Ingresar");
            
        }
        
        
        
        
        
    }

    private void initComponents() {
        
        vistaLogin.bIngresar.addActionListener(this);
        
    }
    
    
    

}
