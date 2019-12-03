
package Controlador;

import Vista.Pantalla_Añadir_Usuario;
import Vista.Pantalla_Principal_Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
//            String[][] datosTabla = new String[2][2];
            String[][] datosTabla = new String[2][9];
            
            datosTabla[0][0] = "18240603";
            datosTabla[0][1] = "Drake Bell";
            datosTabla[0][2] = "7:00";
            datosTabla[0][3] = "2:00";
            datosTabla[0][4] = "kj6k4h";
            datosTabla[0][5] = "Mazda 3";
            datosTabla[0][6] = "rojo";
            datosTabla[0][0] = "2019";
            datosTabla[0][0] = "26/08/2019";
                    
            
            datosTabla[0][0] = "16241103";
            datosTabla[0][1] = "Isai";
            datosTabla[0][2] = "7:00";
            datosTabla[0][3] = "2:00";
            datosTabla[0][4] = "kj6k4h";
            datosTabla[0][5] = "tractor";
            datosTabla[0][6] = "verde";
            datosTabla[0][0] = "1978";
            datosTabla[0][0] = "26/08/2019";
                    
//            falta rellenar la tabla con los valoes que se seleccionen
//            this.vistaAdmin.tabla.
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
