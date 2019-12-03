
package Controlador;

import Vista.Pantalla_Principal_Seguridad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Isass
 */
public class Controlador_Principal_Seguridad implements ActionListener{

    Pantalla_Principal_Seguridad vistaSeguridad;

    public Controlador_Principal_Seguridad(Pantalla_Principal_Seguridad vistaSeguridad) {
        
        this.vistaSeguridad = vistaSeguridad;
        
        initComponents();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        
        if (o == this.vistaSeguridad.botonBuscar) {
            System.out.println("Buscando");
        }else if (o ==this.vistaSeguridad.botonCerrarSesion) {
            System.out.println("Cerrando sesión");
        }
        
        
    }

    private void initComponents() {
        
        this.vistaSeguridad.botonBuscar.addActionListener(this);
        this.vistaSeguridad.botonCerrarSesion.addActionListener(this);
        
    }
    

}
