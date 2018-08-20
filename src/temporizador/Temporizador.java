//CREADO POR FERNANDO MARTINEZ, CARNET 1190-17-4904

package temporizador;
import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dameHora oyente = new dameHora();
        
        Timer miTemporizador = new Timer(5000,oyente);
                
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null,"!!Mira la consola, Presiona aceptar para terminar ciclo");
        
        System.exit(0);
        
    }
    
}

class dameHora implements ActionListener{

    public void actionPerformed(ActionEvent e){
     Date hora = new Date();
     System.out.println("Actualizo la hora cada 5 segundos "+ hora);
    
    }
}