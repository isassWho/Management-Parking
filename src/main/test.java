
package main;

import Controlador.Controlador_Login;
import Vista.Login;

/**
 *
 * @author Isass
 */

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Login login = new Login();
        login.setVisible(true);
        Controlador_Login controlador_Login = new Controlador.Controlador_Login(login);

    }

}
