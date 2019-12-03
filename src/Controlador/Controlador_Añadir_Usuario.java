
package Controlador;

import Vista.Pantalla_Añadir_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author Isass
 */
public class Controlador_Añadir_Usuario implements ActionListener, CaretListener {

    Pantalla_Añadir_Usuario vista;

    public Controlador_Añadir_Usuario(Pantalla_Añadir_Usuario vista) {
        this.vista = vista;
        
        this.vista.botonGuardarUsuario.addActionListener(this);
        
        this.vista.campoNoControl.addActionListener(this);
        
        this.vista.campoNoControl.addCaretListener(this);
        this.vista.campoNombre.addCaretListener(this);
        this.vista.campoHoraEntrada.addCaretListener(this);
        this.vista.campoHoraSalida.addCaretListener(this);
        this.vista.campoPlaca.addCaretListener(this);
        this.vista.campoModelo.addCaretListener(this);
        this.vista.campoColor.addCaretListener(this);
        this.vista.campoAño.addCaretListener(this);
        this.vista.campoFechaPago.addCaretListener(this);
        
        this.vista.campoNoControl.setText("");
        this.vista.campoNombre.setText("");
        this.vista.campoHoraEntrada.setText("");
        this.vista.campoHoraSalida.setText("");
        this.vista.campoPlaca.setText("");
        this.vista.campoModelo.setText("");
        this.vista.campoColor.setText("");
        this.vista.campoAño.setText("");
        this.vista.campoFechaPago.setText("");
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         JOptionPane.showMessageDialog(vista, "evento action");
        System.out.println("Guardar Usuario");
        
    }

    @Override
    public void caretUpdate(CaretEvent ce) {
        
        if (this.vista.campoNoControl.getText().equals("") || this.vista.campoNombre.getText().equals("") || 
            this.vista.campoHoraEntrada.getText().equals("") || this.vista.campoHoraSalida.getText().equals("") || 
            this.vista.campoPlaca.getText().equals("") || this.vista.campoModelo.getText().equals("") || 
            this.vista.campoColor.getText().equals("") || this.vista.campoAño.getText().equals("") || 
            this.vista.campoFechaPago.getText().equals("")) {
            
            this.vista.botonGuardarUsuario.setEnabled(false);
            
        }else{
            this.vista.botonGuardarUsuario.setEnabled(!false);
        }
        
        
    }

}
