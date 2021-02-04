/*
 * En el presente código mostraremos las diferentes formas de mostrar un mensaje al usuario
 */
package hola.mundo;
// Importamos la libreria para utilizar las ventanas emergentes de JOptionPane
import javax.swing.JOptionPane;

public class HolaMundo {

    public static void main(String[] args) {
        // En la siguiente linea mostramos el mensaje directo en la consola
        System.out.println("Hola Mundo");
        
        //Mostrando en una ventana emergente de JOptionPane
        JOptionPane.showMessageDialog(null, "Hola Mundo");
    }
    
}
/*
* La finalidad de este código es ver las formas de mostrar un mensaje al usuario y así el
desarrollador realice un programa con estas bases.
*/