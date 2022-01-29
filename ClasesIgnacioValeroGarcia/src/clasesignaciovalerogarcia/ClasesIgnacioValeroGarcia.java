package clasesignaciovalerogarcia;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author navag
 */
public class ClasesIgnacioValeroGarcia {

    public static void main(String[] args) {

        VentanaNombreEdad();

    }
  public static void usoString() {
        String nombre = "Ignacio Valero Garcia";
        int numcaracteres = nombre.length(); // numero de caracteres
        char carac1 = nombre.charAt(0);// caracter en la posicion 0
        char carac2 = nombre.charAt(nombre.length() - 1); // caracteres en la ultima posicio (char tiene posicion 0 metodo length() empieza a contar desde 1)
        String soloNombre = nombre.substring(0, 7);
        String ultApellido = nombre.substring(15, nombre.length());
        String nombrecambio = nombre.replace("a", "_"); // remplaza a por _

        System.out.println("Numero de caracteres: " + numcaracteres);
        System.out.println("primer caracter: " + carac1 + " ultimo caracter: " + carac2);
        System.out.println("Solo nombre:" + soloNombre);
        System.out.println("ultimo Apellido:" + ultApellido);
        System.out.println("Remplazar a por _ :" + nombrecambio);
    }

    public static void VentanaNombreEdad() {

        // usoString();
        String[] botones = {"Por defecto", "Con parametros"};
        //JOptionPane.showConfirmDialog(null, "opcion1");
        //int ventan2 = JOptionPane.showOptionDialog(null, "Eligir constructor", "ejercicio 2",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);
        int ventana = JOptionPane.showOptionDialog(null, "Eligir constructor", "ejercicio 2", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

        try {
            NombreApellidos alu1 = new NombreApellidos();

            //NombreApellidos alu2 = new NombreApellidos("Juan Sanchez Rodriguez", 200);
            //System.out.println("Constructor por defecto");
            switch (ventana) {
                case 0:
                    JOptionPane.showMessageDialog(null, "vamos a usar el constructor por defecto");
                    alu1.SetNombre(JOptionPane.showInputDialog("Introduce tu nombre"));
                    alu1.SetEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:")));
                    JOptionPane.showMessageDialog(null, "Nombre: " + alu1.GetNombre() + "\nEdad: " + alu1.GetEdad());
                    break;
                // System.out.println("Nombre: "+alu1.GetNombre()+"\nEdad: "+alu1.GetEdad());
                //System.out.println("Constructor con parametros");
                case 1:
                    JOptionPane.showMessageDialog(null, "Vamos a usar el constructor con Parametros");
                    NombreApellidos alu2 = new NombreApellidos(JOptionPane.showInputDialog("Introduce tu nombre:"), Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad")));
                    JOptionPane.showMessageDialog(null, "Nombre: " + alu2.GetNombre() + "\nEdad: " + alu2.GetEdad());

                    break;
                default:
                    break;
            }
        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(null, "la cagaste pon bien la edad \n Volvemos a empezar");
            VentanaNombreEdad();
        }
        //System.out.println("Nombre: "+alu2.GetNombre()+"\nEdad: "+alu2.GetEdad());
        //NombreApellidos.ayuda();
        //usoString();

    }

}
