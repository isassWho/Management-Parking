
package Controlador;

import Vista.Pantalla_Añadir_Usuario;
import Vista.Pantalla_Principal_Administrador;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Isass
 */
public class Controlador_Principal_Administrador implements ActionListener{

    Pantalla_Principal_Administrador vistaAdmin;

    public Controlador_Principal_Administrador(Pantalla_Principal_Administrador vistaAdmin) {
        
        this.vistaAdmin = vistaAdmin;
        initComponents();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object o = ae.getSource();
        
        // 
        if (o == this.vistaAdmin.botonBuscar) {
            
            System.out.println("Buscar");
            
            String rutaNoUsuario = this.vistaAdmin.campoBuscar.getText();
            ImageIcon imagen1 = new ImageIcon("src\\Recursos\\" + rutaNoUsuario + ".JPG");
            Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(this.vistaAdmin.labelUsuario.getWidth(), this.vistaAdmin.labelUsuario.getHeight(), Image.SCALE_DEFAULT));
            this.vistaAdmin.labelUsuario.setIcon(fondo1);
//            this.repaint();
            
            
        }else
        if (o == this.vistaAdmin.botonEditar) {
            
            System.out.println("Editar");
            
        }else
        if (o == this.vistaAdmin.botonGuardar) {
            
            System.out.println("Guardar");
            
        }else
        if (o == this.vistaAdmin.botonCrearUsuario) {
            
            System.out.println("Crear Usuario");
            Pantalla_Añadir_Usuario p = new Pantalla_Añadir_Usuario();
            p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            Controlador_Añadir_Usuario p2 = new Controlador_Añadir_Usuario(p);
            
        }else
        if (o == this.vistaAdmin.botonEliminarUsuario) {
            
            System.out.println("Eliminar Usuario");
            String nombreAEliminar = JOptionPane.showInputDialog(null, "Ingresa el id del usuario");
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
            switch (opcion) {
                case 1:
                    break;
                case 0:

                    JOptionPane.showMessageDialog(null, "Usuario: " + nombreAEliminar + " eliminado");

                    break;
                default:
        }
            
        }else
        if (o == this.vistaAdmin.botonVerUsuarios) {
            this.vistaAdmin.tabla.setEnabled(true);
            
            String[] ren = {"16241103", "Isai Lugo", "wsef5", "Sentra", "2017", "Blanco"};
            this.vistaAdmin.modelo.addRow(ren);
            
            System.out.println("Ver usuarios");
            
        }else
        if (o == this.vistaAdmin.botonCerrarSesion) {
            
            System.out.println("Cerrar Sesión");
            
        }
        
        
    }

    private void initComponents() {
        this.vistaAdmin.botonCerrarSesion.addActionListener(this);
        this.vistaAdmin.botonBuscar.addActionListener(this);
        this.vistaAdmin.botonCrearUsuario.addActionListener(this);
        this.vistaAdmin.botonEditar.addActionListener(this);
        this.vistaAdmin.botonEliminarUsuario.addActionListener(this);
        this.vistaAdmin.botonGuardar.addActionListener(this);
        this.vistaAdmin.botonVerUsuarios.addActionListener(this);
        
    }
    

}
