
package Controlador;

import Vista.Pantalla_Principal_Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            
        }else
        if (o == this.vistaAdmin.botonEliminarUsuario) {
            
            System.out.println("Eliminar Usuario");
            
        }else
        if (o == this.vistaAdmin.botonVerUsuarios) {
            
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
